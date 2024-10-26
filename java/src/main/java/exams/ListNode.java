package exams;

import java.util.Objects;

/**
 * Definition for singly-linked list.
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) // 检测是否引用同一个对象，这是经常采用的优化形式
            return true;
        if (obj == null) // null值返回false，必须的检测
            return false;
        // 比较是否是同一个类
        if (getClass() != obj.getClass()) return false;

        ListNode other = (ListNode) obj;

        //比较 val 和 next 是否相等
        return val == other.val && Objects.equals(next, other.next);
    }

    /**
     * 根据数组元素值创建链表
     *
     * @param nodes 创建链表的元素值，链表节点顺序同数组元素顺序
     * @return 空数组返回NULL，否则返回链表的头 head
     */
    public static ListNode createListNode(int[] nodes) {
        if (nodes == null || nodes.length < 1) return null;

        ListNode head = null;
        ListNode node = null;
        for (int i = nodes.length - 1; i >= 0; i--) {
            head = new ListNode(nodes[i], node);
            node = head;
        }

        return head;
    }

}
