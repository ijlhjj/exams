/* 36-搜索插入位置
 *
 */

#include <stdio.h>

int searchInsert(int *nums, int numsSize, int target)
{
    int low = 0;
    int high = numsSize - 1;

    while (low <= high)
    {
        int mid = (low + high) >> 1;
        int midVal = *(nums + mid);

        if (midVal < target)
            low = mid + 1;
        else if (midVal > target)
            high = mid - 1;
        else
            return mid; // key found
    }

    return low; // key not found.
}

int main(int argc, char const *argv[])
{
    int nums[] = {1, 3, 5, 6};
    printf("%d\n", searchInsert(nums, 4, 2));

    return 0;
}
