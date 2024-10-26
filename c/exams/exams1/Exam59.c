/* 59-删除有序数组中的重复项
 *
 * 快慢指针
 */

#include <stdio.h>

int removeDuplicates(int *nums, int numsSize)
{
    int k = 0; // 慢指针

    for (int i = 1; i < numsSize; i++)
    { // 快指针遍历数组
        if (*(nums + i) != *(nums + k))
        { // 发现不同元素时赋值
            k++;
            *(nums + k) = *(nums + i);
        }
    }

    return k + 1; // 这里 k 是下标，长度需要加 1
}

int main(int argc, char const *argv[])
{
    // int nums[] = {1, 1, 2};
    int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

    int k = removeDuplicates(nums, 10);

    printf("%d\n", k);
    for (int i = 0; i < k; i++)
        printf("%4d", nums[i]);

    return 0;
}
