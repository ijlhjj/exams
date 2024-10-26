""" 115-移动机器人

"""

from typing import List


def sumDistance(nums: List[int], s: str, d: int) -> int:
    # 机器人视为无差别的。当两个机器人相撞时，它们开始沿着原本相反的方向移动。
    # 这两个限定叠加，可以忽略机器人的碰撞反向
    # 根据运动方向和时间，确定所有机器人的最终坐标位置
    numArr = []
    for n, c in zip(nums, s):
        if c == 'L':
            numArr.append(n - d)
        elif c == 'R':
            numArr.append(n + d)

    numArr.sort()

    # 排序后计算坐标中最左机器人的所有两两距离之和
    currSum = 0
    for i in range(1, len(numArr)):
        currSum += numArr[i] - numArr[0]

    # 每个机器人的两两距离之和都比相邻左侧机器人少： 相邻距离 * 左侧机器人两两距离数量
    total = currSum
    distance = len(numArr) - 1
    for i in range(distance - 1):
        currSum -= (numArr[i + 1] - numArr[i]) * distance
        total += currSum
        distance -= 1

    # 按题目要求对 10^9 + 7 取余后返回
    return total % (10 ** 9 + 7)
