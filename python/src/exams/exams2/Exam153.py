""" 153-确定两个字符串是否接近

"""

import collections


def closeStrings(word1: str, word2: str) -> bool:
    # 长度不相等字符串不可能 接近
    if len(word1) != len(word2):
        return False

    # 存在不同字符的两个字符串不可能 接近
    if set(word1) ^ set(word2):
        return False

    # 使用 Counter 统计获取字符频次
    char_count1 = collections.Counter(word1).most_common()
    char_count2 = collections.Counter(word2).most_common()

    for count1, count2 in zip(char_count1, char_count2):
        # 字符频次相同时可通过多次操作达到 接近，频次不同返回 False
        if count1[1] != count2[1]:
            return False

    return True
