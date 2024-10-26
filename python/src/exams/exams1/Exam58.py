""" 58-搜索旋转排序数组 II

    在算法简单清晰和性能更加高效之间往往要寻找一种平衡，在满足实际需求的前提下尽量使用简单的算法（不容易出错）。
    只有在程序关键部分对性能有很高的要求时，再去用复杂的算法实现更好的性能。
"""

from typing import List


def search(nums: List[int], target: int) -> bool:
    num_set = set(nums)

    if target in num_set:
        return True

    return False
