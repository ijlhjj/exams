""" 94-生成特殊数字的最少操作

"""


def minimum_operations(num: str) -> int:
    """ 按题目描述，转为求最少删除多少字符可以使字符串以 25、50、75、100 结尾，或删除为 0

    """

    # 初始赋值为字符串长度，题解不可能大于这个值
    c0 = c25 = c50 = c75 = c100 = len(num)

    # 求 25、75 题解
    last_index = num.rfind('5')
    if last_index > 0:
        first1 = num.rfind('2', 0, last_index)
        if first1 >= 0:
            c25 = len(num) - first1 - 2

        first2 = num.rfind('7', 0, last_index)
        if first2 >= 0:
            c75 = len(num) - first2 - 2

    # 求 0、50、100 题解
    last_index = num.rfind('0')
    if last_index >= 0:
        c0 -= 1

        first1 = num.rfind('5', 0, last_index)
        if first1 >= 0:
            c50 = len(num) - first1 - 2

        first2 = num.rfind('0', 0, last_index)
        if first2 >= 0:
            c100 = len(num) - first2 - 2

    # 返回其中最小值
    return min([c0, c25, c50, c75, c100])
