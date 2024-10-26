""" 3-罗马数字转整数

"""

roman_int_map = {"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000, "IV": 4, "IX": 9, "XL": 40, "XC": 90,
                 "CD": 400, "CM": 900}
roman_num = {"IV", "IX", "XL", "XC", "CD", "CM"}


def roman_to_int(s: str) -> int:
    # 只有1位直接转换
    if len(s) == 1:
        return roman_int_map[s]

    num = 0  # 转换后的值
    index = 0  # 处理索引位

    # 每次循环可能处理两位，所以索引最大是倒数第2位，避免下标越界
    while index < len(s) - 1:
        r = s[index:  index + 2]  # 取2个字符

        if r in roman_num:  # 如果是2位罗马数字，数字计和后索引多加1位
            num += roman_int_map.get(r)
            index += 1
        else:  # 不是2位罗马数字只计和
            num += roman_int_map.get(s[index])

        index += 1  # 索引加1

    # 循环对结尾不是2位罗马数字的最后一位没有处理，在这里处理最后1位
    if index < len(s):
        num += roman_int_map.get(s[index])

    return num
