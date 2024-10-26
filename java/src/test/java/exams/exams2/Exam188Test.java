package exams.exams2;

import exams.TestUtil;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam188Test {

    Exam188 exam = new Exam188();

    @Test
    void repeatLimitedString1() {
        assertEquals("zzcccac", exam.repeatLimitedString("cczazcc", 3));
        assertEquals("bbabaa", exam.repeatLimitedString("aababab", 2));
    }

    /**
     * 第1次提交超时
     */
    @Test
    void repeatLimitedString2() throws IOException {
        List<String> lines = TestUtil.readLines("../exams2_Exam188Test_1.txt");
        assertEquals(lines.get(1), exam.repeatLimitedString(lines.get(0), 35687));
    }

    /**
     * 第2次提交超时
     */
    @Test
    void repeatLimitedString3() throws IOException {
        List<String> lines = TestUtil.readLines("../exams2_Exam188Test_2.txt");
        assertEquals(lines.get(1), exam.repeatLimitedString(lines.get(0), 1));
    }

}
