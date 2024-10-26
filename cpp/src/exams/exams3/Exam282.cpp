#include "exams3.h"

vector<int> findIntersectionValues(vector<int> &nums1, vector<int> &nums2)
{
    int c1 = 0;
    int c2 = 0;
    unordered_set<int> numSet1(nums1.begin(), nums1.end());
    unordered_set<int> numSet2(nums2.begin(), nums2.end());

    for (int n : nums1)
    {
        if (numSet2.contains(n))
            c1++;
    }

    for (int n : nums2)
    {
        if (numSet1.contains(n))
            c2++;
    }

    vector<int> result{c1, c2};
    return result;
}
