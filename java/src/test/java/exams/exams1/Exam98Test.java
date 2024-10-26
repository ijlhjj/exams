package exams.exams1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exam98Test {

    @Test
    void checkValidGrid() {
        Exam98 exam = new Exam98();
        assertTrue(exam.checkValidGrid(new int[][]{{0, 11, 16, 5, 20}, {17, 4, 19, 10, 15}, {12, 1, 8, 21, 6}, {3, 18, 23, 14, 9}, {24, 13, 2, 7, 22}}));
        assertFalse(exam.checkValidGrid(new int[][]{{0, 3, 6}, {5, 8, 1}, {2, 7, 4}}));
        assertFalse(exam.checkValidGrid(new int[][]{{8, 3, 6}, {5, 0, 1}, {2, 7, 4}})); //第一次提交错误
    }

}
