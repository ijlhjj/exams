""" 248-腐烂的橘子

"""

from typing import List


def orangesRotting(grid: List[List[int]]) -> int:
    m = len(grid)
    n = len(grid[0])

    time = 0

    while True:
        # 数据量较小，使用了 O(n^2) 算法
        # 循环矩阵元素，把 2-腐烂橘子 周围 4 个方向上相邻的 1-新鲜橘子 置为中间变量 3 ，防止刚处理元素在同一次循环中递进处理
        for i in range(m):
            for j in range(n):
                if grid[i][j] == 2:
                    if i > 0 and grid[i - 1][j] == 1:
                        grid[i - 1][j] = 3

                    if j > 0 and grid[i][j - 1] == 1:
                        grid[i][j - 1] = 3

                    if i < m - 1 and grid[i + 1][j] == 1:
                        grid[i + 1][j] = 3

                    if j < n - 1 and grid[i][j + 1] == 1:
                        grid[i][j + 1] = 3

        # 把上面循环的中间变量置为 2-腐烂橘子，计数
        c = 0
        for i in range(m):
            for j in range(n):
                if grid[i][j] == 3:
                    grid[i][j] = 2
                    c += 1

        # 如果本次处理没有变化，则不再进行处理
        if c == 0:
            break

        time += 1

    # 是否存在 新鲜橘子
    flag = False

    for row in grid:
        for col in row:
            if col == 1:
                flag = True
                break

        if flag:
            break

    # 有不可达元素时 返回 -1
    if flag:
        return -1
    else:
        return time
