/* 15-最富有客户的资产总量
 *
 */

#include <stdio.h>

int maximumWealth(int **accounts, int accountsSize, int *accountsColSize)
{
    int maxRow = 0;
    int rowSum;

    for (int i = 0; i < accountsSize; i++)
    {
        rowSum = 0;

        for (int j = 0; j < *accountsColSize; j++)
            rowSum += accounts[i][j];

        if (rowSum > maxRow)
            maxRow = rowSum;
    }

    return maxRow;
}

int main(int argc, char const *argv[])
{
    int accountsColSize = 3;

    int accounts[2][3] = {{1, 2, 3}, {3, 2, 1}};
    int *prow[2] = {accounts[0], accounts[1]};
    int **paccounts = prow;

    int result = maximumWealth(paccounts, 2, &accountsColSize);
    printf("%d\n", result);

    return 0;
}
