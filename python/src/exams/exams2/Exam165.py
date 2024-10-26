""" 165-字典序最小回文串

"""


def makeSmallestPalindrome(s: str) -> str:
    chars = list(s)

    # 双指针
    l = len(chars)
    j = l // 2
    i = j - 1

    if l % 2 == 1:  # 奇数长度不处理中间元素
        j += 1

    # 逐个字符对比，不相同时大的替换为小的
    d = 0
    while j + d < l:
        if chars[i - d] < chars[j + d]:
            chars[j + d] = chars[i - d]
        elif chars[i - d] > chars[j + d]:
            chars[i - d] = chars[j + d]
        d += 1

    return "".join(chars)
