#include "gtest/gtest.h"

#include "exams3.h"

TEST(Exam240, test1)
{
    vector<int> batteryPercentages = {1, 1, 2, 1, 3};
    int c = countTestedDevices(batteryPercentages);
    ASSERT_EQ(3, c);
}

TEST(Exam240, test2)
{
    vector<int> batteryPercentages = {0, 1, 2};
    int c = countTestedDevices(batteryPercentages);
    ASSERT_EQ(2, c);
}
