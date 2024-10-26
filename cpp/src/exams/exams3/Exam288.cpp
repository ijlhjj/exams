#include "exams3.h"

#include <climits>

int findValueOfPartition(vector<int> &nums)
{
    sort(nums.begin(), nums.end()); // 排序

    int minDiff = INT_MAX; // 最小差值
    int limit = nums.size() - 1;
    for (int i = 0; i < limit; i++)
    {
        // 求相邻两个元素差，以确定最小 分区值
        int diff = nums[i + 1] - nums[i];
        if (diff < minDiff)
            minDiff = diff;
    }

    return minDiff;
}
