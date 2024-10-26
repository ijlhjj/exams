package exams.exams3;

import exams.TestUtil;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class Exam226Test {

    Exam226 exam = new Exam226();

    @Test
    void findMinHeightTrees() {
        assertIterableEquals(List.of(1), exam.findMinHeightTrees(4, new int[][]{{1, 0}, {1, 2}, {1, 3}}));
        assertIterableEquals(List.of(3, 4), exam.findMinHeightTrees(6, new int[][]{{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}}));
        assertIterableEquals(List.of(1, 2), exam.findMinHeightTrees(7, new int[][]{{0, 1}, {1, 2}, {1, 3}, {2, 4}, {3, 5}, {4, 6}})); // 第1次提交答案错误
        assertIterableEquals(List.of(2, 4), exam.findMinHeightTrees(63, new int[][]{{0, 1}, {1, 2}, {0, 3}, {2, 4}, {0, 5}, {4, 6}, {1, 7}, {2, 8}, {3, 9}, {4, 10}, {1, 11}, {3, 12}, {2, 13}, {1, 14}, {8, 15}, {9, 16}, {6, 17}, {8, 18}, {4, 19}, {13, 20}, {19, 21}, {8, 22}, {19, 23}, {23, 24}, {14, 25}, {10, 26}, {3, 27}, {21, 28}, {22, 29}, {6, 30}, {26, 31}, {16, 32}, {15, 33}, {17, 34}, {3, 35}, {14, 36}, {29, 37}, {26, 38}, {34, 39}, {39, 40}, {14, 41}, {20, 42}, {6, 43}, {30, 44}, {9, 45}, {11, 46}, {18, 47}, {3, 48}, {3, 49}, {27, 50}, {12, 51}, {14, 52}, {22, 53}, {30, 54}, {6, 55}, {14, 56}, {12, 57}, {2, 58}, {55, 59}, {24, 60}, {13, 61}, {40, 62}}));  // 第2次提交答案错误
    }

    /**
     * 第3次提交超时
     */
    @Test
    void findMinHeightTrees1() throws IOException {
        int[][] grid = TestUtil.readMatrix("../exams3_Exam226Test_1.txt");
        assertIterableEquals(List.of(2499, 2500), exam.findMinHeightTrees(5000, grid));
        //assertIterableEquals(List.of(2499, 2500), exam.findMinHeightTrees2(5000, grid));
    }

    /**
     * 第4次提交超时
     */
    @Test
    void findMinHeightTrees2() throws IOException {
        int[][] grid = TestUtil.readMatrix("../exams3_Exam226Test_2.txt");
        assertIterableEquals(List.of(9999, 10000), exam.findMinHeightTrees(20000, grid));
        //assertIterableEquals(List.of(9999, 10000), exam.findMinHeightTrees2(20000, grid));
    }

}
