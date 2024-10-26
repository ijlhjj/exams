package exams.exams1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Exam93_2Test {

    @Test
    void findOrder() {
        Exam93_2 exam = new Exam93_2();

        assertArrayEquals(new int[]{0, 1}, exam.findOrder(2, new int[][]{{1, 0}}));
        assertArrayEquals(new int[]{0, 1, 2, 3}, exam.findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}}));
        assertArrayEquals(new int[]{0}, exam.findOrder(1, new int[][]{}));
        assertArrayEquals(new int[]{}, exam.findOrder(20, new int[][]{{0, 10}, {3, 18}, {5, 5}, {6, 11}, {11, 14}, {13, 1}, {15, 1}, {17, 4}}));
    }

}
