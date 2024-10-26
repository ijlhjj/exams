""" 29-数组的最大美丽值

"""

from typing import List


def maximum_beauty(nums: List[int], k: int) -> int:
    """ 数组的 美丽值 定义为数组中由相等元素组成的最长子序列的长度

    """

    nums.sort()

    size = len(nums)
    left = 0
    right = size - 1

    # 从最小的元素计算可以满足题目限定的最长子序列
    while nums[right] - nums[left] > 2 * k:
        right -= 1

    longest = right - left + 1  # 这里的右值是满足题目要求的元素，所以要加 1

    # 递归计算满足要求的最长子序列
    for i in range(size - 1):
        left = i + 1
        # 左值向后递进，右值也必然只能向后递进
        while right < size and nums[right] - nums[left] <= 2 * k:
            right += 1

        diff = right - left  # 这里的右值是不满足题目要求的元素，所以不需要加 1
        if diff > longest:
            longest = diff

        if right == size:  # 右值到列表尾不需要继续
            break

    return longest
