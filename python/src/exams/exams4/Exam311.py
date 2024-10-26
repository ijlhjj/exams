""" 311-一个小组的最大实力值

"""

from typing import List


def maxStrength(nums: List[int]) -> int:
    nums.sort()  # 列表排序

    # 只有 1 个元素直接返回
    if len(nums) == 1:
        return nums[0]

    # 列表只包含少于 2个负数 和 若干个0 时返回 0
    if nums[1] == 0 and nums[-1] == 0:
        return 0

    ans = 1  # 乘积结果初值为 1

    # 先计算所有 正整数 的乘积
    while len(nums) > 0 and nums[-1] > 0:
        ans *= nums[-1]
        del nums[-1]

    # 负整数 要超过2个才可以计算，保证负负得正的结果 实力值 最大
    while len(nums) > 1 and nums[1] < 0:
        ans = ans * nums[0] * nums[1]
        nums = nums[2:]

    return ans
