""" 47-数组拆分

"""

from typing import List


def array_pair_sum(nums: List[int]) -> int:
    nums.sort()

    i = 0
    min_sum = 0
    while i < len(nums):
        min_sum += nums[i]
        i += 2

    return min_sum
