package exams.exams3;

import java.util.Arrays;

/**
 * 279-判断一个数组是否可以变为有序
 *
 * @author ijlhjj
 * @version 1.0 2024-07-13
 */
public class Exam279 {

    public boolean canSortArray(int[] nums) {
        //统计数组元素的1的位数
        int[] bitCount = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            bitCount[i] = Integer.bitCount(nums[i]);
        }

        //对位数相同的区间进行排序
        int left = 0;
        int right = 0;
        int c = bitCount[0];
        while (right < nums.length) {
            //位数不同时进行处理
            if (bitCount[right] != c) {
                Arrays.sort(nums, left, right);
                left = right;
                c = bitCount[right];
            }
            right++;
        }
        Arrays.sort(nums, left, right);

        //数组不是有序返回 false
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return false;
        }

        return true;
    }

}
