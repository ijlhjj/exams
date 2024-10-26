#include "gtest/gtest.h"

#include "exams4.h"

TEST(Exam319, test1)
{
    vector<int> buses{10, 20};
    vector<int> passengers{2, 17, 18, 19};
    ASSERT_EQ(16, latestTimeCatchTheBus(buses, passengers, 2));
}

TEST(Exam319, test2)
{
    vector<int> buses{20, 30, 10};
    vector<int> passengers{19, 13, 26, 4, 25, 11, 21};
    ASSERT_EQ(20, latestTimeCatchTheBus(buses, passengers, 2));
}

// 第一次提交报错
TEST(Exam319, test3)
{
    vector<int> buses{2};
    vector<int> passengers{2};
    ASSERT_EQ(1, latestTimeCatchTheBus(buses, passengers, 2));
}

// 第二次提交报错
TEST(Exam319, test4)
{
    vector<int> buses{5};
    vector<int> passengers{2, 3};
    ASSERT_EQ(5, latestTimeCatchTheBus(buses, passengers, 10000));
}

// 第三次提交报错
TEST(Exam319, test5)
{
    vector<int> buses{5};
    vector<int> passengers{7, 8};
    ASSERT_EQ(5, latestTimeCatchTheBus(buses, passengers, 1));
}

// 第四次提交答案错误
TEST(Exam319, test6)
{
    vector<int> buses{2};
    vector<int> passengers{4, 2};
    ASSERT_EQ(1, latestTimeCatchTheBus(buses, passengers, 2));
}
