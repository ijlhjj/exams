package exams.exams1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam25Test {

    Exam25 exam = new Exam25();

    @Test
    void maxNonDecreasingLength1() {
        int[] nums1 = {2, 3, 1};
        int[] nums2 = {1, 2, 1};
        assertEquals(2, exam.maxNonDecreasingLength(nums1, nums2));
    }

    @Test
    void maxNonDecreasingLength2() {
        int[] nums1 = {1, 3, 2, 1};
        int[] nums2 = {2, 2, 3, 4};
        assertEquals(4, exam.maxNonDecreasingLength(nums1, nums2));
    }

    @Test
    void maxNonDecreasingLength3() {
        int[] nums1 = {1, 1};
        int[] nums2 = {2, 2};
        assertEquals(2, exam.maxNonDecreasingLength(nums1, nums2));
    }

    @Test
    void maxNonDecreasingLength4() {
        int[] nums1 = {8, 7, 4};
        int[] nums2 = {13, 4, 4};
        assertEquals(2, exam.maxNonDecreasingLength(nums1, nums2));
    }

    @Test
    void maxNonDecreasingLength5() {
        int[] nums1 = {11, 7, 7, 9};
        int[] nums2 = {19, 19, 1, 7};
        assertEquals(3, exam.maxNonDecreasingLength(nums1, nums2));
    }

}
