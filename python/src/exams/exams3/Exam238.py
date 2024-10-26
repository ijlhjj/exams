""" 238-从双倍数组中还原原数组

"""

from bisect import bisect_left

from typing import List


def findOriginalArray(changed: List[int]) -> List[int]:
    # 数组长度不为偶数，不符合题意，直接返回 空数组
    size = len(changed)
    if size % 2 == 1:
        return []

    changed.sort()  # 排序

    # 特殊处理 0 元素，0 元素不为偶数个返回 空数组
    cZero = changed.count(0)
    if cZero % 2 == 1:
        return []

    result = [0] * (cZero // 2)  # 结果列表，添加半数 0 元素
    excludeSet = set()  # 双倍数组 的下标集合

    i = cZero  # 起始下标跳过 0 元素
    # 遍历列表其他元素
    while i < size:
        # 在 双倍数组 集合的下标不需处理
        if i not in excludeSet:
            # 对当前处理元素按题意： 值乘以 2 ，在列表中进行二分查找
            val = changed[i]
            doubleVal = val * 2
            index = bisect_left(changed, doubleVal)

            # 列表中没有找到 双倍元素，返回 空数组
            if index == size or changed[index] != doubleVal:
                return []

            # 处理连续相等元素，当前位置存在 c 个相等元素
            c = 1
            while changed[i + c] == val:
                c += 1

            # 对符合题意的元素加入结果列表
            j = 0
            d = size - index  # 防止下标越界
            while j < c:
                if j == d or changed[index + j] != doubleVal:
                    # 如果不存在连续 c 个 双倍元素，返回 空数组
                    return []
                else:
                    result.append(val)  # 加入结果元素
                    excludeSet.add(index + j)  # 加入 双倍元素 下标
                    j += 1

            i = i + c  # 下标递增 c 位
        else:
            # 下标增加 1
            i += 1

    # 符合 双倍数组 要求，返回结果列表
    return result
