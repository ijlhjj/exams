package exams.exams1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam97Test {

    @Test
    void rob() {
        Exam97 exam = new Exam97();
        assertEquals(4, exam.rob(new int[]{1, 2, 3, 1}));
        assertEquals(12, exam.rob(new int[]{2, 7, 9, 3, 1}));
        assertEquals(0, exam.rob(new int[]{0})); //第一次提交报错
        assertEquals(14, exam.rob(new int[]{4, 1, 2, 7, 5, 3, 1})); //第二次提交错误
    }

    /**
     * 第三次提交超时
     */
    @Test
    void rob1() {
        Exam97 exam = new Exam97();
        int[] nums = new int[]{226, 174, 214, 16, 218, 48, 153, 131, 128, 17, 157, 142, 88, 43, 37, 157, 43, 221, 191, 68, 206, 23, 225, 82, 54, 118, 111, 46, 80, 49, 245, 63, 25, 194, 72, 80, 143, 55, 209, 18, 55, 122, 65, 66, 177, 101, 63, 201, 172, 130, 103, 225, 142, 46, 86, 185, 62, 138, 212, 192, 125, 77, 223, 188, 99, 228, 90, 25, 193, 211, 84, 239, 119, 234, 85, 83, 123, 120, 131, 203, 219, 10, 82, 35, 120, 180, 249, 106, 37, 169, 225, 54, 103, 55, 166, 124};
        assertEquals(7102, exam.rob(nums));
    }

}
