#include "exams4.h"

vector<int> sortedSquares(vector<int> &nums)
{
    vector<int> ans(nums.size()); // 结果数组

    // 使用双指针进行处理
    int i = 0;
    int j = nums.size() - 1;

    for (int k = j; k >= 0; k--)
    {
        // 每次取首尾的绝对值较大者进行赋值
        if (abs(nums[i]) < abs(nums[j]))
        {
            ans[k] = nums[j] * nums[j];
            j--;
        }
        else
        {
            ans[k] = nums[i] * nums[i];
            i++;
        }
    }

    return ans;
}
