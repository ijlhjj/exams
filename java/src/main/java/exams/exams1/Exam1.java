package exams.exams1;

/**
 * 1-两数之和
 *
 * @author ijlhjj
 * @version 1.0 2023-05-28
 */
public class Exam1 {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2]; //存放结果

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }

}
