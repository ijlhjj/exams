package exams.exams1;

import exams.exams1.Exam9;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam9Test {

    @Test
    void longestPalindrome() {
        Exam9 exam = new Exam9();
        assertEquals("bab", exam.longestPalindrome("babad"));
        assertEquals("bb", exam.longestPalindrome("cbbd"));
    }

}
