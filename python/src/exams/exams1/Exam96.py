""" 96-可以攻击国王的皇后

"""

from bisect import bisect
from typing import List


def queens_attack_the_king(queens: List[List[int]], king: List[int]) -> List[List[int]]:
    attack_queens = []  # 最终返回列表

    rows = []  # 位于同列的行号
    cols = []  # 位于同行的列号
    slash = []  # 位于斜线方向的行号
    backslash = []  # 位于反斜线方向的行号

    for queen in queens:
        # 同行元素保存列号
        if queen[0] == king[0]:
            cols.append(queen[1])

        # 同列元素保存行号
        if queen[1] == king[1]:
            rows.append(queen[0])

        # 同一斜线元素保存行号
        if queen[0] - king[0] == queen[1] - king[1]:
            slash.append(queen[0])

        # 同一反斜线元素保存行号
        if queen[0] - king[0] == king[1] - queen[1]:
            backslash.append(queen[0])

    # 同列元素排序后取相邻的两个元素（如果存在的话）
    rows.sort()
    index = bisect(rows, king[0])
    if index > 0:
        attack_queens.append([rows[index - 1], king[1]])
    if index < len(rows):
        attack_queens.append([rows[index], king[1]])

    # 同行元素排序后取相邻的两个元素（如果存在的话）
    cols.sort()
    index = bisect(cols, king[1])
    if index > 0:
        attack_queens.append([king[0], cols[index - 1]])
    if index < len(cols):
        attack_queens.append([king[0], cols[index]])

    # 同斜线元素排序后取相邻的两个元素（如果存在的话）
    slash.sort()
    index = bisect(slash, king[0])
    if index > 0:
        # 同斜线元素 king[0] - queen[0] == king[1] - queen[1]
        attack_queens.append([slash[index - 1], king[1] - king[0] + slash[index - 1]])
    if index < len(slash):
        attack_queens.append([slash[index], king[1] - king[0] + slash[index]])

    # 同反斜线元素排序后取相邻的两个元素（如果存在的话）
    backslash.sort()
    index = bisect(backslash, king[0])
    if index > 0:
        # 同反斜线元素 king[0] - queen[0] == queen[1] - king[1]
        attack_queens.append([backslash[index - 1], king[1] + king[0] - backslash[index - 1]])
    if index < len(backslash):
        attack_queens.append([backslash[index], king[1] + king[0] - backslash[index]])

    return attack_queens
