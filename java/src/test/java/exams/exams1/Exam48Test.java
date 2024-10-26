package exams.exams1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Exam48Test {

    Exam48 exam = new Exam48();

    @Test
    void twoSum1() {
        int[] expected = {1, 2};
        int[] result = exam.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(expected, result);
    }

    @Test
    void twoSum2() {
        int[] expected = {1, 3};
        int[] result = exam.twoSum(new int[]{2, 3, 4}, 6);
        assertArrayEquals(expected, result);
    }

    @Test
    void twoSum3() {
        int[] expected = {1, 2};
        int[] result = exam.twoSum(new int[]{-1, 0}, -1);
        assertArrayEquals(expected, result);
    }

}
