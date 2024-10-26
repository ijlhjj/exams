""" 175-收集足够苹果的最小花园周长

"""


def minimumPerimeter(neededApples: int) -> int:
    length = 0  # 距离原点长度
    apples = 0  # 苹果树数量
    while apples < neededApples:
        length += 1

        # 4个边数量相同（取半开区间 (start, end]），此处计算上边数量
        # 计算第一象限的数量
        start = length  # (0, y)
        end = length * 2  # (x, y)

        count = (start + end) * (end - start + 1) / 2  # 等差数列的和
        # 上边数量 = 第一象限的数量 * 2 - start - end
        count = count * 2 - start - end

        apples += count * 4

    # 周长为 距离 * 8
    return length * 8
