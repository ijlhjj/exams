""" 81-数组中重复的数字

"""

from typing import List


def find_repeat_number(nums: List[int]) -> int:
    num_set = set()

    for n in nums:
        if n in num_set:
            return n

        num_set.add(n)
