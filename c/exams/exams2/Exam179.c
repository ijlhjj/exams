/* 179-保龄球游戏的获胜者
 *
 */

#include <assert.h>

int calculateScore(int *player, int playerSize)
{
    int score = 0;

    for (int i = 0; i < playerSize; i++)
    {
        // 如果玩家在该轮的前两轮的任何一轮中击中了 10 个瓶子，则为 2xi
        if (i - 2 >= 0 && player[i - 2] == 10)
            score += 2 * player[i];
        else if (i - 1 >= 0 && player[i - 1] == 10)
            score += 2 * player[i];
        else
            score += player[i];
    }

    return score;
}

int isWinner(int *player1, int player1Size, int *player2, int player2Size)
{
    // 计算玩家得分
    int score1 = calculateScore(player1, player1Size);
    int score2 = calculateScore(player2, player2Size);

    // 根据题目要求返回结果
    if (score1 > score2)
        return 1;
    else if (score2 > score1)
        return 2;
    else
        return 0;
}

int main(int argc, char const *argv[])
{
    // int player1[] = {4, 10, 7, 9};
    // int player2[] = {6, 5, 2, 3};

    int player1[] = {10, 2, 2, 3}; // 第1次提交答案错误
    int player2[] = {3, 8, 4, 5};
    assert(isWinner(player1, 4, player2, 4) == 1);

    return 0;
}
