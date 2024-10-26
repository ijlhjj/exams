package exams.exams2;

/**
 * 141-区域和检索 - 数组可修改
 *
 * @author ijlhjj
 * @version 1.0 2023-11-13
 */
public class Exam141 {

    class NumArray {

        private int[] nums;

        public NumArray(int[] nums) {
            this.nums = nums;
        }

        public void update(int index, int val) {
            nums[index] = val;
        }

        public int sumRange(int left, int right) {
            int sum = 0;
            for (int i = left; i <= right; i++)
                sum += nums[i];
            return sum;
        }

    }

}
