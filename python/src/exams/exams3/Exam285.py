""" 285-划分数组并满足最大差限制

"""

from typing import List


def divideArray(nums: List[int], k: int) -> List[List[int]]:
    nums.sort()

    divideList = []  # 结果列表

    i = 0
    while i < len(nums):
        # 输入保证nums长度是3的倍数，所有i+2不会下标越界
        # 如果不符合题意，返回空列表。
        if nums[i + 2] - nums[i] > k:
            return []

        # 添加子数组并步进3
        divideList.append((nums[i], nums[i + 1], nums[i + 2]))
        i += 3

    return divideList
