#include "gtest/gtest.h"

#include "exams3.h"

TEST(Exam241, test1)
{
    ASSERT_EQ(60, distanceTraveled(5, 10));
    ASSERT_EQ(10, distanceTraveled(1, 2));
}
