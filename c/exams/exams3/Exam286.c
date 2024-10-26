/* 286-对角线最长的矩形的面积
 *
 */

#include <assert.h>

int areaOfMaxDiagonal(int **dimensions, int dimensionsSize, int *dimensionsColSize)
{
    int maxDiagonal = 0; // 最长对角线
    int area = 0;        // 面积

    for (int i = 0; i < dimensionsSize; i++)
    {
        int *d = dimensions[i];
        int diagonal = d[0] * d[0] + d[1] * d[1]; // 计算对角线，此处为减少计算不做开平方

        if (diagonal > maxDiagonal)
        { // 如果对角线更长
            maxDiagonal = diagonal;
            area = d[0] * d[1];
        }
        else if (diagonal == maxDiagonal)
        { // 如果对角线相等，返回面积最大
            int a = d[0] * d[1];
            if (a > area)
                area = a;
        }
    }

    return area;
}

int main(int argc, char const *argv[])
{
    // 函数调用有问题
    // int dimensionsColSize = 2;
    // int nums[2][2] = {{9, 3}, {8, 6}};
    // assert(areaOfMaxDiagonal(nums, 2, &dimensionsColSize) == 48);

    return 0;
}
