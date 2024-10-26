""" 193-最大交换

"""


def maximumSwap(num: int) -> int:
    # 转为字符串列表
    chars = list(str(num))

    # 遍历列表中字符：当前字符不是最大数字，把当前字符和最后一个最大数字交换
    for i in range(len(chars)):
        k = i  # 最大数字索引
        m = chars[i]  # 最大数字，数字的比较和字符的比较一致
        # 从后一个字符查找最大的字符数字
        for j in range(i + 1, len(chars)):
            if chars[j] >= m:  # 查找最后一个
                k = j
                m = chars[j]

        # 如果当前字符不是最大数字，交换后退出循环
        if m != chars[i]:
            c = chars[k]
            chars[k] = chars[i]
            chars[i] = c
            break

    # 转换回数字
    return int("".join(chars))
