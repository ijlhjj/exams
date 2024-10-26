""" 43-统计完全子数组的数目

"""

from typing import List


def count_complete_sub_arrays(nums: List[int]) -> int:
    count = 0

    diff_num = len(set(nums))  # 不同元素数量

    size = len(nums)
    for i in range(size):
        num_set = set()
        for j in range(i, size):
            num_set.add(nums[j])
            if len(num_set) == diff_num:
                # 元素数相等时后续增加元素都保持相等，直接计算差值，不需要再一个一个循环
                count += (size - j)
                break

    return count
