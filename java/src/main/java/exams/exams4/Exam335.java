package exams.exams4;

import java.util.HashMap;
import java.util.Map;

/**
 * 335-跳跃游戏
 *
 * @author ijlhjj
 * @version 1.0 2024-10-19
 */
public class Exam335 {

    private Map<Integer, Boolean> canJumpMap; //缓存避免重复计算

    // 递归算法
    public boolean canJump(int[] nums, int index) {
        // 基准条件：达到或超过数组最后一个元素，返回 可达到
        if (index >= nums.length - 1)
            return true;

        // 计算过直接返回缓存结果
        if (canJumpMap.containsKey(index))
            return canJumpMap.get(index);

        boolean flag = false; //是否可达到

        //循环可达到的每个元素，查找最小跳跃次数
        for (int i = 1; i <= nums[index]; i++) {
            boolean tmpFlag = canJump(nums, index + i);
            if (tmpFlag) {
                flag = true;
                break;
            }
        }

        canJumpMap.put(index, flag); //缓存
        return flag;
    }

    // 递归算法
    public boolean canJump1(int[] nums) {
        canJumpMap = new HashMap<>();
        return canJump(nums, 0);
    }

    // 动态规划算法
    public boolean canJump(int[] nums) {
        boolean[] flags = new boolean[nums.length]; //定义可达到标识数组
        flags[nums.length - 1] = true; //初始化最后一个标识为 true
        //从倒数第2个开始计算标识
        for (int i = nums.length - 2; i >= 0; i--) {
            //循环可达到的位置是否有 可达到 的位置，有 可达到 时本位置也 可达到
            for (int j = 1; j <= nums[i]; j++) {
                if (flags[i + j]) {
                    flags[i] = true;
                    break;
                }
            }
        }
        return flags[0]; //返回第一个位置是否 可达到
    }

}
