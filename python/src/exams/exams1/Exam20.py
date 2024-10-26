""" 20-重新放置石块

"""

from typing import List


def relocate_marbles(nums: List[int], move_from: List[int], move_to: List[int]) -> List[int]:
    nums_set = set(nums)  # 每次都移到所有石块，所以用set可以减少重复替换元素

    # 同时遍历 from 和 to 两个列表
    for from_index, to_index in zip(move_from, move_to):
        # 测试数据保证在进行第 i 步操作时，moveFrom[i] 处至少有一个石块
        # 此处测试做防御性编程
        if from_index in nums_set:
            nums_set.remove(from_index)

        nums_set.add(to_index)  # 添加移动后位置

    # set 是无序的，这里转回 list 进行排序
    result = list(nums_set)
    result.sort()
    return result
