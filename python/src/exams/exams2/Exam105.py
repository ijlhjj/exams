""" 105-最后一个单词的长度

"""


def lengthOfLastWord(s: str) -> int:
    return len(s.split()[-1])
