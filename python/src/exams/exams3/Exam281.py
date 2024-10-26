""" 281-账户合并

"""

from typing import List


def accountsMerge(accounts: List[List[str]]) -> List[List[str]]:
    # 使用元组列表辅助处理： [(emails, name), (emails, name), ...]
    accountTuple = []

    for acct in accounts:
        tmpTuple = []
        # 第一个元素 accounts[i][0] 是 名称 (name)，其余元素是 emails 表示该账户的邮箱地址
        name = acct[0]
        emails = set(acct[1:])

        for es, n in accountTuple:
            if es & emails:
                emails.update(es)  # 更新集合
            else:
                tmpTuple.append((es, n))  # 不重叠添加新记录

        tmpTuple.append((emails, name))
        accountTuple = tmpTuple

    result = []  # 定义结果列表
    for e, n in accountTuple:
        # 邮箱集合转列表并排序
        emails = list(e)
        emails.sort()
        # 定义列表组合名称和邮箱
        acct = [n]
        acct.extend(emails)
        result.append(acct)

    return result
