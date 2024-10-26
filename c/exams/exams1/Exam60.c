/* 60-删除有序数组中的重复项 II
 *
 * 快慢指针
 */

#include <stdio.h>

int removeDuplicates(int *nums, int numsSize)
{
    int k = 0;    // 慢指针
    int flag = 0; // 是否重复2次标识

    for (int i = 1; i < numsSize; i++)
    { // 快指针遍历数组

        if (*(nums + i) != *(nums + k))
        { // 发现不同元素时赋值
            k++;
            *(nums + k) = *(nums + i);
            flag = 0;
        }
        else
        {
            if (!flag)
            { // 相同元素时没有超过2次重复的赋值
                k++;
                *(nums + k) = *(nums + i);
            }
            flag = 1;
        }
    }

    return k + 1; // 这里 k 是下标，长度需要加 1
}

int main(int argc, char const *argv[])
{
    int nums[] = {1, 1, 1, 2, 2, 3};
    // int nums[] = {0, 0, 1, 1, 1, 1, 2, 3, 3};

    int k = removeDuplicates(nums, 6);

    printf("%d\n", k);
    for (int i = 0; i < k; i++)
        printf("%4d", nums[i]);

    return 0;
}
