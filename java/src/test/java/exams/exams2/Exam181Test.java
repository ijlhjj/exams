package exams.exams2;

import exams.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam181Test {

    Exam181 exam = new Exam181();

    @Test
    void insertGreatestCommonDivisors1() {
        ListNode expected = ListNode.createListNode(new int[]{18, 6, 6, 2, 10, 1, 3});
        ListNode head = ListNode.createListNode(new int[]{18, 6, 10, 3});
        ListNode actual = exam.insertGreatestCommonDivisors(head);
        assertEquals(expected, actual);
    }

    @Test
    void insertGreatestCommonDivisors2() {
        ListNode expected = ListNode.createListNode(new int[]{7});
        ListNode head = ListNode.createListNode(new int[]{7});
        ListNode actual = exam.insertGreatestCommonDivisors(head);
        assertEquals(expected, actual);
    }

}
