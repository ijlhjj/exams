package exams.exams1;

import exams.exams1.Exam7;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam7Test {

    @Test
    void lengthOfLongestSubstring() {
        Exam7 exam = new Exam7();

        assertEquals(3, exam.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, exam.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, exam.lengthOfLongestSubstring("pwwkew"));
    }

}
