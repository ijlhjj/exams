package exams.exams4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exam335Test {

    @Test
    void canJump() {
        Exam335 exam = new Exam335();
        assertTrue(exam.canJump(new int[]{2, 3, 1, 1, 4})); //动态规划
        assertFalse(exam.canJump(new int[]{3, 2, 1, 0, 4}));
        assertFalse(exam.canJump(new int[]{1, 0, 8, 0}));

        assertTrue(exam.canJump1(new int[]{2, 3, 1, 1, 4})); //递归
        assertFalse(exam.canJump1(new int[]{3, 2, 1, 0, 4}));
        assertFalse(exam.canJump1(new int[]{1, 0, 8, 0}));
    }

}
