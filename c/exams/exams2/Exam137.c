/* 137-找出满足差值条件的下标 I
 *
 */

#include <stdio.h>
#include <stdlib.h>

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int *findIndices(int *nums, int numsSize, int indexDifference, int valueDifference, int *returnSize)
{
    int *answer = malloc(2 * sizeof(int)); /* 申请返回数组空间 */
    answer[0] = -1;                        /* 这里要赋初值，否则在下面所有要求都不符合时会读取内存乱值 */
    answer[1] = -1;
    *returnSize = 2; /* 返回数组大小 */

    if (indexDifference == 0 && valueDifference == 0)
    { // 题限要求都为 0 时返回第一个元素下标
        answer[0] = 0;
        answer[1] = 0;
    }
    else
    {
        for (int i = 0, j = indexDifference; j < numsSize; i++, j++)
        { // 直接按索引间距进行循环
            for (int k = j; k < numsSize; k++)
            {
                // 找到第一个符合题目限定的差值时返回
                int diff = abs(nums[i] - nums[k]);
                if (diff >= valueDifference)
                {
                    answer[0] = i;
                    answer[1] = k;
                    return answer;
                }
            }
        }
    }

    return answer;
}

int main(int argc, char const *argv[])
{
    // int nums[] = {5, 1, 4, 1};
    int nums[] = {1, 2, 3};
    int *result, returnSize;

    result = findIndices(nums, 3, 2, 4, &returnSize);
    printf("[%d, %d]\n", result[0], result[1]);

    return 0;
}
