#include "exams4.h"

double minimumAverage(vector<int> &nums)
{
    sort(nums.begin(), nums.end()); // 排序

    int n = nums.size();
    int limit = n / 2;
    double minAverage = 50; // 最小平均值初始化为上限

    for (int i = 0; i < limit; i++)
    {
        double avg = (nums[i] + nums[n - i - 1]) / 2.0;
        if (avg < minAverage)
            minAverage = avg;
    }

    return minAverage;
}
