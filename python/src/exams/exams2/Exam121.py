""" 121-执行 K 次操作后的最大分数

"""

from bisect import bisect
from math import ceil
from typing import List


def maxKelements(nums: List[int], k: int) -> int:
    total = 0  # 起始分数

    nums.sort()
    numSubList = nums[-k:]  # k 个元素即可满足题目所需

    limit = k - 1  # 循环中使用的一个限制值，放在外面只计算一次即可
    for i in range(k):
        # 取最大分数计入总和
        n = numSubList[-1]
        total += n

        # 按题目描述更新值
        n = ceil(n / 3)
        numSubList.pop()
        # 最后一次循环列表为空，这里的上限判断条件为：k - 1
        if i < limit:
            if n > numSubList[-1]:
                # 更新后仍然是最大分数，直接加到尾部
                numSubList.append(n)
            elif n > numSubList[0]:
                # 更新后大于列表最小值，找到合适位置插入，保持列表有序
                index = bisect(numSubList, n)
                numSubList.insert(index, n)
            elif k - i > len(numSubList):
                numSubList.insert(0, n)

            if k - i < len(numSubList):
                numSubList.pop(0)

    return total
