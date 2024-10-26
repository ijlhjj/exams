package exams.exams3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 254-找出第 K 大的异或坐标值
 *
 * @author ijlhjj
 * @version 1.0 2024-05-26
 */
public class Exam254 {

    public int kthLargestValue(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;

        //定义异或结果数组
        int[][] xorArr = new int[m][n];
        xorArr[0][0] = matrix[0][0]; //第一个元素赋值

        //计算第一列异或结果
        for (int i = 1; i < m; i++) {
            xorArr[i][0] = xorArr[i - 1][0] ^ matrix[i][0];
        }

        //循环计算其他元素异或结果
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                int val = xorArr[i][j - 1];
                for (int l = 0; l <= i; l++) {
                    val = val ^ matrix[l][j];
                }
                xorArr[i][j] = val;
            }
        }

        //结果转换为列表并进行排序
        List<Integer> values = new ArrayList<>(m * n);
        for (int[] row : xorArr) {
            for (int num : row)
                values.add(num);
        }
        Collections.sort(values);

        return values.get(values.size() - k); //返回第 k 大的值
    }

}
