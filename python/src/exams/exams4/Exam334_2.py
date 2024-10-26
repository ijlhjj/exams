""" 334-使二进制数组全部等于 1 的最少操作次数 I

"""

from typing import List


def minOperations(nums: List[int]) -> int:
    c = 0  # 操作次数
    i = 0  # 当前操作下标
    flag = True  # True 表示当前找 0， False 表示当前找 1
    while i < len(nums):
        if nums[i] == 0:
            # 找到 0 且当前在找 0，操作次数加 1
            if flag:
                c += 1
            flag = False  # 标识反转
        else:
            # 找到 1 且当前在找 1，操作次数加 1
            if not flag:
                c += 1
            flag = True  # 标识反转

        i += 1

    return c
