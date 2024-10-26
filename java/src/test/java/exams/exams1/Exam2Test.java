package exams.exams1;

import exams.exams1.Exam2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exam2Test {

    @Test
    void isPalindrome() {
        Exam2 exam = new Exam2();
        assertTrue(exam.isPalindrome(121));
        assertFalse(exam.isPalindrome(-121));
        assertFalse(exam.isPalindrome(10));
    }

}
