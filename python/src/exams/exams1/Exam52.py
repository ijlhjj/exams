""" 52-杨辉三角

"""

from typing import List


def generate(num_rows: int) -> List[List[int]]:
    """ 杨辉三角 """

    triangle = [[1]]  # 第一行直接初始化赋值

    # 从第二行开始循环赋值
    pre_row = []
    for i in range(1, num_rows):
        row = [1]  # 初始化第一个元素

        # 对中间元素进行求值
        for j in range(1, i):
            row.append(pre_row[j - 1] + pre_row[j])

        row.append(1)  # 添加最后一个元素

        triangle.append(row)  # 添加到结果列表
        pre_row = row.copy()  # 保存本行列表在下次循环求值时使用

    return triangle
