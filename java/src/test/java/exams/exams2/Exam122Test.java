package exams.exams2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam122Test {

    @Test
    void tupleSameProduct() {
        Exam122 exam = new Exam122();
        assertEquals(8, exam.tupleSameProduct(new int[]{2, 3, 4, 6}));
        assertEquals(16, exam.tupleSameProduct(new int[]{1, 2, 4, 5, 10}));
    }

}
