package exams.exams2;

import exams.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam189Test {

    Exam189 exam = new Exam189();

    @Test
    void deleteDuplicates1() {
        ListNode expected = ListNode.createListNode(new int[]{1, 2});
        ListNode head = ListNode.createListNode(new int[]{1, 1, 2});
        ListNode actual = exam.deleteDuplicates(head);
        assertEquals(expected, actual);
    }

    @Test
    void deleteDuplicates2() {
        ListNode expected = ListNode.createListNode(new int[]{1, 2, 3});
        ListNode head = ListNode.createListNode(new int[]{1, 1, 2, 3, 3});
        ListNode actual = exam.deleteDuplicates(head);
        assertEquals(expected, actual);
    }

}
