package exams.exams4;

import java.util.HashMap;
import java.util.Map;

/**
 * 335-跳跃游戏 II
 *
 * @author ijlhjj
 * @version 1.0 2024-10-19
 */
public class Exam335_2 {

    private Map<Integer, Integer> minStepMap; //缓存避免重复计算

    public int jump(int[] nums, int index) {
        // 基准条件：达到或超过数组最后一个元素，返回 0
        if (index >= nums.length - 1)
            return 0;

        // 计算过直接返回缓存结果
        if (minStepMap.containsKey(index))
            return minStepMap.get(index);

        int minStep = nums.length; //最小跳跃次数

        //循环可达到的每个元素，查找最小跳跃次数
        for (int i = 1; i <= nums[index]; i++) {
            int step = jump(nums, index + i);
            if (step < minStep)
                minStep = step;
        }

        minStep++; //跳跃次数加 1

        minStepMap.put(index, minStep); //缓存

        return minStep;
    }

    public int jump(int[] nums) {
        minStepMap = new HashMap<>();
        return jump(nums, 0);
    }

}
