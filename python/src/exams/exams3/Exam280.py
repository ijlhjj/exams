""" 280-保持城市天际线

"""

from typing import List


def maxIncreaseKeepingSkyline(grid: List[List[int]]) -> int:
    n = len(grid)  # 矩阵大小
    rowMax = [0] * n  # 每行最大元素值
    colMax = [0] * n  # 每列最大元素值

    # 遍历矩阵，计算每行、每列的最大值
    for i, row in enumerate(grid):
        for j, num in enumerate(row):
            if num > rowMax[i]:
                rowMax[i] = num
            if num > colMax[j]:
                colMax[j] = num

    c = 0  # 增量高度和

    # 遍历矩阵计算增量
    for i, row in enumerate(grid):
        for j, num in enumerate(row):
            m = min(rowMax[i], colMax[j])  # 当前行列最大值的较小者
            # 如果当前值小于 m ，则高度可增加差值
            if m > num:
                c = c + m - num

    return c
