""" 172-找到冠军 I

"""

from typing import List


def findChampion(grid: List[List[int]]) -> int:
    for i in range(len(grid)):
        if grid[i].count(0) == 1:
            return i

    return -1
