#include "gtest/gtest.h"

#include "exams4.h"

TEST(Exam317, test1)
{
    ASSERT_EQ("lecoe", removeStars("leet**cod*e"));
}

TEST(Exam317, test2)
{
    ASSERT_EQ("", removeStars("erase*****"));
}
