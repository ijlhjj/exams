package exams.exams3;

import java.util.HashMap;
import java.util.Map;

public class Exam224 {

    private Map<String, Integer> cache;

    public int maxMoves(int[][] grid) {
        cache = new HashMap<>();

        int max = 0;

        int rowCount = grid.length;
        int colCount = grid[0].length;

        for (int i = 0; i < rowCount; i++) {
            int move = moveTest(grid, i, 0, rowCount, colCount);
            if (move > max)
                max = move;

            if (max == colCount - 1)
                break;
        }

        return max;
    }

    private int moveTest(int[][] grid, int row, int col, int rowCount, int colCount) {
        if (col == colCount - 1)
            return 0;

        String key = row + "-" + col;
        if (cache.containsKey(key))
            return cache.get(key);

        int num = grid[row][col];

        int first = 0;
        if (row > 0 && grid[row - 1][col + 1] > num)
            first = 1 + moveTest(grid, row - 1, col + 1, rowCount, colCount);

        int second = 0;
        if (grid[row][col + 1] > num)
            second = 1 + moveTest(grid, row, col + 1, rowCount, colCount);

        int three = 0;
        if (row < rowCount - 1 && grid[row + 1][col + 1] > num)
            three = 1 + moveTest(grid, row + 1, col + 1, rowCount, colCount);

        int max = Math.max(Math.max(first, second), three);
        cache.put(key, max);

        return max;
    }

}
