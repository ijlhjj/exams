""" 82-在排序数组中查找元素的第一个和最后一个位置

"""

from bisect import *
from typing import List


def search_range(nums: List[int], target: int) -> List[int]:
    # 空列表会返回 0
    i = bisect_left(nums, target)
    if i == len(nums) or nums[i] != target:
        return [-1, -1]

    j = bisect_right(nums, target)
    return [i, j - 1]
