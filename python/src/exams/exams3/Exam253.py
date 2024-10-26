""" 253-找出输掉零场或一场比赛的玩家

"""

from typing import List


def findWinners(matches: List[List[int]]) -> List[List[int]]:
    winner = set()  # 胜利者，没有 输掉任何比赛
    loser = set()  # 失败者，恰好输掉 一场 比赛
    eliminate = set()  # 淘汰者，输掉超过 一场 比赛

    # 循环处理比赛列表
    for w, l in matches:
        # 不在失败者和淘汰者中的加入胜利者队伍
        if w not in eliminate and w not in loser:
            winner.add(w)

        # 淘汰者队伍不需要处理
        if l not in eliminate:
            if l in loser:
                # 失败者 再败 加入淘汰队伍
                loser.remove(l)
                eliminate.add(l)
            else:
                if l in winner:
                    # 胜利者 需要删除
                    winner.remove(l)
                loser.add(l)  # 加入失败者队伍

    # 转换为列表并排序
    winnerList = list(winner)
    winnerList.sort()
    loserList = list(loser)
    loserList.sort()

    # 按要求组装成列表返回
    return [winnerList, loserList]
