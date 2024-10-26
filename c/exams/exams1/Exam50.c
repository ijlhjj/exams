/* 50-最大连续 1 的个数
 *
 */

#include <stdio.h>

int findMaxConsecutiveOnes(int *nums, int numsSize)
{
    int max = 0;

    for (int i = 0; i < numsSize; i++)
    {
        int len = 0;
        while (i < numsSize && *(nums + i) == 1)
        { // 内循环一定要加外循环限制条件，防止下标越界的未知结果
            len++;
            i++;
        }

        if (len > max)
            max = len;
    }

    return max;
}

int main(int argc, char const *argv[])
{
    int nums[] = {1, 1, 0, 1, 1, 1};
    int *pnums = nums;

    printf("%d\n", findMaxConsecutiveOnes(pnums, 6));

    return 0;
}
