""" 71-判别首字母缩略词

"""

from typing import List


def is_acronym(words: List[str], s: str) -> bool:
    if len(words) != len(s):
        return False

    for i in range(len(s)):
        w = words[i]
        c = s[i]
        if not w.startswith(c):
            return False

    return True
