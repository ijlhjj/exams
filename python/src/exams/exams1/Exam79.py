""" 79-左旋转字符串

"""


def reverse_left_words(s: str, n: int) -> str:
    return s[n:] + s[:n]  # s[:i] + s[i:] 总是等于 s
