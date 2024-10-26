""" 66-电话号码的字母组合

    递归调用时在类中要加 self
"""

from typing import List

keypad = {'2': ['a', 'b', 'c'], '3': ['d', 'e', 'f'], '4': ['g', 'h', 'i'], '5': ['j', 'k', 'l'], '6': ['m', 'n', 'o'],
          '7': ['p', 'q', 'r', 's'], '8': ['t', 'u', 'v'], '9': ['w', 'x', 'y', 'z']}


def letter_combinations(digits: str) -> List[str]:
    letters = []  # 输入为空，返回为空

    if len(digits) == 1:  # 基准条件：1 位时直接返回
        n = digits[0]
        return keypad[n]
    elif len(digits) > 1:
        n = digits[0]
        chars = keypad[n]
        # 大于 1 位时循环拼装第 1 位和后续位数的组合
        sub_arr = letter_combinations(digits[1:])
        for c in chars:
            for s in sub_arr:
                letters.append(c + s)

    return letters
