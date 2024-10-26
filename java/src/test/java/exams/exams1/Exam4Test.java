package exams.exams1;

import exams.exams1.Exam4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam4Test {

    Exam4 exam = new Exam4();

    @Test
    void longestCommonPrefix1() {
        String[] strs = {"flower", "flow", "flight"};
        String result = exam.longestCommonPrefix(strs);
        assertEquals("fl", result);
    }

    @Test
    void longestCommonPrefix2() {
        String[] strs = {"dog", "racecar", "car"};
        String result = exam.longestCommonPrefix(strs);
        assertEquals("", result);
    }

    /**
     * 第 1 次提交 字符串已至结尾判断条件错误的测试用例
     */
    @Test
    void longestCommonPrefix3() {
        String[] strs = {"ab", "a"};
        String result = exam.longestCommonPrefix(strs);
        assertEquals("a", result);
    }

}
