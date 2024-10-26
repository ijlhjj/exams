""" 220-找出美丽数组的最小和

"""


def minimumPossibleSum(n: int, target: int) -> int:
    """ 对于大数据值，题目分析后使用序列和解题公式

        使用序列和公式 Sn=n(a1+an)/2
    """

    total = 0

    mid = target // 2  # target的半值
    if mid > n:
        # 数组元素不超过半值的情况
        c = 0
        while c < n:
            c += 1
            total += c
    else:
        # 大数据值的情况
        total = (1 + mid) * mid // 2  # 从 1……mid 的任意两个数值和不可能达到 target

        # mid……target-1 之间的值不能取，因为与前半段之和等于 target
        # target之后还需要 (n - mid) 个数值，起始值为 target，截止值为 (target + n - mid - 1)
        total += (target + target + n - mid - 1) * (n - mid) // 2

    # 返回总和取模后的余
    return total % (10 ** 9 + 7)
