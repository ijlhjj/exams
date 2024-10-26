package exams.exams2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam173Test {

    @Test
    void maximumScoreAfterOperations() {
        Exam173 exam = new Exam173();
        assertEquals(11, exam.maximumScoreAfterOperations(new int[][]{{0, 1}, {0, 2}, {0, 3}, {2, 4}, {4, 5}}, new int[]{5, 2, 5, 2, 1, 1}));
        assertEquals(40, exam.maximumScoreAfterOperations(new int[][]{{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {2, 6}}, new int[]{20, 10, 9, 7, 4, 3, 5}));
        assertEquals(2000000000, exam.maximumScoreAfterOperations(new int[][]{{0, 1}, {0, 2}}, new int[]{1000000000, 1000000000, 1000000000})); //第一次提交答案错误
        assertEquals(83, exam.maximumScoreAfterOperations(new int[][]{{2, 0}, {4, 1}, {5, 3}, {4, 6}, {2, 4}, {5, 2}, {5, 7}}, new int[]{12, 12, 7, 9, 2, 11, 12, 25}));
    }

}
