#include "gtest/gtest.h"

#include "exams3.h"

TEST(Exam288, test1)
{
    vector<int> nums{1, 3, 2, 4};
    ASSERT_EQ(1, findValueOfPartition(nums));
}

TEST(Exam288, test2)
{
    vector<int> nums{100, 1, 10};
    ASSERT_EQ(9, findValueOfPartition(nums));
}
