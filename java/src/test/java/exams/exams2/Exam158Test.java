package exams.exams2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam158Test {

    @Test
    void minimumFuelCost() {
        Exam158 exam = new Exam158();
        assertEquals(3, exam.minimumFuelCost(new int[][]{{0, 1}, {0, 2}, {0, 3}}, 5));
        assertEquals(7, exam.minimumFuelCost(new int[][]{{3, 1}, {3, 2}, {1, 0}, {0, 4}, {0, 5}, {4, 6}}, 2));
        assertEquals(0, exam.minimumFuelCost(new int[][]{}, 1));
        assertEquals(4, exam.minimumFuelCost(new int[][]{{0, 1}, {0, 2}, {1, 3}, {1, 4}}, 5)); //第1次提交答案错误
        assertEquals(2, exam.minimumFuelCost(new int[][]{{0, 1}, {1, 2}}, 3)); //第2次提交答案错误
    }

}
