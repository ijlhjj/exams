package exams.exams4;

import exams.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam315Test {

    @Test
    void mergeNodes1() {
        Exam315 exam = new Exam315();
        ListNode head = ListNode.createListNode(new int[]{0, 3, 1, 0, 4, 5, 2, 0});
        ListNode expected = ListNode.createListNode(new int[]{4, 11});
        assertEquals(expected, exam.mergeNodes(head));
    }

    @Test
    void mergeNodes2() {
        Exam315 exam = new Exam315();
        ListNode head = ListNode.createListNode(new int[]{0, 1, 0, 3, 0, 2, 2, 0});
        ListNode expected = ListNode.createListNode(new int[]{1, 3, 4});
        assertEquals(expected, exam.mergeNodes(head));
    }

}
