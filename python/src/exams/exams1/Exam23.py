""" 23-黑格子的数目

"""

from collections import defaultdict
from typing import List


def count_black_blocks(m: int, n: int, coordinates: List[List[int]]) -> List[int]:
    """ 统计黑格子数目块 """

    # 使用一个默认值字典来辅助当前块的黑格子数目，数量记在左上角格子中
    cells = defaultdict(int)

    # 遍历黑格子坐标列表，对有效索引内的最多4个块更新黑格子数目
    for coord in coordinates:
        x = coord[0]
        y = coord[1]
        cells[str(x) + '-' + str(y)] += 1  # 当前格子

        if x > 0:
            cells[str(x - 1) + '-' + str(y)] += 1  # 左边格子
        if y > 0:
            cells[str(x) + '-' + str(y - 1)] += 1  # 上边格子
        if x > 0 and y > 0:
            cells[str(x - 1) + '-' + str(y - 1)] += 1  # 左上格子

    # 初始化结果列表的 5 个元素为 0
    result = [0] * 5

    # 遍历统计结果
    for key, val in cells.items():
        coord = key.split('-')
        x = int(coord[0])
        y = int(coord[1])
        # 统计黑格在最后一行和最后一列的不能组成块，要排除掉
        if x < m - 1 and y < n - 1:
            result[val] += 1

    # 黑格为 0 的块等于块总数减去其它块的和
    for count in result:
        result[0] += count
    result[0] = (m - 1) * (n - 1) - result[0]

    return result
