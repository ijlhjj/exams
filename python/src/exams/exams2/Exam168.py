""" 168-使用最小花费爬楼梯

"""

from functools import lru_cache
from typing import List


def minCostClimbingStairs(cost: List[int]) -> int:
    # 在最后添加一个0元素避免递归中的特殊处理
    cost.append(0)

    # lru_cache 用字典进行缓存，所有参数作为 key 值，所以 key 必须是不可变的
    costTuples = tuple(cost)

    return minCost(costTuples, len(cost) - 1)


@lru_cache(maxsize=1000)
def minCost(cost: tuple[int], index: int) -> int:
    # 可以选择从下标为 0 或下标为 1 的台阶开始爬楼梯
    if index < 2:
        return cost[index]

    return cost[index] + min(minCost(cost, index - 1), minCost(cost, index - 2))
