package exams.exams1;

/**
 * 34-合并后数组中的最大元素
 *
 * @author ijlhjj
 * @version 1.0 2023-07-25
 */
public class Exam34 {

    public long maxArrayValue(int[] nums) {
        long max = 0;

        if (nums.length == 1) return nums[0];

        for (int i = nums.length - 1; i >= 0; i--) {
            //int sum = nums[i];  //这个在1012测试案例溢出了
            long sum = nums[i];

            while (i - 1 >= 0 && sum >= nums[i - 1]) {
                sum += nums[i - 1];
                i--;
            }

            if (sum > max) max = sum;
        }

        return max;
    }

}
