#include "exams4.h"

int numberOfPairs(vector<int> &nums1, vector<int> &nums2, int k)
{
    int count = 0;

    for (auto num1 : nums1)
    {
        for (auto num2 : nums2)
            if (num1 % (num2 * k) == 0)
                count++;
    }

    return count;
}
