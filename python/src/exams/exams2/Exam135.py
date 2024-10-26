""" 135-咒语和药水的成功对数

"""

from bisect import bisect_left
from math import ceil

from typing import List


def successfulPairs(spells: List[int], potions: List[int], success: int) -> List[int]:
    # 排序后可以进行二分查找，提高题解效率
    potions.sort()
    pSize = len(potions)

    pairs = []

    for s in spells:
        v = ceil(success / s)  # 求最小可满足题解的药水能量强度
        # 当前插入位置后的元素都能满足要求，满足成功组合的数量为 pSize - index
        # 这里需要用bisect_left找最左侧插入点
        index = bisect_left(potions, v)
        pairs.append(pSize - index)

    return pairs
