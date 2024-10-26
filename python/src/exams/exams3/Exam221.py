""" 221-猜数字游戏

"""

from collections import Counter


def getHint(secret: str, guess: str) -> str:
    # 分别统计两个字符串
    sCounter = Counter(secret)
    gCounter = Counter(guess)

    # 按位计数 A 的数量
    a = 0
    for i in range(len(secret)):
        if secret[i] == guess[i]:
            # 数字和位置都对：数量加 1 ，统计器数值各减 1
            a += 1
            sCounter.subtract({secret[i]: 1})
            gCounter.subtract({secret[i]: 1})

    # 合并两个统计器中 B 的数值
    b = (sCounter & gCounter).total()

    # 拼装返回结果字符串
    return str(a) + 'A' + str(b) + 'B'
