""" 3-整数转罗马数字

"""


def int_to_roman(num: int) -> str:
    num_list = []
    position = 1000
    while position > 0:
        num_list.append(num // position)
        num = num % position
        position = position // 10

    # num <= 3999 , 千位不需要特殊处理
    s = ('M' * num_list[0])

    if num_list[1] > 0:  # 百位
        if num_list[1] == 9:
            s += 'CM'
        elif num_list[1] == 4:
            s += 'CD'
        elif num_list[1] >= 5:
            s += ('D' + ('C' * (num_list[1] - 5)))
        else:
            s += ('C' * num_list[1])

    if num_list[2] > 0:  # 十位
        if num_list[2] == 9:
            s += 'XC'
        elif num_list[2] == 4:
            s += 'XL'
        elif num_list[2] >= 5:
            s += ('L' + ('X' * (num_list[2] - 5)))
        else:
            s += ('X' * num_list[2])

    if num_list[3] > 0:  # 个位
        if num_list[3] == 9:
            s += 'IX'
        elif num_list[3] == 4:
            s += 'IV'
        elif num_list[3] >= 5:
            s += ('V' + ('I' * (num_list[3] - 5)))
        else:
            s += ('I' * num_list[3])

    return s
