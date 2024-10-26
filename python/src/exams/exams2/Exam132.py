""" 132-最大单词长度乘积

"""

from typing import List


def maxProduct(words: List[str]) -> int:
    # 长度倒排序，可以减少计算量
    words.sort(key=lambda s: len(s), reverse=True)

    p = 0  # 最大单词长度乘积
    listSize = len(words)
    for i in range(listSize - 1):
        # 外层循环到倒数第2个元素即可
        for j in range(i + 1, listSize):
            p1 = len(words[i]) * len(words[j])  # 计算长度乘积
            # 长度乘积更大并且两个单词不含有公共字母
            if p1 > p:
                if not (set(words[i]) & set(words[j])):
                    p = p1

    return p
