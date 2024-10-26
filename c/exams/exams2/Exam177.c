/* 177-找出强数对的最大异或值 I
 *
 */

#include <stdlib.h>
#include <assert.h>

// 定义最小值宏
#define min(a, b) (((a) < (b)) ? (a) : (b))

int maximumStrongPairXor(int *nums, int numsSize)
{
    int maximum = 0;

    for (int i = 0; i < numsSize; i++)
        for (int j = i; j < numsSize; j++)
            if (abs(nums[i] - nums[j]) <= min(nums[i], nums[j]))
            {
                int n = nums[i] ^ nums[j];
                if (n > maximum)
                    maximum = n;
            }

    return maximum;
}

int main(int argc, char const *argv[])
{
    int nums[] = {1, 2, 3, 4, 5};
    assert(maximumStrongPairXor(nums, 5) == 7);
    return 0;
}
