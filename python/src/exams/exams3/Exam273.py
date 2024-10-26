""" 273-修改矩阵

"""

from typing import List


def modifiedMatrix(matrix: List[List[int]]) -> List[List[int]]:
    m = len(matrix)
    n = len(matrix[0])

    maxNum = [-1] * n

    for i, row in enumerate(matrix):
        for j, num in enumerate(row):
            if num > maxNum[j]:
                maxNum[j] = num

    for i, row in enumerate(matrix):
        for j, num in enumerate(row):
            if num == -1:
                matrix[i][j] = maxNum[j]

    return matrix
