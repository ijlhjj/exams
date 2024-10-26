""" 312-让所有学生保持开心的分组方法数

"""

from typing import List


def countWays(nums: List[int]) -> int:
    """
        根据题意：列表排序后，不能够出现前面 不被选中 而后面 被选中 的情况
            这位学生被选中，并且被选中的学生人数 严格大于 nums[i] 。
            这位学生没有被选中，并且被选中的学生人数 严格小于 nums[i] 。
    """

    nums.sort()

    l = len(nums)

    # 用列表标记当前学生是否可被选中，可被选中标记 1 ，否则标记 0
    select = []
    i = 0
    # 遍历到倒数第2个元素，可直接使用 i+1 下标
    while i < l - 1:
        # 选中当前学生，不选中后一个学生
        if nums[i] < i + 1 < nums[i + 1]:
            select.append(1)
        else:
            select.append(0)

        i += 1

    # 最后1个只判断 选中的学生人数 严格大于 nums[i] 即可
    if l > nums[-1]:
        select.append(1)

    # 可为空时赋值 1，否则为 0
    count = 0
    if nums[0] > 0:
        count = 1

    return count + sum(select)
