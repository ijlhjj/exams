package exams.exams3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exam279Test {

    @Test
    void canSortArray() {
        Exam279 exam = new Exam279();
        assertTrue(exam.canSortArray(new int[]{8, 4, 2, 30, 15}));
        assertTrue(exam.canSortArray(new int[]{1, 2, 3, 4, 5}));
        assertFalse(exam.canSortArray(new int[]{3, 16, 8, 4, 2}));
    }

}
