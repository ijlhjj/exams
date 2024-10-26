/* 61-移动零
 *
 * 首尾双指针
 */

#include <stdio.h>

void moveZeroes(int *nums, int numsSize)
{
    int left = 0;             // 左指针
    int right = numsSize - 1; // 右指针

    while (left < right)
    {
        if (*(nums + left) == 0)
        { // 发现0元素
            while (*(nums + right) == 0)
            { // 找右边第一个不为 0 的元素
                right--;
                // 左右指针相遇，处理完成
                if (right <= left)
                    return;
            }

            // 区间元素顺序左移
            for (int k = left; k < right; k++)
                *(nums + k) = *(nums + k + 1);

            *(nums + right) = 0; // 右边界填 0
        }
        else
            // 连续0的左边界不能递增
            left++; // 左边界递增
    }
}

int main(int argc, char const *argv[])
{
    int numsSize = 3;
    // int nums[] = {0, 1, 0, 3, 12};
    //  int nums[] = {0};
    int nums[] = {0, 0, 1};

    moveZeroes(nums, numsSize);

    for (int i = 0; i < numsSize; i++)
        printf("%4d", nums[i]);

    return 0;
}
