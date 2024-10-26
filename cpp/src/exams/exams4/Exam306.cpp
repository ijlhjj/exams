#include "exams4.h"

bool satisfiesConditions(vector<vector<int>> &grid)
{
    // 第一行相邻元素都不同
    int k = -1;
    for (auto &n : grid[0])
    {
        if (k == n)
            return false;
        k = n;
    }

    // 每一列元素都相同
    for (size_t j = 0; j < grid[0].size(); j++)
    {
        k = grid[0][j];
        // 从第一行开始比对
        for (size_t i = 1; i < grid.size(); i++)
        {
            // 列元素不同返回 false
            if (grid[i][j] != k)
                return false;
        }
    }

    return true;
}
