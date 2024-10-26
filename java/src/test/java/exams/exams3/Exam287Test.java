package exams.exams3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam287Test {

    @Test
    void maximumDetonation() {
        Exam287 exam = new Exam287();
        assertEquals(2, exam.maximumDetonation(new int[][]{{2, 1, 3}, {6, 1, 4}}));
        assertEquals(1, exam.maximumDetonation(new int[][]{{1, 1, 5}, {10, 10, 5}}));
        assertEquals(5, exam.maximumDetonation(new int[][]{{1, 2, 3}, {2, 3, 1}, {3, 4, 2}, {4, 5, 3}, {5, 6, 4}}));
        assertEquals(1, exam.maximumDetonation(new int[][]{{1, 1, 100000}, {100000, 100000, 1}})); //第一次提交答案错误
    }

}
