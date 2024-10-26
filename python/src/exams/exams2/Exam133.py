""" 133-统计范围内的元音字符串数

"""

from typing import List


def vowelStrings(words: List[str], left: int, right: int) -> int:
    vowels = 'a', 'e', 'i', 'o', 'u',  # 元音字符元组

    c = 0
    for i in range(left, right + 1):
        w = words[i]
        if w.startswith(vowels) and w.endswith(vowels):
            c += 1

    return c
