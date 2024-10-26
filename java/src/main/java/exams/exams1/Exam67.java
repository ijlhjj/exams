package exams.exams1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 67-四数之和
 *
 * @author ijlhjj
 * @version 1.0 2023-08-20
 */
public class Exam67 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums); //元素顺序不影响结果，排序后可简化计算

        long sum = target; //整型运算不会自动转为 long 型，所以先进行类型转换

        List<List<Integer>> quadruples = new ArrayList<>();

        //相同元素，能找到的四元组也必然相同
        long o = Integer.MAX_VALUE + 1l;
        for (int i = 0; i < nums.length - 3; i++) {
            if (nums[i] != o) {
                long m = Integer.MAX_VALUE + 1l;
                for (int j = i + 1; j < nums.length - 2; j++) {
                    if (nums[j] != m) {
                        long n = Integer.MAX_VALUE + 1l;
                        for (int k = j + 1; k < nums.length - 1; k++) {
                            if (nums[k] != n) {
                                long t = sum - nums[i] - nums[j] - nums[k]; //这个计算可能溢出，所以采用 long 类型防止溢出
                                //超出范围的不必查找
                                if (Integer.MIN_VALUE <= t && t <= Integer.MAX_VALUE) {
                                    int index = Arrays.binarySearch(nums, k + 1, nums.length, (int) t);
                                    if (index > k && index < nums.length) {
                                        List<Integer> quadruple = new ArrayList<>();
                                        quadruple.add(nums[i]);
                                        quadruple.add(nums[j]);
                                        quadruple.add(nums[k]);
                                        quadruple.add(nums[index]);
                                        quadruples.add(quadruple);
                                    }
                                }
                                n = nums[k];
                            }
                        }
                        m = nums[j];
                    }
                }
                o = nums[i];
            }
        }

        return quadruples;
    }

}
