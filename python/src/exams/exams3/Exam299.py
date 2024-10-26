""" 299-将元素分配到两个数组中 I

"""

from typing import List


def resultArray(nums: List[int]) -> List[int]:
    # 定义并初始化2个列表
    arr1 = [nums[0]]
    arr2 = [nums[1]]

    # 从第3个元素开始，按题意进行列表处理
    i = 2
    while i < len(nums):
        if arr1[-1] > arr2[-1]:
            arr1.append(nums[i])
        else:
            arr2.append(nums[i])
        i += 1

    # 返回2个列表的拼接
    return arr1 + arr2
