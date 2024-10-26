/* 55-寻找旋转排序数组中的最小值
 *
 * 采用分治算法：找最左的没有旋转元素。
 * 如果中间元素小于第一个元素，说明它没有经过旋转；如果中间元素大于第一个元素，说明它经过了旋转。
 */

#include <stdio.h>

int findMin(int *nums, int numsSize)
{
    // 只有一个元素，直接返回
    if (numsSize == 1)
        return nums[0];

    int left = 0;
    int right = numsSize - 1;

    while (left <= right)
    {
        int mid = (left + right) / 2;
        if (nums[mid] < nums[0])
            right = mid - 1;
        else
            left = mid + 1;
    }

    // 数组没有旋转时 left == numsSize
    return *(nums + left % numsSize);
}

int main(int argc, char const *argv[])
{
    // int nums[] = {3, 4, 5, 1, 2};
    // int nums[] = {11, 13, 15, 17};
    int nums[] = {4, 5, 1, 2, 3};

    printf("%d\n", findMin(nums, 5));

    return 0;
}
