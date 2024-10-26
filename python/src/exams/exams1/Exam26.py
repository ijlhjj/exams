""" 26-使数组中所有元素都等于零

"""

from typing import List


def minimum_operations(nums: List[int]) -> int:
    """ 最少 操作次数使数组中所有元素都等于零 """

    # 使用set辅助统计，有多少不同的值则至少需要多少次操作，不包括0
    nums_set = set(nums)
    size = len(nums_set)

    # 如果有 0 ，则操作次数 -1
    if 0 in nums_set:
        return size - 1

    return size
