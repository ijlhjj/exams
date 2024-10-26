""" 307-所有数对中数位差之和

"""

from collections import defaultdict
from typing import List


# 按逐个数位统计 数位差之和
def sumDigitDifferences(nums: List[int]) -> int:
    # 整数列表转为字符串列表
    numStrList = [str(n) for n in nums]

    l = len(nums)  # 列表元素数量
    w = len(numStrList[0])  # 每个元素长度，数位长度都 相同

    total = 0  # 数位差之和

    # 按位统计 数位差之和
    for ci in range(w):
        # 使用字典存放不同数位数量
        counter = defaultdict(int)

        # 循环统计数位
        si = 0
        while si < l:
            counter[numStrList[si][ci]] += 1
            si += 1

        # 数位差 为 不同数位 的组合值。
        # 例如当前数位的统计结果为 {1:1, 2:2, 3:3} ，则列表元素数量 l=6 ，
        # 1的总数位差为5( 1*(6-1) )；
        # 2的总数位差为6( 2*(6-1-2 ) ，其中-1时之前1的数量，不能重复计算)；
        # 3的总数位差为0( 3*(6-1-2-3) )
        c = l
        for v in counter.values():
            c -= v  # 总数量 - 当前元素数量
            total += v * c  # 当前元素数量 * 剩余元素数量

    return total
