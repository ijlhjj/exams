/* 49-移除元素
 *
 */

#include <stdio.h>

/* 交换函数，使用 O(1) 额外空间 */
void swap(int *a, int *b)
{
    int c = *a;
    *a = *b;
    *b = c;
}

/* 原地 移除 val 元素 */
int removeElement(int *nums, int numsSize, int val)
{
    int i, j, k = 0;

    j = numsSize - 1; // 当前计划交换位置
    for (i = 0; i <= j; i++)
    {
        if (*(nums + i) == val)
        { // 找到要移除元素
            // 如果要交换位置也是要移除元素，位置减 1
            while (j > i && *(nums + j) == val)
                j--;

            if (i < j)
            { // 还存在非移除元素，交换值
                swap(nums + i, nums + j);
                j--;
            }
            else
            { // 对于最后存在连续移除元素的，需要减 1
                k = 1;
            }
        }
    }

    return i - k;
}

int main(int argc, char const *argv[])
{
    // int nums[] = {3, 2, 2, 3};
    int nums[] = {1};
    int *pnums = nums;

    int len = removeElement(pnums, 1, 1);

    for (int i = 0; i < len; i++)
        printf("%4d", nums[i]);

    return 0;
}
