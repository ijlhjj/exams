/* 57-搜索旋转排序数组
 *
 * 采用分治算法：
 * 如果中间元素小于第一个元素，说明它没有经过旋转；如果中间元素大于第一个元素，说明它经过了旋转。
 */

#include <stdio.h>

int search2(int *nums, int fromIndex, int toIndex, int target)
{
    // 没有多余元素，返回 -1
    if (toIndex - fromIndex < 1)
        return -1;

    // 只有一个元素，直接对比
    if (toIndex - fromIndex == 1)
    {
        if (nums[fromIndex] == target)
            return fromIndex;
        else
            return -1;
    }

    // 取中间元素
    int mid = (fromIndex + toIndex) / 2;
    int midVal = nums[mid];

    if (midVal == target) // 找到 目标值
        return mid;
    else if (midVal < nums[0])
    {                                    // 中间元素小于第一个元素，说明它没有经过旋转，它后面都是大于它的元素
        if (target == nums[toIndex - 1]) // 对比最后一个元素
            return toIndex - 1;
        else if (target > midVal && target < nums[toIndex - 1]) // 在后半有序数组区间
            return search2(nums, mid + 1, toIndex, target);
        else
            return search2(nums, fromIndex, mid, target);
    }
    else
    {                                  // 中间元素大于第一个元素，说明它经过了旋转。它前面都是小于它的元素
        if (target == nums[fromIndex]) // 对比第一个元素
            return fromIndex;
        else if (target < midVal && target > nums[fromIndex]) // 在前半有序数组区间
            return search2(nums, fromIndex, mid, target);
        else
            return search2(nums, mid + 1, toIndex, target);
    }
}

int search(int *nums, int numsSize, int target)
{
    return search2(nums, 0, numsSize, target); // 调用递归求解
}

int main(int argc, char const *argv[])
{
    int nums[] = {4, 5, 6, 7, 0, 1, 2};
    // int nums[] = {0, 1, 2, 4, 5, 6, 7};

    printf("%d\n", search(nums, 7, 0));

    return 0;
}
