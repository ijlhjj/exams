""" 22-将字符串分割为最少的美丽子字符串

"""


def minimum_beautiful_substrings(s: str) -> int:
    """统计分隔为最少 “美丽” 字符串数量

    :param s:  1 <= s.length <= 15
               s[i] 要么是 '0' 要么是 '1'
    :return:   分割后的子字符串的 最少 数目
    """

    # 存放5的幂的二进制字符串列表
    # 不超过题目限定的15位长度的是 5**7 。这里由代码判断，不再人工强制限定。
    bin_list = [f'{(5 ** x):b}' for x in range(10) if len(f'{(5 ** x):b}') <= len(s)]

    # 倒序列表，优先查找长度更长的幂的二进制字符串
    bin_list.reverse()

    count = 0
    flag = False  # 发现前导空格标识

    def count_beautiful_substrings(sub_str: str):
        """ 统计 “美丽” 字符串 的内部函数 """
        nonlocal count
        nonlocal flag

        # 前导空格标识为真时不再继续处理，最终结果为 -1
        if flag:
            return

        # 发现前导空格为 '0'，设置旗标
        if sub_str.startswith('0'):
            flag = True
            return

        # 空字符串 '' 不处理
        if sub_str:
            bin_str = find_beautiful_substrings(sub_str)

            if bin_str:
                # 找到 “美丽” 字符串，加入结果集，并用找到的字符串进行 1 次分隔
                count += 1
                sub_list = sub_str.split(bin_str, 1)
                for sub in sub_list:
                    # 遍历分隔后的非空字符串，递归查找
                    if sub:
                        count_beautiful_substrings(sub)

    def find_beautiful_substrings(sub_str: str) -> str:
        """ 查找字符串中的最长 “美丽” 字符串 """
        for bin_str in bin_list:
            index = sub_str.find(bin_str)
            # 不包含前导 0
            if index != -1 and (index == 0 or sub_str[index - 1] != '0'):
                return bin_str

        return ''

    count_beautiful_substrings(s)  # 调用函数查找所有 “美丽” 字符串

    # 没有发现 “美丽” 字符串，返回 -1
    if flag:
        return -1

    return count
