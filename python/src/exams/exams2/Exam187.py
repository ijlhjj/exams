""" 187-统计出现过一次的公共字符串

"""

from collections import Counter

from typing import List


def countWords(words1: List[str], words2: List[str]) -> int:
    # 使用计数器返回排序列表
    counter1 = Counter(words1).most_common()
    counter1.reverse()

    # 在 3.7 版更改: Counter 作为 dict 的子类
    counter2 = Counter(words2)

    c = 0
    for k, v in counter1:
        # 次数大于1时不再处理剩余元素
        if v > 1:
            break

        if counter2[k] == 1:
            c += 1

    return c
