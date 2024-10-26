""" 69-合并两个有序链表

"""

from typing import Optional

from exams.linkedlist import ListNode


def merge_two_lists(list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
    # 如果一个链表为空，返回另一个链表。这个判断在两个都是 None 时 返回 None
    if list1 is None:
        return list2
    if list2 is None:
        return list1

    # 创建链表的新引用
    l1 = list1
    l2 = list2

    # 使用较小元素创建第一个节点
    node = None  # node 节点在递归时使用
    if l1.val < l2.val:
        node = l1
        l1 = l1.next
    else:
        node = l2
        l2 = l2.next

    head = node  # 定义头节点，最终返回头节点

    # 两个链表都不为空，使用较小的元素进行递进
    while l1 is not None and l2 is not None:
        if l1.val < l2.val:
            node.next = l1
            l1 = l1.next
        else:
            node.next = l2
            l2 = l2.next

        node = node.next

    # 在循环完后把仍然不为空的链表直接链接到后面
    if l1 is not None:
        node.next = l1
    if l2 is not None:
        node.next = l2

    return head
