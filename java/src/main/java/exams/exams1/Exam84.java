package exams.exams1;

import java.util.Arrays;

/**
 * 84-搜索二维矩阵 II
 *
 * @author ijlhjj
 * @version 1.0 2023-08-31
 */
public class Exam84 {

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] row : matrix) {
            if (row.length == 0) return false;

            if (row[0] > target) break;

            if (Arrays.binarySearch(row, target) >= 0) return true;
        }

        return false;
    }

}
