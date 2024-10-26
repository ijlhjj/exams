package exams.exams3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam277Test {

    @Test
    void incremovableSubarrayCount() {
        Exam277 exam = new Exam277();
        assertEquals(10, exam.incremovableSubarrayCount(new int[]{1, 2, 3, 4}));
        assertEquals(7, exam.incremovableSubarrayCount(new int[]{6, 5, 7, 8}));
        assertEquals(3, exam.incremovableSubarrayCount(new int[]{8, 7, 6, 6}));
    }

}
