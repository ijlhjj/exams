#include "exams3.h"

vector<int> findColumnWidth(vector<vector<int>> &grid)
{
    vector<int> maxLen;

    // 外层按列循环
    for (size_t j = 0; j < grid[0].size(); j++)
    {
        int max{0};

        // 内层行循环
        for (size_t i = 0; i < grid.size(); i++)
        {
            string s = to_string(grid[i][j]);

            if (s.size() > max)
                max = s.size();
        }

        maxLen.push_back(max);
    }

    return maxLen;
}
