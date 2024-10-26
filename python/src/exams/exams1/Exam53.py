""" 53-杨辉三角 II

"""

from typing import List


def get_row(row_index: int) -> List[int]:
    """ 杨辉三角 """

    # 全部初始化为 1 ，没有初始化过的列表项不可使用下标引用
    row = [1] * (row_index + 1)

    # 从下标 2 即第 3 行开始才需要做赋值处理
    for i in range(1, row_index):
        for j in range(i, 0, -1):
            # 下标的逆序修改元素项不需要做特殊处理
            row[j] += row[j - 1]

    return row
