""" 334-使二进制数组全部等于 1 的最少操作次数 I

"""

from typing import List


def minOperations(nums: List[int]) -> int:
    # 每次操作连续3个元素，所以最后一个可操作元素为 nums[-3]
    limit = len(nums) - 2
    c = 0  # 操作次数
    i = 0  # 当前操作下标
    while i < limit:
        # 找到一个0，连续 3 个元素 全部反转
        if nums[i] == 0:
            nums[i] = 1
            nums[i + 1] = nums[i + 1] ^ 1
            nums[i + 2] = nums[i + 2] ^ 1
            c += 1  # 操作次数加 1
        i += 1

    # 如果最后2个元素还有 0 ，无法全部变成 1 ，返回 -1
    if nums[i] == 0 or nums[i + 1] == 0:
        return -1

    return c  # 返回操作次数
