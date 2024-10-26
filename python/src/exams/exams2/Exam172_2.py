""" 172-找到冠军 II

"""

from typing import List


def findChampion(n: int, edges: List[List[int]]) -> int:
    # 对每个顶点添加一个入边的空集合
    inEdgesList = [set() for _ in range(n)]

    # 遍历入参边数组添加节点的入边
    for edge in edges:
        inEdgesList[edge[1]].add(edge[0])

    # 统计入边为0的顶点数量，并记录下标
    c = 0
    index = -1
    for i in range(n):
        if len(inEdgesList[i]) == 0:
            # 找到入边为0顶点
            c += 1
            index = i

    # 只有一个冠军队伍，返回队伍编号
    if c == 1:
        return index

    return -1  # 否则，返回 -1
