""" 63-翻倍以链表形式表示的数字

"""

from typing import Optional

from exams.linkedlist import *


def double_it(head: Optional[ListNode]) -> Optional[ListNode]:
    num = head.val
    while head.next is not None:
        head = head.next
        num = num * 10 + head.val

    num *= 2

    nums = []
    if num == 0:  # 输入 0 的时候直接处理
        nums.append(0)
    else:
        while num > 0:
            d = num % 10
            nums.append(d)
            num //= 10

    nums.reverse()  # 将倒序转为正序

    return create_listnode(nums)
