""" 38-最长合法子字符串的长度

"""

from typing import List


def longest_valid_substring(word: str, forbidden: List[str]) -> int:
    """ 计算 最长合法子字符串 的长度

    :param word: 查找字符串
    :param forbidden: 禁止出现序列列表
    :return: 最长合法子字符串 的长度
    """

    # 禁止列表存在重复值，使用集合去重，减少后续处理次数
    forbidden_set = set(forbidden)

    char_set = set(word)

    # 禁止列表中的单字符集合
    forbidden_char_set = {s for s in forbidden_set if len(s) < 2}

    # 经过缩减后的禁止列表，用作后续分隔循环处理。初始设置为单字符列表
    forbidden_list = list(forbidden_char_set)

    # 对长禁止列表中包含单禁止字符列表的进行排除
    # 分隔时不包含单字符 禁止序列 的不可能包含有此单字符的多字符序列
    # 如禁止列表中有 'a'，则不需要再处理 'ab' 'abc' 这样的序列
    for s in forbidden_set:
        flag = False
        c_set = set(s)

        # 如果 禁止序列 包含不在 查找字符串 中的字符，其不可能在 查找字符串 中找到，不需要处理。
        # 这个处理加快了 word 只包含少量相同字符的长输入的处理速度。如 'a...a' （长度大于 10000），这种输入对包含 非'a' 字符的 禁止列表（'ab') 不需要处理。
        # 长序列中找到单字符，设置旗标为 True
        if (not (c_set <= char_set)) or (c_set & forbidden_char_set):
            flag = True

        # 旗标为 True 的不需要再处理
        if not flag:
            forbidden_list.append(s)

    # 对处理后的列表按长度由长到短排序。基于一个假设：短的字符串更常出现。这样可以减少外循环的次数。
    forbidden_list.sort(key=len, reverse=True)

    ####
    # 以上处理全部为缩减禁止列表，减少下面的循环次数
    ####

    # 循环处理禁止列表，按禁止列表分隔字符串。
    # 分隔方式为每次分隔的前半部分为禁止序列减少最后 1 个字符，后半部分为禁止字符减少第 1 个字符。
    # 如禁止序列为 'abc'，查找到此序列后，前半部分为 '...ab' ，后半部分为 'bc...' ，则分隔后的子序列都不再包含 'abc' 。
    word_list = {word}
    for f in forbidden_list:
        prefix = f[:-1]  # 当前禁止序列减 1 个字符
        words = []
        # 循环字符串分隔后的列表
        for w in word_list:
            start = 0
            index = w.find(f, start)  # 查询下一个禁止序列位置

            if index == -1:
                # 不存在禁止序列整体加入字符分隔列表
                words.append(w)
            else:
                # 存在禁止序列循环分隔
                while index != -1:
                    # 每次循环加入前半部分 即 '...ab'
                    words.append(w[start: index] + prefix)
                    # 从下一个位置继续查找
                    start = index + 1
                    index = w.find(f, start)

                # 最后加入后半部分，即 'bc...'
                words.append(w[start:])

        word_list = words.copy()  # 每次更新分隔字符列表

    # 全部分隔完后的最长字符串长度即为 最长合法子字符串 的长度
    longest = 0
    for w in word_list:
        lw = len(w)
        if lw > longest:
            longest = lw

    return longest
