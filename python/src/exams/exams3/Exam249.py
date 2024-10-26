""" 249-完成所有任务需要的最少轮数

"""

from collections import Counter

from typing import List


def minimumRounds(tasks: List[int]) -> int:
    # 计数统计
    counter = Counter(tasks)

    c = 0
    for k, v in counter.items():
        # 统计值存在 1 时直接返回 -1
        if v == 1:
            return -1

        # 按 3 计算 最少 轮数
        c += v // 3

        # 有余数则 加1
        if v % 3 != 0:
            c += 1

    return c
