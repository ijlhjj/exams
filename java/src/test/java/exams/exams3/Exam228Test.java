package exams.exams3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam228Test {

    @Test
    void distinctIntegers() {
        Exam228 exam = new Exam228();
        assertEquals(4, exam.distinctIntegers(5));
        assertEquals(2, exam.distinctIntegers(3));
    }

}
