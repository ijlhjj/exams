""" 197-魔塔游戏

"""

from heapq import heappush, heappop
from typing import List


def magicTower(nums: List[int]) -> int:
    # 若调整顺序也无法访问完全部房间，返回 -1
    total = sum(nums)
    if total < 0:
        return -1

    negativePq = []  # 使用优先队列存储所有已访问负值
    c = 0  # 调整次数
    currSum = 1  # 当前血量

    for n in nums:
        currSum += n

        # 负值加入优先队列
        if n < 0:
            heappush(negativePq, n)

        # 血量小于等于0时调整。遇到负值即调整，所以一次调整可以保证血量不再为负
        if currSum <= 0:
            # 每次都调整当前已访问的最小负值（掉血最多的）
            negative = heappop(negativePq)
            currSum = currSum - negative  # 补回此血量
            c += 1  # 调整次数加 1

    return c
