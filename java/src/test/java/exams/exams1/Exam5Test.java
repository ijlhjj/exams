package exams.exams1;

import exams.exams1.Exam5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exam5Test {

    @Test
    void isValid() {
        Exam5 exam = new Exam5();
        assertTrue(exam.isValid("()"));
        assertTrue(exam.isValid("()[]{}"));
        assertFalse(exam.isValid("(]"));
    }

}
