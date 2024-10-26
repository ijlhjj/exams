#include "exams4.h"

int differenceOfSum(vector<int> &nums)
{
    int total = 0;
    int digitSum = 0;

    for (int n : nums)
    {
        total += n;

        string s = to_string(n);
        for (char c : s)
            digitSum += c - '0';
    }

    // 数位和一定不大于数值和
    return total - digitSum;
}
