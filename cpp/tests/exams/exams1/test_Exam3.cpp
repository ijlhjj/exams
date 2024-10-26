#include "gtest/gtest.h"

#include "exams1.h"

TEST(Exam3, test1)
{
    ASSERT_EQ(3, romanToInt("III"));
    ASSERT_EQ(4, romanToInt("IV"));
    ASSERT_EQ(9, romanToInt("IX"));
    ASSERT_EQ(58, romanToInt("LVIII"));
}
