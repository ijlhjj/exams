""" 337-构成整天的下标对数目 II

"""

from collections import defaultdict
from typing import List


def countCompleteDayPairs(hours: List[int]) -> int:
    # 等差数列求和
    def sumOfSequence(num: int) -> int:
        return (1 + num) * num // 2

    # 统计 各输入值 与 24 求模 后的余数
    counter = defaultdict(int)
    for h in hours:
        rem = h % 24
        counter[rem] += 1

    c = 0

    # 1 - 11 的匹配组合为 2 个数和为 24 的数量求积
    for n in range(1, 12):
        if n in counter and (24 - n) in counter:
            c += (counter[n] * counter[24 - n])

    # 0 的匹配组合为 数量-1 的等差数列和
    if 0 in counter and counter[0] > 1:
        c += sumOfSequence((counter[0] - 1))

    # 12 的匹配组合为 数量-1 的等差数列和
    if 12 in counter and counter[12] > 1:
        c += sumOfSequence((counter[12] - 1))

    return c
