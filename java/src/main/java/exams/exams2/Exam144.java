package exams.exams2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 144-数位和相等数对的最大和
 *
 * @author ijlhjj
 * @version 1.0 2023-11-18
 */
public class Exam144 {

    public int maximumSum(int[] nums) {
        Map<Integer, List<Integer>> digitSumMap = new HashMap<>(); //以映射存放 数位和 相等的数值列表

        //计算数位和，把 数位和 相等的加入同一个列表
        for (int n : nums) {
            Integer sum = digitSum(n);
            List<Integer> numList = digitSumMap.computeIfAbsent(sum, k -> new ArrayList<>());
            numList.add(n);
        }

        int maxSum = -1; //不存在满足条件的数对，返回 -1

        //计算 数位和 相等的可以得到的 最大值
        for (List<Integer> numList : digitSumMap.values()) {
            if (numList.size() > 1) {
                int sum = maxSum(numList); //nums[i] + nums[j] 的 最大值
                if (sum > maxSum)
                    maxSum = sum;
            }
        }

        return maxSum;
    }

    /**
     * 计算数位和
     */
    private Integer digitSum(Integer num) {
        char[] digits = num.toString().toCharArray();
        int sum = 0;
        for (Character d : digits) {
            int n = Character.getNumericValue(d); //字符转整数
            sum += n;
        }
        return sum;
    }

    /**
     * 数位和相等的最大和值
     */
    private int maxSum(List<Integer> numList) {
        int max = 0; //最大值
        int max2 = 0; //第2大值
        for (int n : numList) {
            if (n >= max) {
                max2 = max;
                max = n;
            } else if (n > max2) {
                max2 = n;
            }
        }
        return max + max2; //最大值 和 次大值 的和即为所求
    }

}
