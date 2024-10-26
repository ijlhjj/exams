#include "gtest/gtest.h"

#include "exams1.h"

TEST(Exam3_2, test1)
{
    ASSERT_EQ("III", intToRoman(3));
    ASSERT_EQ("IV", intToRoman(4));
    ASSERT_EQ("IX", intToRoman(9));
    ASSERT_EQ("LVIII", intToRoman(58));
}
