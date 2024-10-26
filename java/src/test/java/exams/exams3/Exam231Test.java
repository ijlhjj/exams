package exams.exams3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class Exam231Test {

    @Test
    void getAncestors() {
        Exam231 exam = new Exam231();
        assertIterableEquals(List.of(List.of(), List.of(), List.of(), List.of(0, 1), List.of(0, 2), List.of(0, 1, 3), List.of(0, 1, 2, 3, 4), List.of(0, 1, 2, 3)), exam.getAncestors(8, new int[][]{{0, 3}, {0, 4}, {1, 3}, {2, 4}, {2, 7}, {3, 5}, {3, 6}, {3, 7}, {4, 6}}));
        assertIterableEquals(List.of(List.of(), List.of(0), List.of(0, 1), List.of(0, 1, 2), List.of(0, 1, 2, 3)), exam.getAncestors(5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {0, 4}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}}));
    }

}
