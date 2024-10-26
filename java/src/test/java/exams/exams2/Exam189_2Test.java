package exams.exams2;

import exams.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Exam189_2Test {

    Exam189_2 exam = new Exam189_2();

    @Test
    void deleteDuplicates1() {
        ListNode expected = ListNode.createListNode(new int[]{1, 2, 5});
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 3, 4, 4, 5});
        ListNode actual = exam.deleteDuplicates(head);
        assertEquals(expected, actual);
    }

    @Test
    void deleteDuplicates2() {
        ListNode expected = ListNode.createListNode(new int[]{2, 3});
        ListNode head = ListNode.createListNode(new int[]{1, 1, 1, 2, 3});
        ListNode actual = exam.deleteDuplicates(head);
        assertEquals(expected, actual);
    }

    @Test
    void deleteDuplicates3() {
        assertNull(exam.deleteDuplicates(null));
        assertNull(exam.deleteDuplicates(null));
    }

    @Test
    void deleteDuplicates4() {
        ListNode head = ListNode.createListNode(new int[]{1, 1, 2, 2});
        assertNull(exam.deleteDuplicates(null));
    }

    @Test
    void deleteDuplicates5() {
        ListNode expected = ListNode.createListNode(new int[]{2, 3});
        ListNode head = ListNode.createListNode(new int[]{1, 1, 2, 3, 4, 4});
        ListNode actual = exam.deleteDuplicates(head);
        assertEquals(expected, actual);
    }

}
