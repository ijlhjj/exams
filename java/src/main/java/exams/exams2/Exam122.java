package exams.exams2;

import java.util.Arrays;

/**
 * 122-同积元组
 *
 * @author ijlhjj
 * @version 1.0 2023-10-19
 */
public class Exam122 {

    public int tupleSameProduct(int[] nums) {
        Arrays.sort(nums); //排序以优化处理

        int count = 0; //符合题意的等式数量，结果元组 = count * 8

        for (int a = 0; a < nums.length - 3; a++) { //第一个元素
            for (int d = nums.length - 1; d > a + 2; d--) { //第二个元素
                int ad = nums[a] * nums[d]; //最小元素 和 最大元素 的 乘积
                for (int b = a + 1; b < d - 1; b++) { //第三个元素
                    //数组全部为整数，不能整除的不符合题意
                    if (ad % nums[b] == 0) {
                        int quotient = ad / nums[b]; //第四个元素值
                        int c = Arrays.binarySearch(nums, quotient); //排序数组可二分查找

                        //第四个元素索引如果小于第三个元素索引，则第三个元素继续增大已不可能找到符合题意的解
                        if (c < 0) {
                            c = -c - 1;
                            if (c <= b) break;
                        } else if (c <= b) {
                            break;
                        } else if (c < d) { //第四个元素索引符合 b<c<d
                            count++;
                        }
                    }
                }
            }
        }

        return count * 8;
    }

}
