/* 35-找到数组的中间位置
 *
 */

#include <stdio.h>

int pivotIndex(int *nums, int numsSize)
{
    int total = 0;
    int sumLeft = 0, sumRight = 0;

    // 计算数组总和
    for (int i = 0; i < numsSize; i++)
        total += *(nums + i);

    for (int i = 0; i < numsSize; i++)
    {
        // 右侧和等于：总和 - 左和 - 当前元素值
        sumRight = total - sumLeft - *(nums + i);
        if (sumLeft == sumRight) // 符合题目要求，返回当前下标
            return i;

        sumLeft += *(nums + i); // 累计左和
    }

    return -1; // 没有符合要求值，返回 -1
}

int main(int argc, char const *argv[])
{
    int nums[] = {1, 7, 3, 6, 5, 6};
    printf("%d\n", pivotIndex(nums, 6));

    return 0;
}
