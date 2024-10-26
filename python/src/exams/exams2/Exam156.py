""" 156-可获得的最大点数

"""

import sys
from typing import List

# 使用字典缓存避免递归的重复计算
maxScoreDict = {}


def maxScore(cardPoints: List[int], k: int) -> int:
    sys.setrecursionlimit(10 ** 5)  # 递归深度默认限制 1000
    return maxSubScore(cardPoints, 0, len(cardPoints) - 1, k)


def maxSubScore(cardPoints: List[int], left: int, right: int, k: int) -> int:
    # 基准条件
    if k == 1:
        return max(cardPoints[left], cardPoints[right])

    # 缓存命中直接返回
    key = (left, right, k)
    if key in maxScoreDict:
        return maxScoreDict[key]

    maxFirst = cardPoints[left] + maxSubScore(cardPoints, left + 1, right, k - 1)  # 包含头元素最大
    maxLast = cardPoints[right] + maxSubScore(cardPoints, left, right - 1, k - 1)  # 包含尾元素最大

    # 加入缓存
    maxScores = max(maxFirst, maxLast)
    maxScoreDict[key] = maxScores

    return maxScores
