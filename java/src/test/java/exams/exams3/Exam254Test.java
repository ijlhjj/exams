package exams.exams3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam254Test {

    @Test
    void kthLargestValue() {
        Exam254 exam = new Exam254();
        assertEquals(7, exam.kthLargestValue(new int[][]{{5, 2}, {1, 6}}, 1));
        assertEquals(5, exam.kthLargestValue(new int[][]{{5, 2}, {1, 6}}, 2));
        assertEquals(4, exam.kthLargestValue(new int[][]{{5, 2}, {1, 6}}, 3));
        assertEquals(0, exam.kthLargestValue(new int[][]{{5, 2}, {1, 6}}, 4));
        assertEquals(1, exam.kthLargestValue(new int[][]{{10, 9, 5}, {2, 0, 4}, {1, 0, 9}, {3, 4, 8}}, 10)); //第一次提交答案错误
    }

}
