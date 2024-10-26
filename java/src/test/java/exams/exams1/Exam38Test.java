package exams.exams1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam38Test {

    @Test
    void longestValidSubstring() {
        Exam38 exam = new Exam38();
        assertEquals(4, exam.longestValidSubstring("cbaaaabc", List.of("aaa", "cb")));
        assertEquals(4, exam.longestValidSubstring("leetcode", List.of("de", "le", "e")));
    }

}
