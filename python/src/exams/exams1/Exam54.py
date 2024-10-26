""" 54-反转字符串中的单词 III

"""


def reverse_words(s: str) -> str:
    str_list = s.split(' ')
    for i in range(len(str_list)):
        str_list[i] = str_list[i][::-1]
    return ' '.join(str_list)
