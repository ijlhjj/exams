""" 262-数组的最大美丽值

"""

from bisect import bisect_right
from typing import List


def maximumBeauty(nums: List[int], k: int) -> int:
    # 排序以方便后续处理
    nums.sort()

    l = len(nums)
    maxLen = 0  # 定义最长子序列的长度

    # 遍历数组计算可获得美丽值长度
    for i, n in enumerate(nums):
        v = n + k * 2  # 美丽序列上限值
        r = bisect_right(nums, v)  # 查找上限值下标
        d = r - i  # 计算长度

        # 最大长度更新
        if d > maxLen:
            maxLen = d

        # 已包含整个数组时不再计算
        if r == l:
            break

    return maxLen
