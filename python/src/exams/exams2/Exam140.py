""" 140-找出数组中的 K-or 值

"""

from typing import List


def findKOr(nums: List[int], k: int) -> int:
    digits = [0] * 31

    for n in nums:
        # 转换为二进制字符串
        binStr = format(n, 'b')
        l = len(binStr)
        for i in range(l):
            if binStr[l - i - 1] == '1':
                # 按位统计数位 1
                digits[i] += 1

    sum = 0
    for i in range(len(digits)):
        # 符合题目的 K-or ，按题目求 乘方 后加入总和
        if digits[i] >= k:
            n = 2 ** i
            sum += n

    return sum
