package exams.exams1;

import exams.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Exam68Test {

    Exam68 exam = new Exam68();

    @Test
    void removeNthFromEnd1() {
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4, 5});
        ListNode node = exam.removeNthFromEnd(head, 2);

        ListNode expected = ListNode.createListNode(new int[]{1, 2, 3, 5});
        assertEquals(expected, node);
    }

    @Test
    void removeNthFromEnd2() {
        ListNode head = ListNode.createListNode(new int[]{1});
        ListNode node = exam.removeNthFromEnd(head, 1);
        assertNull(node);
    }

    @Test
    void removeNthFromEnd3() {
        ListNode head = ListNode.createListNode(new int[]{1, 2});
        ListNode node = exam.removeNthFromEnd(head, 1);
        assertEquals(1, node.val);
    }

}
