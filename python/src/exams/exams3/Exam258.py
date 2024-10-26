""" 258-分糖果

"""

from typing import List


def distributeCandies(candyType: List[int]) -> int:
    half = len(candyType) // 2
    diffEle = len(set(candyType))
    return min(half, diffEle)
