""" 40-矩阵置零

"""

import copy
from typing import List


def set_zeroes(matrix: List[List[int]]) -> None:
    """
    Do not return anything, modify matrix in-place instead.
    """

    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            if matrix[i][j] == 0:
                for k in range(len(matrix[i])):
                    if matrix[i][k] != 0:
                        matrix[i][k] = None
                for k in range(len(matrix)):
                    if matrix[k][j] != 0:
                        matrix[k][j] = None

    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            if matrix[i][j] is None:
                matrix[i][j] = 0


def set_zeroes1(matrix: List[List[int]]) -> None:
    row_zero = set()
    col_zero = set()

    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            if matrix[i][j] == 0:
                row_zero.add(i)
                col_zero.add(j)

    for i in row_zero:
        for j in range(len(matrix[i])):
            matrix[i][j] = 0

    for j in col_zero:
        for i in range(len(matrix)):
            matrix[i][j] = 0


def set_zeroes2(matrix: List[List[int]]) -> None:
    nums = copy.deepcopy(matrix)

    for i in range(len(nums)):
        row = nums[i]
        for j in range(len(row)):
            if row[j] == 0:
                for k in range(len(row)):
                    matrix[i][k] = 0
                for k in range(len(nums)):
                    matrix[k][j] = 0
