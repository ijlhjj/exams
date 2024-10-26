package exams.exams1;

import exams.ListNode;

/**
 * 70-两两交换链表中的节点
 *
 * @author ijlhjj
 * @version 1.0 2023-08-23
 */
public class Exam70 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        //交换头节点
        ListNode curr = head;
        ListNode node = curr.next;

        curr.next = node.next;
        node.next = curr;

        head = node;

        //循环交换后续节点
        while (curr.next != null && curr.next.next != null) {
            ListNode pre = curr.next;
            node = pre.next;

            pre.next = node.next;
            node.next = pre;

            curr.next = node;
            curr = pre;
        }

        return head;
    }

}
