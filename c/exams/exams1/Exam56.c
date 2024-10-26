/* 55-寻找旋转排序数组中的最小值
 *
 * 找最左的没有旋转元素。
 * 如果中间元素大于等于第一个元素，说明它经过了旋转。除非所有元素相等。所有元素相等返回任意元素值均可。
 */

#include <stdio.h>
#include <limits.h>

#define min(a, b) (((a) < (b)) ? (a) : (b))

int findMin2(int *nums, int fromIndex, int toIndex)
{
    int min_index = fromIndex;

    for (int i = fromIndex + 1; i < toIndex; i++)
        if (*(nums + i) < *(nums + min_index))
            min_index = i;

    return min_index;
}

int findMin(int *nums, int numsSize)
{
    // 只有一个元素，直接返回
    if (numsSize == 1)
        return nums[0];

    int left = 0;
    int right = numsSize - 1;
    // 循环全部元素
    while (left <= right)
    {
        int mid = (left + right) / 2; // 中间索引

        if (mid == 0) // 固定对比第一个元素，所以 mid == 0 要特殊处理
        {
            int limit = min(right + 2, numsSize);
            left = findMin2(nums, left, limit);
            break;
        }

        if (nums[mid] > nums[0]) // 中间元素是转移后的
            left = mid + 1;
        else if (nums[mid] < nums[0]) // 中间元素是转移前的
            right = mid - 1;
        else
        { // 相等时状态不确定，在当前范围找最小元素
            int limit = min(right + 2, numsSize);
            left = findMin2(nums, left, limit);
            break;
        }
    }

    // 数组旋转 n 次（等同于没有旋转）， left == numsSize
    return *(nums + left % numsSize);
}

/* 简单题目用简单解法，不追求最好时间复杂度 */
int minArray(int *numbers, int numbersSize)
{
    int min_val = INT_MAX;

    for (int i = 0; i < numbersSize; i++)
        if (*(numbers + i) < min_val)
            min_val = *(numbers + i);

    return min_val;
}

int main(int argc, char const *argv[])
{
    // int nums[] = {1, 1};
    //  int nums[] = {1, 3, 5};
    //  int nums[] = {3, 1, 1};
    //  int nums[] = {3, 5, 1};
    //  int nums[] = {3, 4, 5, 1, 2};
    //  int nums[] = {2, 2, 2, 0, 1};
    //  int nums[] = {10, 1, 10, 10, 10};
    // int nums[] = {10, 10, 1, 10, 10};
    // int nums[] = {0, 1, 1, 2, 0, 0};
    int nums[] = {2, 2, 2, 0, 2, 2, 2};
    // int nums[] = {4, 5, 6, 7, 0, 1, 2};

    printf("%d\n", minArray(nums, 7));
    printf("%d\n", findMin(nums, 7));

    return 0;
}
