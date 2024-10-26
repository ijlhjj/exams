package exams.exams1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam97_2Test {

    @Test
    void rob() {
        Exam97_2 exam = new Exam97_2();

        assertEquals(3, exam.rob(new int[]{2, 3, 2}));
        assertEquals(4, exam.rob(new int[]{1, 2, 3, 1}));
        assertEquals(3, exam.rob(new int[]{1, 2, 3}));
        assertEquals(16, exam.rob(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5})); //第一次提交错误
    }

}
