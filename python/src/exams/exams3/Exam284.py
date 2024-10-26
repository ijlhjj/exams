""" 284-双模幂运算

"""

from typing import List


def getGoodIndices(variables: List[List[int]], target: int) -> List[int]:
    indexs = []

    for i, var in enumerate(variables):
        a, b, c, m = var
        n = (((a ** b) % 10) ** c) % m  # 按题目要求计算双模幂
        if n == target:
            indexs.append(i)

    return indexs
