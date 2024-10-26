package exams.exams3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam216Test {

    @Test
    void minIncrements() {
        Exam216 exam = new Exam216();
        assertEquals(6, exam.minIncrements(7, new int[]{1, 5, 2, 2, 3, 3, 1}));
        assertEquals(0, exam.minIncrements(3, new int[]{5, 3, 3}));
    }

}
