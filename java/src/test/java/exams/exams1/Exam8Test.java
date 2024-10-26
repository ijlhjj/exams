package exams.exams1;

import exams.exams1.Exam8;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam8Test {

    Exam8 exam = new Exam8();

    @Test
    void findMedianSortedArrays1() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double result = exam.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.00000, result);
    }

    @Test
    void findMedianSortedArrays2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        double result = exam.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.50000, result);
    }

}
