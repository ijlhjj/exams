""" 170-判别首字母缩略词

"""

from typing import List


def isAcronym(words: List[str], s: str) -> bool:
    if len(words) != len(s):
        return False

    chars = ''
    for w in words:
        chars = chars + w[0]

    return chars == s
