""" 85-买钢笔和铅笔的方案数

"""


def ways_to_buy_pens_pencils(total: int, cost1: int, cost2: int) -> int:
    count = 0

    # 保证 cost1 是两者中较大者，减少循环次数
    if cost1 < cost2:
        cost1, cost2 = cost2, cost1

    # 最多可以买 cost1 商品数量
    c1 = total // cost1

    # 循环统计不同组合的购买
    for i in range(c1 + 1):
        # 最多可以买 cost2 商品数量
        c2 = (total - i * cost1) // cost2
        count += c2 + 1  # 统计不同组合，因为可以买 0 个，所以要加 1

    return count
