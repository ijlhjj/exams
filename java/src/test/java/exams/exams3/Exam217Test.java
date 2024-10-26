package exams.exams3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam217Test {

    @Test
    void reachableNodes() {
        Exam217 exam = new Exam217();
        assertEquals(4, exam.reachableNodes(7, new int[][]{{0, 1}, {1, 2}, {3, 1}, {4, 0}, {0, 5}, {5, 6}}, new int[]{4, 5}));
        assertEquals(3, exam.reachableNodes(7, new int[][]{{0, 1}, {0, 2}, {0, 5}, {0, 4}, {3, 2}, {6, 5}}, new int[]{4, 2, 1}));
    }

}
