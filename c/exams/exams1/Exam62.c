/* 62-数组中的最大数对和
 *
 */

#include <stdio.h>

int maxDig(int num)
{
    int max = 0;

    while (num > 0)
    {
        int d = num % 10;
        if (d > max)
            max = d;
        num /= 10;
    }

    return max;
}

int maxSum(int *nums, int numsSize)
{
    int max = -1;

    for (int i = 0; i < numsSize; i++)
    {
        for (int j = i + 1; j < numsSize; j++)
        {
            int di = maxDig(nums[i]);
            int dj = maxDig(nums[j]);

            if (di == dj)
            {
                int sum = nums[i] + nums[j];
                if (sum > max)
                    max = sum;
            }
        }
    }

    return max;
}

int main(int argc, char const *argv[])
{
    int nums[] = {51, 71, 17, 24, 42};

    printf("%d\n", maxSum(nums, 5));

    return 0;
}
