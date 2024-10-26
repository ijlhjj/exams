package exams.exams3;

/**
 * 227-区域和检索 - 数组不可变
 *
 * @author ijlhjj
 * @version 1.0 2024-03-18
 */
public class Exam227 {

    static class NumArray {

        private int[] nums;

        public NumArray(int[] nums) {
            this.nums = nums;
        }

        public int sumRange(int left, int right) {
            int sum = 0;
            while (left <= right) {
                sum += nums[left];
                left++;
            }
            return sum;
        }

    }

}
