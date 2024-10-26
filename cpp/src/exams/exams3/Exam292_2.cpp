#include "exams3.h"

/* 判断2个数组在删除2个元素后差值都是 num */
bool checkEqual(vector<int> &nums1, vector<int> &nums2, int num)
{
    int count = 0; // 差值不符合的元素数
    int i = 0;     // nums1 下标
    int j = 0;     // nums2 下标

    int size = nums2.size(); // 元素比对个数
    while (j < size)
    {
        if (nums1[i] + num == nums2[j])
        { // 差值符合要求，递进
            i++;
            j++;
        }
        else
        { // 差值不符合题意，只推进第1个下标
            i++;
            count++;
        }

        // 统计数量大于2，说明此差值不符合使2个数组相等的要求
        if (count > 2)
            return false;
    }

    // 对比完成，返回ture表示符合题意
    return true;
}

int minimumAddedInteger(vector<int> &nums1, vector<int> &nums2)
{
    sort(nums1.begin(), nums1.end()); // 排序
    sort(nums2.begin(), nums2.end());

    int minNum = 1001; // 初始化一个上限值

    // 判断保留第一个元素时，2个数组是否符合题意
    if (checkEqual(nums1, nums2, nums2[0] - nums1[0]))
    {
        minNum = nums2[0] - nums1[0];
    }

    // 判断删除第一个元素时，2个数组是否符合题意，且差值更小
    if (nums2[0] - nums1[1] < minNum)
    {
        if (checkEqual(nums1, nums2, nums2[0] - nums1[1]))
        {
            minNum = nums2[0] - nums1[1];
        }
    }

    // 判断删除前2个元素时，2个数组是否符合题意，且差值更小
    if (nums2[0] - nums1[2] < minNum)
    {
        if (checkEqual(nums1, nums2, nums2[0] - nums1[2]))
        {
            minNum = nums2[0] - nums1[2];
        }
    }

    return minNum;
}
