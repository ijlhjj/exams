""" 186-构造有效字符串的最少插入数

"""


def addMinimum(word: str) -> int:
    charArr = ['a', 'b', 'c']  # 有效字符

    count = 0
    index = 0
    for c in word:
        s = charArr[index % 3]
        # 当前字符不匹配则一直插入
        while c != s:
            count += 1
            index += 1
            s = charArr[index % 3]
        index += 1

    # 最后必须拼成字符c结尾。word.length <= 50 ，使用 51 保证差值不为负数
    diff = (51 - index) % 3
    return count + diff
