package exams.exams2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exam155Test {

    @Test
    void carPooling() {
        Exam155 exam = new Exam155();
        assertFalse(exam.carPooling(new int[][]{{2, 1, 5}, {3, 3, 7}}, 4));
        assertTrue(exam.carPooling(new int[][]{{2, 1, 5}, {3, 3, 7}}, 5));
    }

}
