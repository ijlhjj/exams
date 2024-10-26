""" 300-矩阵中的最大得分

"""

from typing import List


def maxScore(grid: List[List[int]]) -> int:
    # 矩阵大小
    m = len(grid)
    n = len(grid[0])

    # 初始化矩阵列表存储 最大得分
    scoreGrid = [[]] * m
    for i in range(m):
        scoreGrid[i] = [0] * n

    # 初始化第一行最大得分
    j = 1
    while j < n:
        diff = grid[0][j] - grid[0][j - 1]  # 第一行计算与左侧元素的差值
        # 如果左侧元素的 最大得分 为正，则累加
        if scoreGrid[0][j - 1] > 0:
            diff += scoreGrid[0][j - 1]
        scoreGrid[0][j] = diff  # 最大得分 赋值
        j += 1

    # 初始化第一列最大得分
    i = 1
    while i < m:
        diff = grid[i][0] - grid[i - 1][0]  # 第一行计算与上方元素的差值
        # 如果上方元素的 最大得分 为正，则累加
        if scoreGrid[i - 1][0] > 0:
            diff += scoreGrid[i - 1][0]
        scoreGrid[i][0] = diff  # 最大得分 赋值
        i += 1

    # 循环处理剩余每行元素的 最大得分
    i = 1
    while i < m:
        # 每行从第2个元素开始处理
        j = 1
        while j < n:
            # 计算与上方元素差值的 最大得分
            diff1 = grid[i][j] - grid[i - 1][j]
            # 如果上方元素的 最大得分 为正，则累加
            if scoreGrid[i - 1][j] > 0:
                diff1 += scoreGrid[i - 1][j]

            # 计算与左侧元素差值的 最大得分
            diff2 = grid[i][j] - grid[i][j - 1]
            # 如果左侧元素的 最大得分 为正，则累加
            if scoreGrid[i][j - 1] > 0:
                diff2 += scoreGrid[i][j - 1]

            scoreGrid[i][j] = max(diff1, diff2)  # 当前 最大得分 取两者中较大者
            j += 1  # 列推进

        i += 1  # 行推进

    # 查找 最大得分 矩阵中的最大值
    ms = - (10 ** 5)  # 最大值初始化为一个题意下限
    scoreGrid[0][0] = ms  # 左上角元素不符合 必须至少移动一次 排除掉
    for row in scoreGrid:
        for val in row:
            if val > ms:
                ms = val

    return ms
