""" 27-使数组中的所有元素都等于零

"""

from typing import List


def check_array(nums: List[int], k: int) -> bool:
    """使数组中的所有元素都等于零

      解题思路： 1、 第 1 个元素必然与前 k 个元素同时减 1；
               2、 等第 1 个元素减为 0 ，往后面寻找第 1 个不为 0 的元素继续步骤 (1) 的操作；
               3、 如果有元素减为负值，则结果为假；
               4、 如果遍历完所有元素，则结果为真；
    """

    # 按照题目限定，如果k为1，结果肯定为真
    if k == 1:
        return True

    size = len(nums)

    # 数组长度超过100时，保证较大的数值在前面。倒序对于处理结果是一致的。
    if size > 100:
        if nums[0] < nums[size - 1]:
            nums.reverse()

    # 循环至倒数 k 个元素
    for i in range(size - k + 1):
        # 如果第 1 个元素递减时把相邻元素递减为负值，则返回 False
        if nums[i] < 0:
            return False

        # 从左边第 1 个不为 0 的元素开始，所有相邻 k 个元素都减去第 1 个元素值大小
        if nums[i] != 0:
            num = nums[i]
            for j in range(k):
                nums[i + j] -= num

    # 对以上循环补充，判断倒数 k 个元素值是否为 0
    for i in range(k):
        if nums[size - i - 1] != 0:
            return False

    return True
