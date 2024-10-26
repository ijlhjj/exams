""" 100-包含三个字符串的最短字符串

"""

from operator import itemgetter


def concat_string(a: str, b: str) -> str:
    if a.find(b) != -1:
        return a

    if b.find(a) != -1:
        return b

    for i in range(1, len(b)):
        sub = b[:-i]
        if a.endswith(sub):
            return a + b[-i:]

    return a + b  # 两个字符串没有任何重叠时直接拼接


def minimum_string(a: str, b: str, c: str) -> str:
    # 穷举所有可能拼接
    abc = concat_string(concat_string(a, b), c)
    acb = concat_string(concat_string(a, c), b)
    bac = concat_string(concat_string(b, a), c)
    bca = concat_string(concat_string(b, c), a)
    cab = concat_string(concat_string(c, a), b)
    cba = concat_string(concat_string(c, b), a)

    str_list = [[len(abc), abc], [len(acb), acb], [len(bac), bac], [len(bca), bca], [len(cab), cab], [len(cba), cba]]

    # 按题目要求进行排序
    str_list = sorted(str_list, key=itemgetter(0, 1))

    return str_list[0][1]  # 返回排序后的第一个字符串
