""" 160-下一个更大的数值平衡数

"""


def nextBeautifulNumber(n: int) -> int:
    while True:
        n += 1  # 严格大于
        if equilibriumNumber(n):
            return n


def equilibriumNumber(n: int) -> bool:
    """ 数值平衡数

        如果整数 n 满足：对于每个数位 d ，这个数位在 n 中 恰好 出现 d 次
    """

    num = str(n)
    digitSet = set(num)  # 数位的字符集合

    for d in digitSet:
        # 统计字符出现次数 对比 字符数字
        if int(d) != num.count(d):
            return False

    return True
