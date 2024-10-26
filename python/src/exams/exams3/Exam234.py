""" 234-正整数和负整数的最大计数

"""

from bisect import bisect_left, bisect_right
from typing import List


def maximumCount(nums: List[int]) -> int:
    left = bisect_left(nums, 0)
    right = bisect_right(nums, 0)
    return max(left, len(nums) - right)
