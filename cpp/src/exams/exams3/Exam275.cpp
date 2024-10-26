#include "exams3.h"

bool checkMove(vector<vector<char>> &board, int rMove, int cMove, char color)
{
    int n = board.size();

    char c = 'B';
    if (color == 'B')
        c = 'W';

    // 横向：后
    if (cMove < n - 2 && board[rMove][cMove + 1] == c)
    {
        for (int j = cMove + 2; j < n; j++)
        {
            if (board[rMove][j] == color)
                return true;

            if (board[rMove][j] == '.')
                break;
        }
    }

    // 横向：前
    if (cMove > 1 && board[rMove][cMove - 1] == c)
    {
        for (int j = cMove - 2; j >= 0; j--)
        {
            if (board[rMove][j] == color)
                return true;
            if (board[rMove][j] == '.')
                break;
        }
    }

    // 竖向：下
    if (rMove < n - 2 && board[rMove + 1][cMove] == c)
    {
        for (int i = rMove + 2; i < n; i++)
        {
            if (board[i][cMove] == color)
                return true;
            if (board[i][cMove] == '.')
                break;
        }
    }

    // 竖向：上
    if (rMove > 1 && board[rMove - 1][cMove] == c)
    {
        for (int i = rMove - 2; i >= 0; i--)
        {
            if (board[i][cMove] == color)
                return true;
            if (board[i][cMove] == '.')
                break;
        }
    }

    // 斜向：右下
    if (rMove < n - 2 && cMove < n - 2 && board[rMove + 1][cMove + 1] == c)
    {
        for (int i = rMove + 2, j = cMove + 2; i < n && j < n; i++, j++)
        {
            if (board[i][j] == color)
                return true;
            if (board[i][j] == '.')
                break;
        }
    }

    // 斜向：左上
    if (rMove > 1 && cMove > 1 && board[rMove - 1][cMove - 1] == c)
    {
        for (int i = rMove - 2, j = cMove - 2; i >= 0 && j >= 0; i--, j--)
        {
            if (board[i][j] == color)
                return true;
            if (board[i][j] == '.')
                break;
        }
    }

    // 斜向：右上
    if (rMove > 1 && cMove < n - 2 && board[rMove - 1][cMove + 1] == c)
    {
        for (int i = rMove - 2, j = cMove + 2; i >= 0 && j < n; i--, j++)
        {
            if (board[i][j] == color)
                return true;
            if (board[i][j] == '.')
                break;
        }
    }

    // 斜向：左下
    if (rMove < n - 2 && cMove > 1 && board[rMove + 1][cMove - 1] == c)
    {
        for (int i = rMove + 2, j = cMove - 2; i < n && j >= 0; i++, j--)
        {
            if (board[i][j] == color)
                return true;
            if (board[i][j] == '.')
                break;
        }
    }

    // 都不能满足题意，返回 false
    return false;
}
