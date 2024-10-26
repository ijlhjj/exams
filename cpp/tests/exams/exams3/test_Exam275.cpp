#include "gtest/gtest.h"

#include "exams3.h"

TEST(Exam275, test1)
{
    vector<vector<char>> board = {
        {'.', '.', '.', 'B', '.', '.', '.', '.'},
        {'.', '.', '.', 'W', '.', '.', '.', '.'},
        {'.', '.', '.', 'W', '.', '.', '.', '.'},
        {'.', '.', '.', 'W', '.', '.', '.', '.'},
        {'W', 'B', 'B', '.', 'W', 'W', 'W', 'B'},
        {'.', '.', '.', 'B', '.', '.', '.', '.'},
        {'.', '.', '.', 'B', '.', '.', '.', '.'},
        {'.', '.', '.', 'W', '.', '.', '.', '.'}};

    ASSERT_TRUE(checkMove(board, 4, 3, 'B'));
}

TEST(Exam275, test2)
{
    vector<vector<char>> board = {
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', 'B', '.', '.', 'W', '.', '.', '.'},
        {'.', '.', 'W', '.', '.', '.', '.', '.'},
        {'.', '.', '.', 'W', 'B', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', 'B', 'W', '.', '.'},
        {'.', '.', '.', '.', '.', '.', 'W', '.'},
        {'.', '.', '.', '.', '.', '.', '.', 'B'}};

    ASSERT_FALSE(checkMove(board, 4, 4, 'W'));
}
