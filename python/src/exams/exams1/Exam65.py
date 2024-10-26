""" 65-最接近的三数之和

"""

from bisect import bisect
from typing import List


def three_sum_closest(nums: List[int], target: int) -> int:
    # 初值大于题目上限
    three_sum_num = 3001
    min_diff = 10 ** 4 * 2

    nums.sort()  # 原地排序

    i = 0  # 第一个元素索引
    while i < len(nums) - 2:
        j = i + 1  # 第二个元素索引
        while j < len(nums) - 1:
            # 用第三个元素在排序数组中做二分查找
            diff = target - (nums[i] + nums[j])
            index = bisect(nums, diff, j + 1)

            # 左边界索引必须大于第二个元素索引
            if index > j + 1:
                left_diff = diff - nums[index - 1]
                # 差值绝对值更小说明和更接近
                if abs(left_diff) < min_diff:
                    min_diff = abs(left_diff)
                    three_sum_num = nums[i] + nums[j] + nums[index - 1]

            # 右边界正常取值为数组边界
            if index < len(nums):
                right_diff = diff - nums[index]
                # 差值绝对值更小说明和更接近
                if abs(right_diff) < min_diff:
                    min_diff = abs(right_diff)
                    three_sum_num = nums[i] + nums[j] + nums[index]

            j += 1

        i += 1

    return three_sum_num
