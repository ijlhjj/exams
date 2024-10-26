""" 117-找出数组的串联值

"""

from typing import List


def findTheArrayConcVal(nums: List[int]) -> int:
    total = 0

    # 左右双指针，当存在超过一个元素未处理时，继续循环处理
    left = 0
    right = len(nums) - 1
    while left < right:
        # 二者串联，加入总和，移动指针
        nStr = str(nums[left]) + str(nums[right])
        total += int(nStr)
        left += 1
        right -= 1

    # 仍然存在一个元素
    if left == right:
        total += nums[left]

    return total
