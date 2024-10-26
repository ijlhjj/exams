""" 154-找出叠涂元素

"""

from typing import List


def firstCompleteIndex(arr: List[int], mat: List[List[int]]) -> int:
    m = len(mat)
    n = len(mat[0])

    # 使用字典保存元素的坐标
    valsCoords = {}
    for i in range(m):
        row = mat[i]
        for j in range(n):
            valsCoords[row[j]] = (i, j)

    index = 0

    # 使用集合列表保存行列的涂色元素
    rowSet = [set() for _ in range(m)]
    colSet = [set() for _ in range(n)]

    for i in range(len(arr)):
        coords = valsCoords[arr[i]]  # 获取元素坐标
        rowSet[coords[0]].add(arr[i])  # 添加行集合元素
        colSet[coords[1]].add(arr[i])  # 添加列集合元素
        # 某一行或某一列上都被涂色，只判断当前涂色行列即可
        if len(rowSet[coords[0]]) == n or len(colSet[coords[1]]) == m:
            index = i
            break

    return index
