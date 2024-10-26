""" 118-避免洪水泛滥

"""

from bisect import bisect
from typing import List


def avoidFlood(rains: List[int]) -> List[int]:
    ans = []  # 结果数组
    lakeMap = {}  # 辅助 非空湖泊 字典，值为每个湖泊最早可 抽干 的索引
    unused = []  # 填充 0 的可用索引

    # 遍历雨天数组，采用最先发生洪水湖泊优先处理
    for i in range(len(rains)):
        r = rains[i]
        if r == 0:
            # 晴天 预填 0 ， 不实际进行抽水操作。
            # 如果非空湖泊字典为空，不能预填 0，直接空抽 1 次
            if len(lakeMap) == 0:
                ans.append(1)
            else:
                ans.append(0)
                unused.append(i)  # 增加当前位置为可用索引
        else:
            if r not in lakeMap:
                # 雨天 空湖泊 直接装水
                lakeMap[r] = i
            else:
                # 非空湖泊 查找之前是否存在 预填 0 。 存在时使用第一个可用 晴天 抽干当前湖泊；不存在 预填 0 则此湖泊必然 发生洪水，返回 空的数组
                index = bisect(unused, lakeMap[r])
                if index == len(unused):
                    return []

                index = unused.pop(index)  # 实际使用的 抽干 索引位
                ans[index] = r
                lakeMap[r] = i  # 更新 最早可用

            ans.append(-1)  # 雨天 填 -1

    # 题目 不允许 抽干 0 湖泊
    for i in range(len(ans)):
        if ans[i] == 0:
            ans[i] = 1

    return ans
