""" 191-拿出最少数目的魔法豆

"""

from typing import List


def minimumRemoval(beans: List[int]) -> int:
    beans.sort()  # 列表排序

    size = len(beans)  # 列表长度

    # 定义等长列表记录前置元素归0总和。即如果非空数量为当前数量，则比它小的数都要归0
    preSumList = []
    preNum = 0  # 上一个数，比对元素是否相等
    totalSum = 0  # 元素总和

    # 循环处理列表元素
    for i in range(size):
        if beans[i] != preNum:
            # 如果当前元素不等于上一个元素，则归0数量为前置元素总和
            preSumList.append(totalSum)
            preNum = beans[i]  # 赋值当前元素
        else:
            # 如果元素相等，则取值上一归0数量
            preSumList.append(preSumList[i - 1])
        totalSum += beans[i]  # 计入总和

    # 后置元素总和
    postSumList = []  # 后置元素总和列表
    currSum = 0
    for i in range(size):
        currSum += beans[i]
        postSumList.append(totalSum - currSum)

    minOp = 10 ** 10  # 最小操作次数赋初值上限

    # 循环处理列表元素
    for i in range(size):
        # 非空数量为当前数量，前置归0总和
        preSum = preSumList[i]
        # 后置相等操作数
        postSum = postSumList[i] - beans[i] * (size - i - 1)
        # 操作数更小时更新
        sumVal = preSum + postSum
        if sumVal < minOp:
            minOp = sumVal

    return minOp
