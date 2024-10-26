""" 269-执行子串操作后的字典序最小字符串

"""


def smallestString(s: str) -> str:
    l = len(s)
    chars = list(s)  # 字符串具有不可变性，此处转为列表处理

    # 从第一个字符开始处理，找第一个不是 a 的字符
    i = 0
    while i < l:
        if chars[i] == 'a':
            i += 1
        else:
            break

    # 全是 a 也必须执行一次替换
    if i == l:
        chars[l - 1] = 'z'

    # 从第一个不是 a 的字符开始，替换到之后第一个字符 a 或者结尾
    while i < l:
        if chars[i] != 'a':
            ud = ord(s[i])
            ud -= 1
            chars[i] = chr(ud)
            i += 1
        else:
            break

    return ''.join(chars)
