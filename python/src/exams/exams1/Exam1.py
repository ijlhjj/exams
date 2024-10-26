""" 1-两数之和： 算法时间复杂度为： O(n * log n)

    说明：
        题目没有说明数组已排序，所以假定为无序数组；
        题目没有说明数组不包含负整数，所以假定可能有负整数；

    解题步骤：
        0、列表排序是原地排序，所以要拷贝一个列表进行操作
        1、对查找数据进行排序。 快速排序时间复杂度：O(n * log n)
        2、对排序后数组进行一次遍历（时间复杂度：O(n)）。 负整数的存在使不能遍历小于 target 位置前的子列表（此处可以优化）
            因为数组有序，所以如果和大于 target ，则高位索引减 1；如果和小于 target ，则低位索引加 1；
            如果遍历完(lower == high)没有找到和为 target 的值，则不存在结果，返回 None
        3、如果找到和为 target 的两个值，则在原列表中分别查找两个列表的位置下标，返回查找结果。 无序列表顺序查找的时间复杂度：O(n)

        综合以上步骤的时间复杂度，忽略常数后，算法整体的时间复杂度为： O(n * log n)

"""

from typing import List


def two_sum(nums: List[int], target: int) -> List[int]:
    """ 给定一个整数数组 nums 和一个整数目标值 target，在该数组中找出 和为目标值 target 的两个整数，并返回它们的数组下标。

    :param nums: 查找的整数数组
    :param target: 目标值
    :return: 和为目标值 的两个元素下标
    """

    # 列表排序是原地排序，此处不能使用原列表
    int_list = nums[:]

    # 对数组进行排序，快速排序时间复杂度：O(n * log n)
    int_list.sort()

    lower = 0
    high = len(nums) - 1
    while lower < high:
        # lower == high 表示数组全部遍历完
        sum_num = int_list[lower] + int_list[high]
        if sum_num > target:
            high -= 1
        elif sum_num < target:
            lower += 1
        else:
            index1 = nums.index(int_list[lower])
            if int_list[lower] == int_list[high]:
                # 数组中同一个元素在答案里不能重复出现，此处需要特殊处理
                index2 = nums.index(int_list[high], index1 + 1)
                return [index1, index2]
            else:
                index2 = nums.index(int_list[high])
                return [index1, index2]

    return None
