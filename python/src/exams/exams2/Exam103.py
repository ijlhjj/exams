""" 103-与车相交的点

"""

from typing import List


def numberOfPoints(nums: List[List[int]]) -> int:
    c = 0

    for i in range(1, 101):
        for pair in nums:
            if pair[0] <= i <= pair[1]:
                c += 1
                break

    return c
