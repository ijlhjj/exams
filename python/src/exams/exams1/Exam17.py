""" 17-链表的中间结点

"""

from typing import Optional

from exams.linkedlist import ListNode


def middle_node(head: Optional[ListNode]) -> Optional[ListNode]:
    nodes = []
    node = head
    nodes.append(node)

    count = 1
    while (node := node.next) is not None:
        nodes.append(node)
        count += 1

    mid = count // 2
    return nodes[mid]
