/* 148-统计和小于目标的下标对数目
 *
 */

#include <assert.h>

int countPairs(int *nums, int numsSize, int target)
{
    int c = 0;

    for (int i = 0; i < numsSize; i++)
        for (int j = i + 1; j < numsSize; j++)
            if (nums[i] + nums[j] < target)
                c++;

    return c;
}

int main(int argc, char const *argv[])
{
    int nums[] = {-1, 1, 2, 3, 1};
    assert(countPairs(nums, 5, 2) == 3);

    return 0;
}
