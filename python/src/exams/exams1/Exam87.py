""" 87-消灭怪物的最大数量

"""

import math
from typing import List


def eliminate_maximum(dist: List[int], speed: List[int]) -> int:
    # 使用列表保存怪物到达城市需要的时长，时长 = 距离 / 速度
    times = []
    for d, s in zip(dist, speed):
        times.append(math.ceil(d / s))

    times.sort()  # 对时长排序

    c = 0
    for i in range(len(times)):
        if times[i] <= i:  # 所需时长不大于当前时间，怪物可达到城市，游戏结束
            break
        c += 1

    return c
