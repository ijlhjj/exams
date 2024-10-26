""" 5-有效的括号

"""

braceMap = {'(': ')', '{': '}', '[': ']'}


def is_valid(s: str) -> bool:
    """ 判断有效的括号方法

            1 <= s.length <= 10^4
            s 仅由括号 '()[]{}' 组成
    """

    # 奇数字符长度不可能完全匹配，减少长字符匹配校验的一个优化
    if len(s) % 2 != 0:
        return False

    buff = []  # 匹配缓冲堆栈

    # 按逐字符进行循环匹配
    for c in s:
        if c in braceMap:  # 左括号加入堆栈
            buff.append(c)
        elif len(buff) < 1 or c != braceMap.get(buff.pop()):
            # 如果是右括号，堆栈顶应该是与之匹配的左括号
            # 返回False的条件：缓冲堆栈为空，没有匹配的左括号；当前字符与缓冲堆栈栈顶元素作为key对应的右括号不相同。
            return False

    return len(buff) == 0  # 正确匹配缓冲堆栈为空
