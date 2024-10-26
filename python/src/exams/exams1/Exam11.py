""" 11-整数反转

"""

# 题目要求的整型值上下限
MAX_INT = 2 ** 31 - 1
MIN_INT = -2 ** 31


def reverse(x: int) -> int:
    """ 除符号位外对数字部分取反 """

    num = str(x)  # 使用字符串进行取反操作

    # 只对数字部分取反
    if num[0: 1] == '-':
        num = num[0: 1] + num[:0:-1]
    else:
        num = num[::-1]

    d = int(num)  # 取反结果转回 int

    # 按题目要求超出限制范围返回 0
    if d > MAX_INT or d < MIN_INT:
        d = 0

    return d
