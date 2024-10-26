package exams.exams2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam183Test {

    @Test
    void numberOfBoomerangs() {
        Exam183 exam = new Exam183();
        assertEquals(2, exam.numberOfBoomerangs(new int[][]{{0, 0}, {1, 0}, {2, 0}}));
        assertEquals(2, exam.numberOfBoomerangs(new int[][]{{1, 1}, {2, 2}, {3, 3}}));
        assertEquals(0, exam.numberOfBoomerangs(new int[][]{{1, 1}}));
        assertEquals(20, exam.numberOfBoomerangs(new int[][]{{0, 0}, {1, 0}, {-1, 0}, {0, 1}, {0, -1}})); //第一次提交答案错误
    }

}
