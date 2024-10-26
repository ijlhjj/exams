""" 171-数组的最小相等和

"""

from typing import List


def minSum(nums1: List[int], nums2: List[int]) -> int:
    # 遍历数组替换所有0，计算最小和并标记是否替换
    sum1 = 0
    flag1 = False
    for n in nums1:
        if n == 0:
            sum1 += 1
            flag1 = True
        else:
            sum1 += n

    # 遍历数组替换所有0，计算最小和并标记是否替换
    sum2 = 0
    flag2 = False
    for n in nums2:
        if n == 0:
            sum2 += 1
            flag2 = True
        else:
            sum2 += n

    # 根据两个数组是否替换返回不同的结果
    if flag1 and flag2:
        return max(sum1, sum2)
    elif flag1:
        if sum2 >= sum1:
            return sum2
    elif flag2:
        if sum1 >= sum2:
            return sum1
    elif sum1 == sum2:
        return sum1

    return -1  # 无法使两数组相等，则返回 -1
