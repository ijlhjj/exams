""" 90-统计对称整数的数目

"""


def count_symmetric_integers(low: int, high: int) -> int:
    count = 0

    # 遍历题目范围
    while low <= high:
        num_str = str(low)
        # 奇数位数字不会是题目的 对称整数
        if len(num_str) % 2 == 0:
            # 字符转为数字位列表
            digits = [int(d) for d in list(num_str)]
            mid = len(digits) // 2
            # 对比前后半子列表和
            if sum(digits[:mid]) == sum(digits[mid:]):
                count += 1

        low += 1

    return count
