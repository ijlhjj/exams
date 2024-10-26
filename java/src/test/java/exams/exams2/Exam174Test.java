package exams.exams2;

import exams.TestUtil;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam174Test {

    Exam174 exam = new Exam174();

    @Test
    void minStoneSum1() {
        assertEquals(12, exam.minStoneSum(new int[]{5, 4, 9}, 2));
        assertEquals(12, exam.minStoneSum(new int[]{4, 3, 6, 7}, 3));
    }

    @Test
    void minStoneSum2() throws IOException {
        int[] nums = TestUtil.readIntArray("../exams2_Exam174Test_1.txt");
        assertEquals(27613760, exam.minStoneSum(nums, 96193));
    }

}
