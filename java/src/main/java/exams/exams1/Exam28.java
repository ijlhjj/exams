package exams.exams1;

/**
 * 28-特殊元素平方和
 *
 * @author ijlhjj
 * @version 1.0 2023-07-18
 */
public class Exam28 {

    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                int sq = nums[i - 1] * nums[i - 1];
                sum += sq;
            }
        }

        return sum;
    }

}
