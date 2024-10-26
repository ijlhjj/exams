package exams.exams3;

import exams.TestUtil;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam224Test {

    Exam224 exam = new Exam224();

    @Test
    void maxMoves() {
        assertEquals(3, exam.maxMoves(new int[][]{{2, 4, 3, 5}, {5, 4, 9, 3}, {3, 4, 2, 11}, {10, 9, 13, 15}}));
        assertEquals(0, exam.maxMoves(new int[][]{{3, 2, 4}, {2, 1, 9}, {1, 1, 7}}));
    }

    /**
     * 第一次提交运行超时
     */
    @Test
    void maxMoves1() throws IOException {
        int[][] grid = TestUtil.readMatrix("../exams3_Exam224Test_1.txt");
        assertEquals(999, exam.maxMoves(grid));
    }

}
