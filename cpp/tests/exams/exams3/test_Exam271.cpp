#include "gtest/gtest.h"

#include "exams3.h"

TEST(Exam271, test1)
{
    vector<int> nums{4, 2, 9, 5, 3};
    ASSERT_EQ(3, maximumPrimeDifference(nums));
}

TEST(Exam271, test2)
{
    vector<int> nums{4, 8, 2, 8};
    ASSERT_EQ(0, maximumPrimeDifference(nums));
}

// 第一次提交答案错误
TEST(Exam271, test3)
{
    vector<int> nums{2, 2};
    ASSERT_EQ(1, maximumPrimeDifference(nums));
}
