package exams.exams1;

import exams.exams1.Exam10;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam10Test {

    @Test
    void convert() {
        Exam10 exam = new Exam10();
        assertEquals("PAHNAPLSIIGYIR", exam.convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", exam.convert("PAYPALISHIRING", 4));
        assertEquals("A", exam.convert("A", 1));
        assertEquals("AB", exam.convert("AB", 1)); // 第一次提交报错：下标越界
    }

}
