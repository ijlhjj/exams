""" 330-求出出现两次数字的 XOR 值

"""

from typing import List


def duplicateNumbersXOR(nums: List[int]) -> int:
    res = 0

    numSet = set()

    for n in nums:
        if n in numSet:
            res = res ^ n
        else:
            numSet.add(n)

    return res
