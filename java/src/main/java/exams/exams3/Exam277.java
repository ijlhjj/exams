package exams.exams3;

import java.util.ArrayList;
import java.util.List;

/**
 * 277-统计移除递增子数组的数目 I
 *
 * @author ijlhjj
 * @version 1.0 2024-07-10
 */
public class Exam277 {

    private boolean strictlyIncreasing(List<Integer> nums) {
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) >= nums.get(i + 1))
                return false;
        }
        return true;
    }

    public int incremovableSubarrayCount(int[] nums) {
        int c = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                //每次循环删除 [i, j] 之间的元素
                List<Integer> arr = new ArrayList<>();

                for (int k = 0; k < i; k++)
                    arr.add(nums[k]);

                for (int k = j + 1; k < nums.length; k++)
                    arr.add(nums[k]);

                if (strictlyIncreasing(arr))
                    c++;
            }
        }

        return c;
    }

}
