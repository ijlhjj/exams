""" 测试辅助工具模块

"""


def read_nums_from_file(filename: str, sep=',', encode="utf-8") -> list:
    """ 从文件中读取整型数组

    :param filename: 文件路径
    :param sep: 分隔符
    :param encode: 文件编码
    :return: 整型数组
    """

    nums = []
    with open(filename, encoding=encode) as f:
        test_data = f.read()
        num_str = test_data.split(sep)
        for num in num_str:
            nums.append(int(num))

    return nums


def write_nums_to_file(nums: list, filename: str, mode='w', encode="utf-8", sep=','):
    """ 把整型数组写入文件

    :param nums: 整型数组
    :param filename: 文件路径
    :param mode:
    :param sep: 分隔符
    :param encode: 文件编码
    """

    num_str = [str(n) for n in nums]
    with open(filename, mode, encoding=encode) as f:
        f.write(sep.join(num_str))


def read_lines_from_file(filename: str, encode="utf-8") -> list:
    """ 从文件中读取字符串数组

    :param filename: 文件路径
    :param encode: 文件编码
    :return: 字符串数组
    """

    lines = []
    with open(filename, encoding=encode) as f:
        for row in f.readlines():
            lines.append(row.strip())

    return lines


def read_str_from_file(filename: str, encode="utf-8") -> str:
    """ 从文件中读取字符串

    :param filename: 文件路径
    :param encode: 文件编码
    :return: 字符串
    """

    with open(filename, encoding=encode) as f:
        return f.read()
