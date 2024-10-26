""" 258-分糖果 II

"""

from typing import List


def distributeCandies(candies: int, num_people: int) -> List[int]:
    ans = [0] * num_people
    i = 0
    n = 1
    while n < candies:
        ans[i % num_people] += n
        candies -= n
        n += 1
        i += 1

    ans[i % num_people] += candies
    return ans
