""" 31-合法分割的最小下标

"""

import collections
from typing import List


def minimum_index(nums: List[int]) -> int:
    """ 按题目要求计算合法分割的最小下标 """

    # 使用 Counter 统计获取 支配元素 和出现频次 freq(x)
    num_count = collections.Counter(nums)
    item = num_count.most_common(1).pop()

    key = item[0]  # 支配元素
    count = item[1]  # freq(x)

    # 遍历数组查找符合题目要求的最小下标
    left_count = 0
    len_nums = len(nums)
    for i in range(len_nums):
        # 支配元素 在左子数组出现的频次
        if nums[i] == key:
            left_count += 1

        # 两边数组都符合题目的合法分割时（freq(x) * 2 > len），返回下标 i
        if left_count * 2 > i + 1:
            c_right = count - left_count  # 右子数组的出现频次 等于 总频次 - 左子数组频次
            if c_right * 2 > len_nums - (i + 1):
                return i

    # 如果合法分割不存在，返回 -1
    return -1
