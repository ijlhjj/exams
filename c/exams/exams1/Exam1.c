/* 1-两数之和： 算法时间复杂度为： O(n*n)
 *
 *  与Java代码实现一致，C的快速排序调用比较麻烦。
 */

#include <stdio.h>
#include <stdlib.h>

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int *twoSum(int *nums, int numsSize, int target, int *returnSize)
{
    int i, j;

    for (i = 0; i < numsSize - 1; i++)
        for (j = i + 1; j < numsSize; j++)
        {
            if (nums[i] + nums[j] == target)
            {
                int *result = malloc(2 * sizeof(int)); /* 申请返回数组空间 */
                result[0] = i;
                result[1] = j;
                *returnSize = 2; /* 返回数组大小 */
                return result;
            }
        }

    *returnSize = 0; /* 返回数组大小 */
    return NULL;
}

int main(int argc, char const *argv[])
{
    int nums[4] = {2, 7, 11, 15};
    int *result, returnSize;

    result = twoSum(nums, 4, 9, &returnSize);
    printf("[%d, %d]\n", result[0], result[1]);

    return 0;
}
