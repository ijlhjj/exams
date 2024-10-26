""" 10-N 字形变换

"""


def convert(s: str, num_rows: int) -> str:
    # 只有1行直接返回
    if num_rows == 1:
        return s

    # 使用列表存放处理字符序列
    str_list = [''] * num_rows

    row = 0
    step = -1
    for c in s:
        str_list[row] += c

        # 到达第一行或最后一行，步长取负
        if row == 0 or row == num_rows - 1:
            step = -step

        row += step

    # 拼装结果
    result = ''
    for line in str_list:
        result += line

    return result
