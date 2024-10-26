package exams.exams1;

import java.util.Arrays;

/**
 * 48-两数之和 II - 输入有序数组
 *
 * @author ijlhjj
 * @version 1.0 2023-08-08
 */
public class Exam48 {

    public int[] twoSum(int[] numbers, int target) {
        int[] indexArr = new int[2]; //存放结果

        for (int i = 0; i < numbers.length - 1; i++) {
            int num1 = numbers[i];
            int num2 = target - num1;
            int j = Arrays.binarySearch(numbers, i + 1, numbers.length, num2);

            if (j >= 0) {
                indexArr[0] = i + 1;
                indexArr[1] = j + 1;
                break;
            }
        }

        return indexArr;
    }

}
