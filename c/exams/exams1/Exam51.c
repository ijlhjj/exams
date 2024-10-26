/* 51-长度最小的子数组
 *
 */

#include <stdio.h>

/*
 * 符合题目要求的 长度最小的 连续子数组
 * 算法遍历数组一次，时间复杂度为： O(n)
 */
int minSubArrayLen(int target, int *nums, int numsSize)
{
    int minLen = numsSize + 1; // 定义一个大于所有正常结果的值

    int i = 0, j = 0, sum = 0; // 连续子数组的 左边界、右边界、和

    // 遍历所有数组元素
    while (i < numsSize && j < numsSize)
    {
        // 和 达不到题目要求，右边界增加
        while (j < numsSize && sum < target)
        {
            sum += *(nums + j);
            j++;
        }

        // 和 符合题目要求
        while (sum >= target)
        {
            // 更新最小长度
            if (j - i < minLen)
                minLen = j - i;

            // 左边界增加
            // 这里可能使 sum = 0，但这时属于已经找到了可能的最小长度 1
            sum -= *(nums + i);
            i++;
        }

        // 按题目描述，最小的可能长度为 1
        if (minLen == 1)
            break;
    }

    // 如果不存在符合条件的子数组，返回 0
    if (minLen > numsSize)
        return 0;

    return minLen;
}

int main(int argc, char const *argv[])
{
    int nums[] = {2, 3, 1, 2, 4, 3};

    printf("%d\n", minSubArrayLen(7, nums, 6));

    return 0;
}
