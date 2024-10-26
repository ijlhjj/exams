""" 89-从两个数字数组里生成最小数字

"""

from typing import List


def min_number(nums1: List[int], nums2: List[int]) -> int:
    # 两个列表有相同元素，返回相同元素中最小值
    nums1_set = set(nums1)
    nums2_set = set(nums2)
    both_set = nums1_set & nums2_set
    if both_set:
        nums = list(both_set)
        nums.sort()
        return nums[0]

    # 不存在相同元素，取两个列表的最小元素
    nums1.sort()
    nums2.sort()
    num1 = nums1[0]
    num2 = nums2[0]

    # 用两者中 较小者作为十位，大者作为个位 组成数字返回
    if num1 < num2:
        return num1 * 10 + num2
    else:
        return num2 * 10 + num1
