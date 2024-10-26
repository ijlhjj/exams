package exams.exams1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 97-打家劫舍 II
 *
 * @author ijlhjj
 * @version 1.0 2023-09-17
 */
public class Exam97_2 {

    private Map<String, Integer> maxRobMap; //使用缓存减少递归重复计算

    public int rob(int[] nums) {
        maxRobMap = new HashMap<>();

        if (nums.length < 4) return Arrays.stream(nums).max().getAsInt();

        int max0 = maxRob(nums, 0, nums.length);
        int max1 = maxRob(nums, 1, nums.length);

        return Math.max(max0, max1); //最终的最大和取两者中较大者
    }

    /**
     * 递归求不连续数组的最大和，首尾相连环形数组
     *
     * @param nums
     * @param left  左边界，包括
     * @param right 右边界，不包括
     * @return
     */
    public int maxRob(int[] nums, int left, int right) {
        //超出数组长度返回 0
        if (left >= right) return 0;

        //只有一个元素直接返回
        if (left == right - 1) return nums[right - 1];

        //两个元素返回其中较大者
        if (left == right - 2) {
            return Math.max(nums[right - 1], nums[right - 2]);
        }

        //已缓存不再重复计算，直接返回
        String key = left + "-" + right;
        if (maxRobMap.get(key) != null) {
            return maxRobMap.get(key);
        }

        //第一个元素不可和最后一个元素同时包含
        int right0 = right;
        if (left == 0 && right0 == nums.length) right0--;

        //不连续即不可同时包含 第一个元素 和 第二个元素
        int max0 = nums[left] + maxRob(nums, left + 2, right0); //包含第一个元素的最大和为 第一个元素值加 剩余元素最大和
        int max1 = nums[left + 1] + maxRob(nums, left + 3, right); //包含第二个元素的最大和为 第二个元素值加 剩余元素最大和

        int max = Math.max(max0, max1); //最终的最大和取两者中较大者
        maxRobMap.put(key, max);//加入缓存

        return max;
    }

}
