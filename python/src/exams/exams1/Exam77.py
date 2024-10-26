""" 77-反转链表

"""

from typing import Optional

from exams.linkedlist import ListNode


def reverse_list(head: Optional[ListNode]) -> Optional[ListNode]:
    if head is None:
        return None

    nodes = []
    while head is not None:
        nodes.append(head)
        head = head.next

    for i in range(len(nodes)):
        nodes[i].next = head
        head = nodes[i]

    return head
