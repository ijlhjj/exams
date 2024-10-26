""" 146-美化数组的最少删除数

"""

from typing import List


def minDeletion(nums: List[int]) -> int:
    l = len(nums)
    # 只有1个元素时，删除为 空数组
    if l == 1:
        return 1

    c = i = 0
    j = 1
    while i < l - 1:
        # 不满足题意时不断移动右指针，移动一次代表删除一个元素
        while j < l and nums[i] == nums[j]:
            c += 1
            j += 1

        # 更新双指针位置
        i = j + 1
        j = i + 1

    # 如果左指针 i == l - 1 ，则结果列表的 len 为奇数；
    # 如果左指针 i == l + 1 ，则 j 在内层循环达到了 l ，表示最后的若干元素都跟最后一个对比元素相等
    if i == l + 1 or i == l - 1:
        c += 1

    return c
