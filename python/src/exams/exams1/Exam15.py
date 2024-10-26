""" 15-最富有客户的资产总量

"""

from typing import List


def maximum_wealth(accounts: List[List[int]]) -> int:
    max_row = 0

    for row in accounts:
        row_sum = 0

        for account in row:
            row_sum += account

        if row_sum > max_row:
            max_row = row_sum

    return max_row
