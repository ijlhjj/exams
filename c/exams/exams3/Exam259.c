/* 259-相同分数的最大操作数目 I
 *
 */

#include <assert.h>

int maxOperations(int *nums, int numsSize)
{
    int c = 0;
    int sum = nums[0] + nums[1];

    for (size_t i = 0; i < numsSize - 1; i += 2)
        if (nums[i] + nums[i + 1] == sum)
            c++;
        else
            break;

    return c;
}

int main(int argc, char const *argv[])
{
    int nums[] = {3, 2, 1, 4, 5};
    assert(maxOperations(nums, 5) == 2);

    return 0;
}
