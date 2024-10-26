package exams.exams1;

import exams.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam6Test {

    Exam6 exam = new Exam6();

    @Test
    void addTwoNumbers1() {
        ListNode l1 = ListNode.createListNode(new int[]{2, 4, 3});
        ListNode l2 = ListNode.createListNode(new int[]{5, 6, 4});

        ListNode result = exam.addTwoNumbers(l1, l2);

        ListNode expected = ListNode.createListNode(new int[]{7, 0, 8});
        assertEquals(expected, result);
    }

    @Test
    void addTwoNumbers2() {
        ListNode l1 = ListNode.createListNode(new int[]{0});
        ListNode l2 = ListNode.createListNode(new int[]{0});

        ListNode result = exam.addTwoNumbers(l1, l2);
        assertEquals(0, result.val);
    }

    @Test
    void addTwoNumbers3() {
        ListNode l1 = ListNode.createListNode(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = ListNode.createListNode(new int[]{9, 9, 9, 9});

        ListNode result = exam.addTwoNumbers(l1, l2);

        ListNode expected = ListNode.createListNode(new int[]{8, 9, 9, 9, 0, 0, 0, 1});
        assertEquals(expected, result);
    }

}
