""" 64-限制条件下元素之间的最小绝对差

"""

from bisect import bisect
from typing import List


def min_absolute_difference(nums: List[int], x: int) -> int:
    min_diff = 10 ** 9  # 初值为题目上限

    # 间隔为 0 可以直接返回 0
    if x == 0:
        return 0

    # 取待比对元素进行排序
    reserve = nums[x:]
    reserve.sort()

    # 最后 x 个元素不满足间隔要求
    for i in range(len(nums) - x):
        num = nums[i]

        # 对当前元素在比对列表中进行二分查找，则与它差值最小的元素必然是它的前一个元素或后一个元素
        index = bisect(reserve, num)

        # 下标大于 0，存在左边元素
        if index > 0:
            left = reserve[index - 1]
            diff = abs(left - num)
            if diff < min_diff:
                min_diff = diff

        # 下标小于数组大小，存在右边元素
        if index < len(reserve):
            right = reserve[index]
            diff = abs(right - num)
            if diff < min_diff:
                min_diff = diff

        # 题目可达最优结果是 0 ，找到最优解则无需继续处理
        if min_diff == 0:
            break

        # 从比对列表移除当前元素可比对的第一个符合间距要求的元素，即 nums[i + x]
        reserve.remove(nums[i + x])

    return min_diff
