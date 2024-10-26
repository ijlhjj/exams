""" 244-雇佣 K 位工人的总代价

"""

from collections import defaultdict
from typing import List


def totalCost(costs: List[int], k: int, candidates: int) -> int:
    # 雇佣人数等于总人数
    if k == len(costs):
        return sum(costs)

    cost = 0  # 总代价

    # 需要雇佣人数大于0时不断循环处理
    while k > 0:
        costPair = selectIndex(costs, k, candidates)  # 调用函数计算本次循环选中雇员代价
        cost += costPair[0]
        k -= costPair[1]

    return cost


def selectIndex(costs: List[int], k: int, candidates: int):
    """ 计算本次选中工人代价和数量 """

    # k小于一定值时采用遍历算法
    if k < 100:
        cost = innerTotalCost(costs, k, candidates)
        return cost, k

    length = len(costs)

    # 以字典方式存储每个代价值的下标，在循环中下标列表自然是已排好序的
    valIndex = defaultdict(list)
    for i in range(length):
        valIndex[costs[i]].append(i)

    # 所有值列表，排序
    values = list(valIndex.keys())
    values.sort()

    indexSet = set()  # 选中结果集合
    startRight = length - candidates  # 右侧可选的起始位置，避免循环中重复计算
    checked = 0  # 已选中数量
    while checked < k:
        for val in values:
            # 从最小元素逐个处理
            indexList = valIndex[val]

            for index in indexList:
                # 当前元素下标列表，在可选范围加入结果列表，不在范围时直接返回
                if index < candidates or index >= startRight:
                    # 在最前面或最后面 candidates 范围
                    indexSet.add(index)

                    # 选中元素达到要求时退出
                    if len(indexSet) == k:
                        break

            checked += len(indexList)

            if checked >= k:
                break

    # 没有选中元素时，加入部分选中元素
    if len(indexSet) < 1:
        cost = innerTotalCost(costs, k // 4, candidates)
        return cost, k // 4

    # 计算本次选中元素总代价
    cost = 0
    for i in indexSet:
        cost += costs[i]

    # 如果本次选中元素数量小于要求，处理列表已符合下次使用
    if len(indexSet) < k:
        indexList = list(indexSet)
        indexList.sort(reverse=True)

        for i in indexList:
            del costs[i]

    return cost, len(indexSet)


def innerTotalCost(costs: List[int], k: int, candidates: int) -> int:
    cost = 0  # 总代价

    i = 0
    while i < k:
        # 计算本次选中元素下标，元素值计入总代价，计数加1，移除选中元素
        index = selectCost(costs, candidates)
        val = costs[index]
        cost += val
        i += 1
        del costs[index]

    return cost


def selectCost(costs: List[int], candidates: int) -> int:
    """ 从限定条件中选定最小代价元素下标，由后往前遍历保证所选下标最小 """

    minCost = 10 ** 5
    index = len(costs) - 1

    # 最后面 candidates 范围代价最小元素
    for i in range(index, index - candidates, -1):
        # i小于0时已覆盖全部列表，可返回
        if i < 0:
            return index

        if costs[i] <= minCost:
            minCost = costs[i]
            index = i

    # 最前面 candidates 范围代价最小元素
    for i in range(candidates - 1, -1, -1):
        if costs[i] <= minCost:
            minCost = costs[i]
            index = i

    return index
