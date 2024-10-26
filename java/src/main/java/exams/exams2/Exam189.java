package exams.exams2;

import exams.ListNode;

/**
 * 189-删除排序链表中的重复元素
 *
 * @author ijlhjj
 * @version 1.0 2024-01-14
 */
public class Exam189 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;

        int repeatVal = head.val;
        ListNode currNode = head;

        while (currNode.next != null) {
            if (currNode.next.val == repeatVal) {
                currNode.next = currNode.next.next;
            } else {
                repeatVal = currNode.next.val;
                currNode = currNode.next;
            }
        }

        return head;
    }

}
