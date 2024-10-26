/* 143-最长奇偶子数组
 *
 */

#include <assert.h>

int longestAlternatingSubarray(int *nums, int numsSize, int threshold)
{
    int longest = 0;

    int i = 0;
    while (i < numsSize)
    {
        int len = 0;
        // 起始值为偶数，并且小于等于 threshold
        while (i < numsSize)
        {
            if (nums[i] % 2 != 0 || nums[i] > threshold)
                i++;
            else
            {
                len = 1;
                break;
            }
        }

        // 找到起始值才继续查找
        if (len > 0)
        {
            while (i < numsSize - 1)
            {
                // 奇偶序列
                if (nums[i] % 2 != nums[i + 1] % 2 && nums[i + 1] <= threshold)
                    len++, i++;
                else
                    break;
            }
        }

        if (len > longest)
            longest = len;

        i++;
    }

    return longest;
}

int main(int argc, char const *argv[])
{
    // int nums[] = {3, 2, 5, 4};
    int nums[] = {2, 3, 4, 5};
    assert(longestAlternatingSubarray(nums, 4, 4) == 3);

    return 0;
}
