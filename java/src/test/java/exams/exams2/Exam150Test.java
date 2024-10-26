package exams.exams2;

import exams.TestUtil;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam150Test {

    @Test
    void minPathCost() {
        Exam150 exam = new Exam150();
        assertEquals(17, exam.minPathCost(new int[][]{{5, 3}, {4, 0}, {2, 1}}, new int[][]{{9, 8}, {1, 5}, {10, 12}, {18, 6}, {2, 4}, {14, 3}}));
        assertEquals(6, exam.minPathCost(new int[][]{{5, 1, 2}, {4, 0, 3}}, new int[][]{{12, 10, 15}, {20, 23, 8}, {21, 7, 1}, {8, 1, 13}, {9, 10, 25}, {5, 3, 2}}));
    }

    /**
     * 第1次提交超时
     */
    @Test
    void minPathCost1() throws IOException {
        int[][] grid = TestUtil.readMatrix("../exams2_Exam150Test_11.txt");
        int[][] moveCost = TestUtil.readMatrix("../exams2_Exam150Test_12.txt");
        Exam150 exam = new Exam150();
        assertEquals(3494, exam.minPathCost(grid, moveCost));
    }

}
