/* 41-对角线遍历
 *
 */

#include <stdio.h>
#include <stdlib.h>

int *findDiagonalOrder(int **mat, int matSize, int *matColSize, int *returnSize)
{
    int *result = malloc(matSize * (*matColSize) * sizeof(int)); // 申请内存空间
    int count = 0;                                               // 当前遍历元素个数

    if (matSize == 1 || (*matColSize) == 1)
    { // 对单行、单列进行特殊处理
        for (int i = 0; i < matSize; i++)
            for (int j = 0; j < (*matColSize); j++)
            {
                *(result + count) = mat[i][j];
                count++;
            }
    }
    else
    {
        // 行列递进步长
        int rowStep = -1;
        int colStep = 1;

        // 行列下标
        int i = 0;
        int j = 0;

        // 遍历所有矩阵元素
        while (i < matSize && j < (*matColSize))
        {
            // 添加当前遍历元素，数量加 1
            *(result + count) = mat[i][j];
            count++;

            // 下标步进
            i += rowStep;
            j += colStep;

            if (i < 0 || i > matSize - 1 || j < 0 || j > (*matColSize - 1))
            { // 步进后超出矩阵范围，步长取反
                rowStep = -rowStep;
                colStep = -colStep;
            }

            if (j > (*matColSize - 1))
            { // 列下标超出范围，包括了行下标同时超限的处理
                j = *matColSize - 1;
                i += 2;
            }
            else if (i > matSize - 1)
            { // 行下标超出范围，包括了列下标同时超限的处理
                i = matSize - 1;
                j += 2;
            }
            else if (i < 0)
                i = 0; // 行下标超限处理
            else if (j < 0)
                j = 0; // 列下标超限处理
        }
    }

    *returnSize = count; // 返回数组大小

    return result;
}

int main(int argc, char const *argv[])
{
    int matSize = 3;
    int colSize = 3;
    int returnSize;

    int mat[3][3] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int *pmat[] = {mat[0], mat[1], mat[2]};
    int **ppmat = pmat;

    int *result = findDiagonalOrder(ppmat, matSize, &colSize, &returnSize);

    for (int i = 0; i < returnSize; i++)
        printf("%d, ", *(result + i));

    return 0;
}
