package exams.exams1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam34Test {

    @Test
    void maxArrayValue() {
        Exam34 exam = new Exam34();
        assertEquals(21, exam.maxArrayValue(new int[]{2, 3, 7, 9, 3}));
        assertEquals(11, exam.maxArrayValue(new int[]{5, 3, 3}));
    }

}
