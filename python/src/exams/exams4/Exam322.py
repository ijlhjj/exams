""" 322-找到小镇的法官

"""

from typing import List


def findJudge(n: int, trust: List[List[int]]) -> int:
    # 使用字典统计信任和被信任的元组集合
    d = {}
    for i in range(1, n + 1):
        d[i] = (set(), set())

    # 遍历计算统计器
    for t in trust:
        d[t[0]][0].add(t[1])
        d[t[1]][1].add(t[0])

    # 遍历统计结果
    for key in d.keys():
        trustSet, trustedSet = d[key]

        # 如果符合题意，返回元素编号
        if len(trustedSet) == n - 1 and len(trustSet) == 0:
            return key

    # 没有符合题意的返回 -1
    return -1
