""" 4-最长公共前缀

"""

from typing import List


def longest_common_prefix(strs: List[str]) -> str:
    """ 查找字符串数组中的最长公共前缀 """

    result = ''  # 存储最终返回的字符串
    s1 = strs[0]
    length_s1 = len(s1)  # 第一个字符串长度，输入保证最少有一个字符串

    # 如果第一个字符串为空，不用处理，直接返回空字符串
    if length_s1 > 0:
        i = 0
        strs = strs[1:]

        # 按第一个字符串进行循环处理
        while i < length_s1:
            c1 = s1[i]  # 当前对比字符串

            # 循环对比其它字符串对应字符，j从1开始
            for s in strs:
                if not (i < len(s) and c1 == s[i]):
                    return result

            result = result + c1  # 如果所有字符串的当前字符都相同，则加入比对结果
            i += 1

    return result
