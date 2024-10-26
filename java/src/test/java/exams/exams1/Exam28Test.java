package exams.exams1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam28Test {

    @Test
    void sumOfSquares() {
        Exam28 exam = new Exam28();
        assertEquals(21, exam.sumOfSquares(new int[]{1, 2, 3, 4}));
        assertEquals(63, exam.sumOfSquares(new int[]{2, 7, 1, 19, 18, 3}));
    }

}
