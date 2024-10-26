/* 13-一维数组的动态和
 *
 */

#include <stdio.h>
#include <stdlib.h>

/**
 * 一维数组的动态和
 */
int *runningSum(int *nums, int numsSize, int *returnSize)
{
    int *result = malloc(numsSize * sizeof(int)); /* 申请返回数组空间 */

    result[0] = *nums++; // 第一个元素赋值
    for (int i = 1; i < numsSize; i++)
        result[i] = result[i - 1] + *nums++;

    *returnSize = numsSize;

    return result;
}

int main(int argc, char const *argv[])
{
    int returnSize;
    int nums[] = {1, 2, 3, 4};
    
    int *result = runningSum(nums, 4, &returnSize);

    for (int i = 0; i < returnSize; i++)
        printf("%d,", *(result + i));

    return 0;
}
