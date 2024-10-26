""" 321-边积分最高的节点

"""

from typing import List


def edgeScore(edges: List[int]) -> int:
    # 定义积分列表，遍历计算各节点积分
    scores = [0] * len(edges)
    for i, v in enumerate(edges):
        scores[v] += i

    # 查找 边积分 最高且编号 最小 的下标
    m = 0
    index = 0
    for i, v in enumerate(scores):
        if v > m:
            m = v
            index = i

    return index
