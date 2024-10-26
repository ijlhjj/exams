""" 174-移除石子使总数最小

"""

from bisect import insort
from math import ceil
from typing import List


def minStoneSum(piles: List[int], k: int) -> int:
    piles.sort()

    for i in range(k):
        num = piles.pop()
        num = ceil(num / 2)
        insort(piles, num)

    return sum(piles)
