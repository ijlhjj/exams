#include "exams4.h"

int smallestRangeI(vector<int> &nums, int k)
{
    sort(nums.begin(), nums.end()); // 排序

    int k2 = k * 2; // 大值减 k ，小值加 k ，差值最大可缩减 2k

    int diff = nums[nums.size() - 1] - nums[0]; // 最大值与最小值的差

    // 差值小于2k，返回 0
    if (diff <= k2)
        return 0;

    // 差值减2k
    return diff - k2;
}
