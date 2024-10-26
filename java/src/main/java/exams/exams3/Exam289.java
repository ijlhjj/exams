package exams.exams3;


/**
 * 289-直角三角形
 *
 * @author ijlhjj
 * @version 1.0 2024-08-02
 */
public class Exam289 {

    public long numberOfRightTriangles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] rowBool = new int[m]; //每行1的个数
        int[] colBool = new int[n]; //每列1的个数

        //遍历统计1的个数
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    rowBool[i]++;
                    colBool[j]++;
                }
            }
        }

        long count = 0;

        //遍历矩阵，累加每个元素可以构建的 直角三角形
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //只有1可以作为角元素
                if (grid[i][j] == 1) {
                    int r = rowBool[i];
                    int c = colBool[j];
                    int t = (r - 1) * (c - 1); //可以构建的 直角三角形 数量为： 行和列1的元素数量各减1后的乘积
                    count += t;
                }
            }
        }

        return count;
    }

}
