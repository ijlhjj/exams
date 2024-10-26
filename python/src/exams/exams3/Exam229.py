""" 229-故障键盘

"""


def finalString(s: str) -> str:
    res = ''

    for c in s:
        if c == 'i':
            res = res[::-1]
        else:
            res = res + c

    return res
