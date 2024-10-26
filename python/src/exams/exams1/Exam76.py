""" 76-从尾到头打印链表

"""

from typing import List

from exams.linkedlist import ListNode


def reverse_print(head: ListNode) -> List[int]:
    nums = []

    if head is None:
        return nums

    node = head
    nums.append(node.val)

    while node.next is not None:
        node = node.next
        nums.append(node.val)

    nums.reverse()

    return nums
