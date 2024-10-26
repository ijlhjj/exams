""" 337-构成整天的下标对数目 I

"""

from typing import List


def countCompleteDayPairs(hours: List[int]) -> int:
    n = len(hours)
    c = 0

    for i in range(n - 1):
        for j in range(i + 1, n):
            if (hours[i] + hours[j]) % 24 == 0:
                c += 1

    return c
