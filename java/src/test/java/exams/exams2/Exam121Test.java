package exams.exams2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam121Test {

    @Test
    void maxKelements() {
        Exam121 exam = new Exam121();
        assertEquals(50, exam.maxKelements(new int[]{10, 10, 10, 10, 10}, 5));
        assertEquals(17, exam.maxKelements(new int[]{1, 10, 3, 3, 3}, 3));
    }

}
