/* 39-旋转图像
 *
 */

#include <stdio.h>

/* 求和方式交换两个变量值，a、b 不能指向同一个变量 */
void swap(int *a, int *b)
{
    *a = *a + *b;
    *b = *a - *b;
    *a = *a - *b;
}

void rotate(int **matrix, int matrixSize, int *matrixColSize)
{
    // 行列互换
    for (int i = 0; i < matrixSize; i++)
        for (int j = i; j < *matrixColSize; j++)
            if (i != j) // 同一元素不操作
                swap(&matrix[i][j], &matrix[j][i]);

    // 行值倒序
    for (int i = 0; i < matrixSize; i++)
        for (int j = 0, k = (*matrixColSize) - 1; j <= k; j++, k--)
            if (j != k) // 同一元素不操作
                swap(matrix[i] + j, matrix[i] + k);
}

int main(int argc, char const *argv[])
{
    int matrixSize = 3;
    int matrixColSize = 3;

    int matrix[][3] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int *matrixRow[] = {matrix[0], matrix[1], matrix[2]};
    int **p_matrix = matrixRow;

    rotate(p_matrix, matrixSize, &matrixColSize);

    for (int i = 0; i < matrixSize; i++)
    {
        for (int j = 0; j < matrixColSize; j++)
            printf("%4d", *(matrixRow[i] + j));

        printf("\n");
    }

    return 0;
}
