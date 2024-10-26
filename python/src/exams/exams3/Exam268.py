""" 268-下一个更大元素 II

"""

from typing import List


def nextGreaterElements(nums: List[int]) -> List[int]:
    l = len(nums)
    result = []  # 结果列表

    # 遍历列表
    for i, val in enumerate(nums):
        bound = False  # 是否循环到列表开头
        searched = False  # 是否找到更大元素
        j = i

        # 没有循环到开头或循环后没有达到当前元素，继续寻找
        while not bound or j < i:
            # 下一个元素如果超出列表返回，则返回开头
            j += 1
            if j == l:
                j = 0
                bound = True  # 设置循环标识

            # 找到更大元素，加入结果集。设置标识并跳出循环
            if nums[j] > val:
                result.append(nums[j])
                searched = True
                break

        # 没有找到更大元素，加入 -1
        if not searched:
            result.append(-1)

    return result
