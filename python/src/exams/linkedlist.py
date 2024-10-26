""" 题目限定的链表类

"""


# Definition for singly-linked list.
class ListNode:

    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    def __eq__(self, o: object) -> bool:
        # checking both objects of same class
        if not isinstance(o, ListNode):
            return False

        # 对比 val 值
        if self.val != o.val:
            return False

        # 遍历链表，逐个进行对比
        a = self.next
        b = o.next
        # 两个对象有一个是 None 则返回 False
        while a is not None:
            if b is None:
                return False

            # 对比 val 值
            if self.val != o.val:
                return False

            # 递推
            a = a.next
            b = b.next

        # 循环完成后 a is None
        if b is not None:
            return False

        return True


def create_listnode(nodes: list) -> ListNode:
    """ 根据数组元素值创建链表 """
    
    if nodes is None or len(nodes) < 1:
        return None

    head = None
    node = None
    for val in nodes[-1::-1]:
        head = ListNode(val, node)
        node = head

    return head
