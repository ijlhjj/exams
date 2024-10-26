package exams.exams1;

import java.util.HashMap;
import java.util.Map;

/**
 * 97-打家劫舍
 *
 * @author ijlhjj
 * @version 1.0 2023-09-16
 */
public class Exam97 {

    private Map<Integer, Integer> maxRobMap; //使用缓存减少递归重复计算

    public int rob(int[] nums) {
        maxRobMap = new HashMap<>();

        if (nums.length == 1) return nums[0];

        return maxRob(nums, 0);
    }

    /**
     * 递归求不连续数组的最大和
     */
    public int maxRob(int[] nums, int left) {
        //超出数组长度返回 0
        if (left >= nums.length) return 0;

        //只有一个元素直接返回
        if (left == nums.length - 1) return nums[nums.length - 1];

        //两个元素返回其中较大者
        if (left == nums.length - 2) {
            return Math.max(nums[nums.length - 1], nums[nums.length - 2]);
        }

        //已缓存不再重复计算，直接返回
        if (maxRobMap.get(left) != null) {
            return maxRobMap.get(left);
        }

        //不连续即不可同时包含 第一个元素 和 第二个元素
        int max0 = nums[left] + maxRob(nums, left + 2); //包含第一个元素的最大和为 第一个元素值加 剩余元素最大和
        int max1 = nums[left + 1] + maxRob(nums, left + 3); //包含第二个元素的最大和为 第二个元素值加 剩余元素最大和

        int max = Math.max(max0, max1); //最终的最大和取两者中较大者
        maxRobMap.put(left, max);//加入缓存

        return max;
    }

}
