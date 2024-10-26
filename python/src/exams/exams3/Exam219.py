""" 219-找出字符串的可整除数组

"""

from typing import List


def divisibilityArray(word: str, m: int) -> List[int]:
    divs = []  # 可整除标识数组

    remainder = 0  # 余数
    # 循环处理每一位
    for i in range(len(word)):
        digit = int(word[i])  # 将当前位转为数字
        remainder = remainder * 10 + digit  # 上次余数乘以10再加上当前位
        remainder = remainder % m  # 求余

        # 可整除标识为 1，否则为 0
        if remainder == 0:
            divs.append(1)
        else:
            divs.append(0)

    return divs
