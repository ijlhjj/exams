""" 125-统计能整除数字的位数

"""


def countDigits(num: int) -> int:
    c = 0

    numStr = str(num)
    for n in numStr:
        if num % int(n) == 0:
            c += 1

    return c
