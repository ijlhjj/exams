""" 37-合并区间

"""

from typing import List


def merge(intervals: List[List[int]]) -> List[List[int]]:
    non_sequence_intervals = []  # 结果的不连续列表

    # 对列表排序后可以进行递增处理
    intervals.sort()

    # 使用第1个列表作为初始值，循环处理后续元素
    interval = intervals[0]
    for i in range(1, len(intervals)):
        curr = intervals[i]  # 当前处理元素

        # 左边界存在重叠，interval[0] <= curr[0] 可以忽略（排序后必然满足）
        if interval[0] <= curr[0] <= interval[1]:
            # 需要合并区间，可能存在第1个区间完全包括第2个区间的情况
            if curr[1] > interval[1]:
                interval = [interval[0], curr[1]]
        else:
            # 不再重叠时加入结果列表
            non_sequence_intervals.append(interval)
            interval = curr

    non_sequence_intervals.append(interval)  # 加入最后1个区间

    return non_sequence_intervals
