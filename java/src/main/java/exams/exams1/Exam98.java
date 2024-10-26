package exams.exams1;

/**
 * 98-检查骑士巡视方案
 *
 * @author ijlhjj
 * @version 1.0 2023-09-16
 */
public class Exam98 {

    private int[] next(int[][] grid, int i, int j, int n) {
        int len = grid.length;

        if (j > 1) {
            if (i > 0)  //位置8
                if (grid[i - 1][j - 2] == n)
                    return new int[]{i - 1, j - 2};

            if (i < len - 1) //位置1
                if (grid[i + 1][j - 2] == n)
                    return new int[]{i + 1, j - 2};
        }

        if (j > 0) {
            if (i > 1)  //位置7
                if (grid[i - 2][j - 1] == n)
                    return new int[]{i - 2, j - 1};

            if (i < len - 2)  //位置2
                if (grid[i + 2][j - 1] == n)
                    return new int[]{i + 2, j - 1};
        }

        if (j < len - 1) {
            if (i > 1)  //位置6
                if (grid[i - 2][j + 1] == n)
                    return new int[]{i - 2, j + 1};

            if (i < len - 2) //位置3
                if (grid[i + 2][j + 1] == n)
                    return new int[]{i + 2, j + 1};
        }

        if (j < len - 2) {
            if (i > 0)  //位置5
                if (grid[i - 1][j + 2] == n)
                    return new int[]{i - 1, j + 2};

            if (i < len - 1)  //位置4
                if (grid[i + 1][j + 2] == n)
                    return new int[]{i + 1, j + 2};
        }

        return null;
    }

    public boolean checkValidGrid(int[][] grid) {
        //骑士会从棋盘的 左上角 出发
        if (grid[0][0] != 0)
            return false;

        int len = grid.length;

        int i = 0, j = 0, n = 0;
        while (n < len * len - 1) {
            //寻找下一巡视位置，没有找到正确位置时返回 false
            int[] coordinate = next(grid, i, j, n + 1);
            if (coordinate == null)
                return false;

            i = coordinate[0];
            j = coordinate[1];
            n++;
        }

        return true;
    }

}
