""" 7-无重复字符的最长子串

    这个问题的最佳题解可能跟动态规划算法相关，暂时还没有考虑清楚。以后有更好的想法了再优化。
"""


def length_of_longest_substring(s: str) -> int:
    """ 计算 最长子串 的长度函数

        对序列进行了一次遍历，时间复杂度接近于 O(n)
        使用字典结构辅助计算，假定字典存取的复杂的是 O(1)
    """

    longest = 0  # 存储最长不重复子串长度
    count = 0  # 统计当前不重复长度
    repeat_index = 0  # 最新不重复下标

    chars = dict()
    for i, v in enumerate(s):
        # 发现重复字符，重复字符上次下标必须大于等于最新不重复下标。
        # 不重复长度更新为与上次下标的差值
        if v in chars and chars[v] >= repeat_index:
            count = i - chars[v]
            repeat_index = chars[v] + 1  # 最新不重复下标更新为 上次重复下标 + 1
        else:
            count += 1

        if count > longest:
            longest = count

        chars[v] = i  # 更新字符下标

    return longest
