""" 44-反转字符串中的单词

"""


def reverse_words(s: str) -> str:
    # 按空格分隔字符串
    s_arr = s.split(' ')

    # 过滤分隔后的空字符
    s_list = [e for e in s_arr if len(e) > 0]

    # 反转列表顺序
    s_list.reverse()

    # 以空格进行字符串拼装
    return ' '.join(s_list)
