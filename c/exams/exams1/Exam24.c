/* 24-达到末尾下标所需的最大跳跃次数
 *
 */

#include <stdio.h>
#include <stdlib.h>

/**
 * 查找达到末尾下标所需的最大跳跃次数
 *
 * 使用贪婪算法，时间复杂度为： O(n^2)
 */
int maximumJumps(int *nums, int numsSize, int target)
{
    int max_count;
    int *times = calloc(numsSize, sizeof(int)); /* 申请数组空间 */

    // 外层循环至倒数第2个元素
    for (int i = 0; i < numsSize - 1; i++)
    {
        // 跳跃次数为 0 表示不可达元素
        if (i > 0 && *(times + i) < 1)
            continue;

        int num1 = *(nums + i);
        for (int j = i + 1; j < numsSize; j++)
        {
            int num2 = *(nums + j);
            int diff = num2 - num1;
            // 符合题目限定并且跳跃次数更多时更新
            if (diff >= -target && diff <= target)
                if (*(times + i) + 1 > *(times + j))
                    *(times + j) = *(times + i) + 1;
        }
    }

    // 达到最后一个元素的跳跃次数为 0 表示不可达，返回 -1
    max_count = *(times + numsSize - 1);
    if (max_count > 0)
        return max_count;

    return -1;
}

int main(int argc, char const *argv[])
{
    int nums[] = {1, 3, 6, 4, 1, 2};
    printf("%d\n", maximumJumps(nums, 6, 3));

    return 0;
}
