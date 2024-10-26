package exams.exams1;

import exams.exams1.Exam1;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Exam1Test {

    @Test
    public void testTwoSum() {
        Exam1 exam = new Exam1();
        int[] nums = {2, 7, 11, 15};

        int[] result = exam.twoSum(nums, 9);

        int[] expect = {0, 1};
        assertTrue(Arrays.equals(expect, result));
    }

}
