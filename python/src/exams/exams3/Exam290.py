""" 290-正方形中的最多点数

"""

from collections import defaultdict
from typing import List


def maxPointsInsideSquare(points: List[List[int]], s: str) -> int:
    # 使用默认值字典按标签分组点坐标
    titlePoint = defaultdict(list)
    chars = list(s)

    for i, c in enumerate(chars):
        titlePoint[c].append(points[i])

    limit = 10 ** 9
    maxDistance = limit

    # 遍历标签分组计算正方形不包含重复点时可用最大距离
    for vals in titlePoint.values():
        if len(vals) > 1:
            firstDis = limit
            secondDis = limit
            # 遍历列表计算最小和第2小的距离
            for v in vals:
                # 坐标转为绝对值计算距离
                d = max(abs(v[0]), abs(v[1]))

                if d < firstDis:
                    secondDis = firstDis
                    firstDis = d
                elif d < secondDis:
                    secondDis = d

            if secondDis - 1 < maxDistance:
                maxDistance = secondDis - 1

    # 遍历坐标点，在正方形范围内的进行统计
    c = 0
    for p in points:
        if abs(p[0]) <= maxDistance and abs(p[1]) <= maxDistance:
            c += 1
    return c
