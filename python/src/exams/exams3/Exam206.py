""" 206-计算 K 置位下标对应元素的和

"""

from typing import List


def sumIndicesWithKSetBits(nums: List[int], k: int) -> int:
    sumNum = 0

    for i in range(len(nums)):
        # bit_count 返回整数的绝对值的二进制表示中 1 的个数
        if i.bit_count() == k:
            sumNum += nums[i]

    return sumNum
