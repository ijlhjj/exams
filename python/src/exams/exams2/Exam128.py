""" 128-H 指数

"""

from bisect import bisect_left

from typing import List


def hIndex(citations: List[int]) -> int:
    citations.sort()

    size = len(citations)
    h = 0
    for i in range(1001):
        index = bisect_left(citations, i)
        if size - index < i:
            break
        h = i

    return h
