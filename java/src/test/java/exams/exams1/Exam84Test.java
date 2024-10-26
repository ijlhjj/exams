package exams.exams1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exam84Test {

    @Test
    void searchMatrix() {
        Exam84 exam = new Exam84();
        int[][] array = new int[1][0];
        assertFalse(exam.searchMatrix(array, 1));
    }

}
