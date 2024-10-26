""" 316-求出最多标记下标

"""

from bisect import bisect_left
from typing import List


def maxNumOfMarkedIndices(nums: List[int]) -> int:
    nums.sort()  # 排序以方便后续处理

    # 分成2个数组，元素数为奇数则后半数组元素多1，偶数则数量相同
    index = len(nums) // 2
    leftArr = nums[:index]
    rightArr = nums[index:]

    l = len(rightArr)  # 较大元素数组长度

    count = 0  # 标记元素数量

    # 遍历较小元素数组，在较大数组中查找符合双倍的最小元素进行标记
    start = 0  # 较大数组中已被标记的元素下标
    for num in leftArr:
        index = bisect_left(rightArr, num * 2, start)  # 查找双倍下标

        # 下标超出数组长度，不需继续计算
        if index == l:
            break

        count += 2  # 标记数量加2
        start = index + 1  # 起始下标加1，上面标记的这个下标不能再用

    return count
