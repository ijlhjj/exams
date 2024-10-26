""" 123-根据规则将箱子分类

"""


def categorizeBox(length: int, width: int, height: int, mass: int) -> str:
    volume = length * width * height

    if mass >= 100:
        if max(length, width, height) >= 10 ** 4 or volume >= 10 ** 9:
            return 'Both'
        else:
            return 'Heavy'
    else:
        if max(length, width, height) >= 10 ** 4 or volume >= 10 ** 9:
            return 'Bulky'
        else:
            return 'Neither'

    return ''
