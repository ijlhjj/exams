""" 131-重复的DNA序列

"""

from typing import List


def findRepeatedDnaSequences(s: str) -> List[str]:
    onceSet = set()  # 出现一次的DNA序列
    repeatSet = set()  # 重复出现的DNA序列

    i = 0
    n = len(s) - 9  # 取不到10个字符时停止
    while i < n:
        # 截取10个字符，出现过一次，加入重复集合，不曾出现的加入一次集合
        tenChar = s[i:i + 10]
        if tenChar in onceSet:
            repeatSet.add(tenChar)
        else:
            onceSet.add(tenChar)
        i += 1

    # 转为 list 返回
    return list(repeatSet)
