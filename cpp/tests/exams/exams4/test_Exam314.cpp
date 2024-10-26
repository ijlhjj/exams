#include "gtest/gtest.h"

#include "exams4.h"

TEST(Exam314, test1)
{
    vector<int> nums{-4, -1, 0, 3, 10};
    vector<int> ans{0, 1, 9, 16, 100};
    ASSERT_EQ(ans, sortedSquares(nums));
}

TEST(Exam314, test2)
{
    vector<int> nums{-7, -3, 2, 3, 11};
    vector<int> ans{4, 9, 9, 49, 121};
    ASSERT_EQ(ans, sortedSquares(nums));
}
