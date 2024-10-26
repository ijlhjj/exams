""" 34-合并后数组中的最大元素

"""

from typing import List


def max_array_value(nums: List[int]) -> int:
    max_value = 0

    # 数组只有1个元素时之间返回
    if len(nums) == 1:
        return nums[0]

    i = len(nums) - 1
    while i >= 0:
        sum_value = nums[i]  # 取当前元素作为初值

        # 数组还有元素并且符合题目要求时，计入序列和
        while i - 1 >= 0 and sum_value >= nums[i - 1]:
            sum_value += nums[i - 1]
            i -= 1

        # 出现更大序列和时更新
        if sum_value > max_value:
            max_value = sum_value

        i -= 1

    return max_value
