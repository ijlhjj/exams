package exams.exams1;

import exams.ListNode;

/**
 * 6-两数相加
 *
 * @author ijlhjj
 * @version 1.0 2023-06-28
 */
public class Exam6 {

    /**
     * 逆序链表求和函数
     *
     * @param : 两个链表非空
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val = l1.val + l2.val; // 第一个节点的和
        ListNode nextNode = new ListNode(val % 10); // 用个位数创建第一个节点
        ListNode head = nextNode; // 把第一个节点赋给链表头，作为返回值

        // 两个链表都有下一个元素
        while (l1.next != null && l2.next != null) {
            // 递归两个链表的下一元素
            l1 = l1.next;
            l2 = l2.next;

            // 和等于两个节点值加上上一个节点的进位
            val = l1.val + l2.val + (val / 10);

            // 用个位数创建节点，赋值给后续节点引用，并递归节点
            nextNode.next = new ListNode(val % 10);
            nextNode = nextNode.next;
        }

        // 以下两个循环最多只会有一个执行，因为第一个循环完必然最少有一个为 null
        // 如果第一个链表还有后续节点，递归创建后续节点
        while (l1.next != null) {
            l1 = l1.next;

            val = l1.val + (val / 10); // 当前值加上进位

            // 用个位数创建节点，赋值给后续节点引用，并递归节点
            nextNode.next = new ListNode(val % 10);
            nextNode = nextNode.next;
        }

        // 如果第二个链表还有后续节点，递归创建后续节点
        while (l2.next != null) {
            l2 = l2.next;

            val = l2.val + (val / 10); // 当前值加上进位

            // 用个位数创建节点，赋值给后续节点引用，并递归节点
            nextNode.next = new ListNode(val % 10);
            nextNode = nextNode.next;
        }

        // 如果最后一次求和还有进位，则创建一个进位节点
        if (val / 10 > 0) {
            nextNode.next = new ListNode(val / 10);
        }

        return head; // 返回链表头
    }

}
