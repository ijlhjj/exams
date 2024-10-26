""" 138-最短且字典序最小的美丽子字符串

"""


def shortestBeautifulSubstring(s: str, k: int) -> str:
    beautifulStringList = []  # 存放符合要求的美丽子字符串

    sLen = len(s)
    # 循环查找 美丽子字符串
    for i in range(sLen - k + 1):
        if s[i] == '1':
            for j in range(i + k, sLen + 1):
                subStr = s[i:j]
                if subStr.count('1') == k:
                    beautifulStringList.append(subStr)
                    break  # 继续循环不可能长度最短

    # 没有找到 美丽子字符串 返回空
    if len(beautifulStringList) == 0:
        return ''

    # 按字符串长度和字符序进行排序
    beautifulStringList.sort(key=lambda x: (len(x), x))

    return beautifulStringList[0]
