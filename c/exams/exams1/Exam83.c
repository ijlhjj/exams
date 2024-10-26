/* 83-0～n-1中缺失的数字
 *
 */

#include <assert.h>

int missingNumber(int *nums, int numsSize)
{
    for (int i = 0; i < numsSize; i++)
        if (*(nums + i) != i)
            return i;

    return numsSize; // 缺失最后一项
}

int main(int argc, char const *argv[])
{
    int nums[] = {0, 1, 3};
    int c = missingNumber(nums, 3);
    assert(c == 2);

    return 0;
}
