#include "gtest/gtest.h"

#include "exams3.h"

TEST(Exam251, test1)
{
    vector<int> nums{4, 7, 9, 3, 9};
    vector<int> divisors{5, 2, 3};
    ASSERT_EQ(3, maxDivScore(nums, divisors));
}

TEST(Exam251, test2)
{
    vector<int> nums{20, 14, 21, 10};
    vector<int> divisors{5, 7, 5};
    ASSERT_EQ(5, maxDivScore(nums, divisors));
}

TEST(Exam251, test3)
{
    vector<int> nums{12};
    vector<int> divisors{10, 16};
    ASSERT_EQ(10, maxDivScore(nums, divisors));
}
