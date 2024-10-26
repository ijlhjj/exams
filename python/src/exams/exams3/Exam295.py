""" 295-移除后集合的最多元素数

"""

from typing import List


def maximumSetSize(nums1: List[int], nums2: List[int]) -> int:
    # 创建集合进行排重
    set1 = set(nums1)
    set2 = set(nums2)

    # 计算排重元素数量和半数的较小者
    len1 = min(len(nums1) // 2, len(set1))
    len2 = min(len(nums2) // 2, len(set2))

    # 集合并集元素足够时，结果为 len1 + len2
    diff = set1 | set2
    if len(diff) >= len1 + len2:
        return len1 + len2

    # 求两个集合的差集
    diff1 = set1 - set2
    diff2 = set2 - set1

    # 一个集合完全包含另一个
    if not diff1 or not diff2:
        return len(diff)

    # 计算差集元素数量和半数的较小者
    len3 = min(len(nums1) // 2, len(diff1))
    len4 = min(len(nums2) // 2, len(diff2))

    # 返回并集元素数量和 len3 + len4 中较大者
    return max(len3 + len4, len(diff))
