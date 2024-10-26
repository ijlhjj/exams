""" 188-构造限制重复的字符串

"""


def repeatLimitedString(s: str, repeatLimit: int) -> str:
    # 转为字符列表并排序
    chars = list(s)
    chars.sort()

    word = []  # 定义结果字符列表
    prevChar = ''  # 存储上一个字符，判断字符是否重复
    repeatCount = 0  # 字符重复次数

    # 存在可用字符时继续处理
    while len(chars) > 0:
        i = len(chars) - 1  # 当前处理下标

        if chars[i] != prevChar:  # 字符不重复：加入结果列表，重复次数赋值为 1
            prevChar = chars[i]
            word.append(prevChar)
            repeatCount = 1
        elif repeatCount < repeatLimit:  # 字符重复，重复次数不超限制：加入结果列表，重复次数加 1
            word.append(prevChar)
            repeatCount += 1
        else:  # 字符重复，重复次数达到限制
            i -= 1
            # 不断后推下标，查找第一个不重复字符
            while i >= 0:
                # 找到不重复字符：加入结果列表，重复次数赋值为 1
                if chars[i] != prevChar:
                    prevChar = chars[i]
                    word.append(prevChar)
                    repeatCount = 1
                    break
                i -= 1
            else:  # 找不到不重复字符，则处理完成，跳出循环
                break

        chars.pop(i)  # 按下标删除已使用字符

    # 拼装结果为字符串返回
    return ''.join(word)
