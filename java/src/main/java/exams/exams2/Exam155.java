package exams.exams2;

import java.util.Arrays;

/**
 * 155-拼车
 *
 * @author ijlhjj
 * @version 1.0 2023-12-02
 */
public class Exam155 {

    public boolean carPooling(int[][] trips, int capacity) {
        //按题意定义一个所有位置的数组
        int[] nums = new int[1000];
        Arrays.fill(nums, 0);

        for (int[] trip : trips) {
            //把乘客下车前的所有位置都增加相应人数，增加后的人数超过 空座位 时返回 false
            for (int i = trip[1]; i < trip[2]; i++) {
                nums[i] += trip[0];
                if (nums[i] > capacity)
                    return false;
            }
        }

        return true; //所有行程都可完成时返回 true
    }

}
