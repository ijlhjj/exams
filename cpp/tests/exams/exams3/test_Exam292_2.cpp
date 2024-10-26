#include "gtest/gtest.h"

#include "exams3.h"

TEST(Exam292_2, test1)
{
    vector<int> nums1{4, 20, 16, 12, 8};
    vector<int> nums2{14, 18, 10};
    ASSERT_EQ(-2, minimumAddedInteger(nums1, nums2));
}

TEST(Exam292_2, test2)
{
    vector<int> nums1{3, 5, 5, 3};
    vector<int> nums2{7, 7};
    ASSERT_EQ(2, minimumAddedInteger(nums1, nums2));
}
