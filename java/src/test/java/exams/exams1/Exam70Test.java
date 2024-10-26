package exams.exams1;

import exams.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Exam70Test {

    @Test
    void swapPairs() {
        Exam70 exam = new Exam70();

        ListNode expected = ListNode.createListNode(new int[]{2, 1, 4, 3});
        ListNode head = ListNode.createListNode(new int[]{1, 2, 3, 4});
        ListNode actual = exam.swapPairs(head);
        assertEquals(expected, actual);

        assertNull(exam.swapPairs(null));

        expected = ListNode.createListNode(new int[]{1});
        head = ListNode.createListNode(new int[]{1});
        actual = exam.swapPairs(head);
        assertEquals(expected, actual);
    }

}
