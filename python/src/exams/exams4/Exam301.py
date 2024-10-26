""" 301-K 周期字符串需要的最少操作次数

"""

from collections import defaultdict


def minimumOperationsToMakeKPeriodic(word: str, k: int) -> int:
    l = len(word)

    # 分组统计 K 周期字符串出现的次数
    counter = defaultdict(int)
    i = 0
    while i < l:
        counter[word[i:i + k]] += 1
        i += k

    # 查找出现频率最高的次数
    mc = 0
    for v in counter.values():
        if v > mc:
            mc = v

    # 返回其他字符串全部变更为最高频率字符串需要的操作次数
    return l // k - mc
