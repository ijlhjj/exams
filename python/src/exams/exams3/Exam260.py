""" 260-救生艇

"""

from bisect import bisect_right
from typing import List


def numRescueBoats(people: List[int], limit: int) -> int:
    # 排序以方便后续处理
    people.sort()

    c = 0  # 所需船数

    # 数组不为空时循环处理
    while people:
        c += 1  # 船数加1

        # 优先载体重最大的人
        v = people[-1]
        del people[-1]
        v = limit - v

        # 可以时再载第2个人
        i = bisect_right(people, v)
        if i > 0:
            del people[i - 1]

    return c
