""" 114-最小和分割

"""


def splitNum(num: int) -> int:
    charArr = list(str(num))
    charArr.sort()

    numStr1 = [charArr[i] for i in range(len(charArr)) if i % 2 == 0]
    numStr2 = [charArr[i] for i in range(len(charArr)) if i % 2 != 0]

    num1 = int(''.join(numStr1))
    num2 = int(''.join(numStr2))

    return num1 + num2
