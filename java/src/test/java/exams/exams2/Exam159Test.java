package exams.exams2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam159Test {

    @Test
    void minReorder() {
        Exam159 exam = new Exam159();
        assertEquals(3, exam.minReorder(6, new int[][]{{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}}));
        assertEquals(2, exam.minReorder(5, new int[][]{{1, 0}, {1, 2}, {3, 2}, {3, 4}}));
        assertEquals(0, exam.minReorder(3, new int[][]{{1, 0}, {2, 0}}));
    }

}
