package exams.exams2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam144Test {

    @Test
    void maximumSum() {
        Exam144 exam = new Exam144();
        assertEquals(54, exam.maximumSum(new int[]{18, 43, 36, 13, 7}));
        assertEquals(-1, exam.maximumSum(new int[]{10, 12, 19, 14}));
    }

}
