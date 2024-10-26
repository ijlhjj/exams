""" 32-三数之和

"""

from typing import List

# 一个对题目是非法的值
INVALID_VALUE = 10 ** 6


def binary_search(a: list, from_index: int, to_index: int, key, reverse=False):
    """ 二分查找：当且仅当找到 key 时，返回值将 >=0

    :param a: 必须有序
    :param from_index: 起始下标（包括）
    :param to_index: 终止下标（不包括）
    :param key: 查找元素
    :param reverse: 数组是否倒序，默认是正序
    :return: 如果查找到返回结果索引；否则，返回（-（插入点）-1）。
    """

    low = from_index
    high = to_index - 1

    while low <= high:
        mid = (low + high) // 2
        mid_val = a[mid]

        if reverse:
            if mid_val > key:
                low = mid + 1
            elif mid_val < key:
                high = mid - 1
            else:
                return mid  # key found
        else:
            if mid_val < key:
                low = mid + 1
            elif mid_val > key:
                high = mid - 1
            else:
                return mid  # key found

    return -(low + 1)  # key not found.


def three_sum(nums: List[int]) -> List[List[int]]:
    triple_list = []  # 结果三元组列表

    nums.sort()
    size = len(nums)

    # 正数元素数量少时进行倒序，保证后续循环不超过一半的次数
    flag = False  # 倒序标识
    if nums[size // 2] < 0:
        nums.reverse()
        flag = True

    # 外层循环 nums[i] 值
    numi_pre = INVALID_VALUE
    for i in range(size - 2):
        numi = nums[i]

        # 倒序全部小于0或正序全部大于0时，不需要继续。3个正数或3个负数的和不可能为 0
        if (flag and numi < 0) or (not flag and numi > 0):
            break

        # 相同元素值会成为重复三元组，不符合题目要求
        if numi == numi_pre:
            continue
        numi_pre = numi  # 更新当前 i 值

        # 内层循环 nums[j] 值
        numj_pre = INVALID_VALUE
        for j in range(size - 1, i + 1, -1):
            numj = nums[j]

            # 相同元素值会成为重复三元组，不符合题目要求
            if numj == numj_pre:
                continue
            numj_pre = numj  # 更新当前 j 值

            # nums[i] + nums[j] + nums[k] == 0
            numk = 0 - numi - numj

            # 对有序数组可进行折半查找 k 值，index是在全数组中的插入下标
            index = binary_search(nums, i + 1, j, numk, flag)
            if index >= 0:
                # 找到 k 值，添加到结果三元组列表
                triple = [numi, numj, numk]
                triple_list.append(triple)
            else:
                # 所需 k 值已大于（或小于）当前列表全部元素时，不需要继续内层循环
                index = -index - 1
                if index > j:
                    break

    return triple_list
