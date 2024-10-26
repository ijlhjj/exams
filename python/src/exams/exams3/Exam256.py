""" 256-找出缺失和重复的数字

"""

from typing import List


def findMissingAndRepeatedValues(grid: List[List[int]]) -> List[int]:
    # 定义3个集合辅助计算
    n = len(grid)
    zeroSet = {i for i in range(1, n * n + 1)}
    oneSet = set()
    twoSet = set()

    # 遍历矩阵
    for row in grid:
        for i in row:
            if i in oneSet:
                # 找到在一次集合的元素，加入2次集合
                oneSet.remove(i)
                twoSet.add(i)
            elif i in zeroSet:
                # 找到在零次集合的元素，加入1次集合
                zeroSet.remove(i)
                oneSet.add(i)

    # 按题意返回结果
    return [twoSet.pop(), zeroSet.pop()]
