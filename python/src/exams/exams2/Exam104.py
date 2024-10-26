""" 104-计算 K 置位下标对应元素的和

"""

from typing import List


def sumIndicesWithKSetBits(nums: List[int], k: int) -> int:
    total = 0

    for i in range(len(nums)):
        s = f'{i:b}'  # 格式化为二进制字符串

        # 统计字符串中 1 的个数
        if s.count('1') == k:
            total += nums[i]

    return total
