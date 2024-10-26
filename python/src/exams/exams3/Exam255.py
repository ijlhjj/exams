""" 255-找出缺失的观测数据

"""

from math import ceil, floor
from typing import List


def missingRolls(rolls: List[int], mean: int, n: int) -> List[int]:
    m = len(rolls)  # 观测数据 m
    m_sum = sum(rolls)  # m 观测数据 总和

    total = mean * (m + n)  # 计算观测数据总和

    n_sum = total - m_sum  # n 观测数据 总和
    n_mean = n_sum / n  # n 观测数据 平均值

    # 平均值 小于1 或 大于6 ，返回 空数组
    if n_mean < 1 or n_mean > 6:
        return []

    # 如果 观测数据 n 可以整除，直接返回 n 个相等值
    if n_sum % n == 0:
        return [n_mean] * n

    # 不可整除
    n_nums = []
    c_val = ceil(n_mean)  # 向上取整
    f_val = floor(n_mean)  # 向下取整

    # 先填充向上取整值
    surplus = n_sum
    while n > 0:
        n_nums.append(c_val)
        surplus -= c_val
        n -= 1

        # 剩余值 与 （个数 * 向下取整） 相等
        if n * f_val == surplus:
            break

    # 补充剩余的向下取整元素
    n_nums = n_nums + [f_val] * n

    return n_nums
