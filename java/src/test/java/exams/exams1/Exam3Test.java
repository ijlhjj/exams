package exams.exams1;

import exams.exams1.Exam3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam3Test {

    @Test
    void romanToInt() {
        Exam3 exam = new Exam3();
        assertEquals(3, exam.romanToInt("III"));
        assertEquals(4, exam.romanToInt("IV"));
        assertEquals(9, exam.romanToInt("IX"));
        assertEquals(58, exam.romanToInt("LVIII"));
        assertEquals(1994, exam.romanToInt("MCMXCIV"));
    }

}
