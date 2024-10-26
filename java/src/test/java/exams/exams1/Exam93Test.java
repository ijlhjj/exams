package exams.exams1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exam93Test {

    @Test
    void canFinish() {
        Exam93 exam = new Exam93();
        assertTrue(exam.canFinish(2, new int[][]{{1, 0}}));
        assertFalse(exam.canFinish(2, new int[][]{{1, 0}, {0, 1}}));

        //第一次提交报错
        assertFalse(exam.canFinish(20, new int[][]{{0, 10}, {3, 18}, {5, 5}, {6, 11}, {11, 14}, {13, 1}, {15, 1}, {17, 4}}));
    }

}
