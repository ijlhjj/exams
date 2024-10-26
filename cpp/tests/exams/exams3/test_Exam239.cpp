#include "gtest/gtest.h"

#include "exams3.h"

TEST(Exam239, test1)
{
    vector<int> mountain = {2, 4, 4};
    vector<int> indexs = findPeaks(mountain);
    vector<int> expected{};
    ASSERT_EQ(expected, indexs);
}

TEST(Exam239, test2)
{
    vector<int> mountain = {1, 4, 3, 8, 5};
    vector<int> indexs = findPeaks(mountain);
    vector<int> expected{1, 3};
    ASSERT_EQ(expected, indexs);
}
