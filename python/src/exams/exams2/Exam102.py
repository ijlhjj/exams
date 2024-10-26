""" 102-宝石补给

"""

from typing import List


def giveGem(gem: List[int], operations: List[List[int]]) -> int:
    for x, y in operations:
        n = gem[x] // 2
        gem[x] -= n
        gem[y] += n

    return max(gem) - min(gem)
