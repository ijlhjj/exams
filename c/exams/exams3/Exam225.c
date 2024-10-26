/* 225-合并后数组中的最大元素
 *
 */

#include <assert.h>

long long maxArrayValue(int *nums, int numsSize)
{
    long long total = 0;

    for (int i = numsSize - 1; i >= 0; i--)
    {
        int val = *(nums + i);
        if (total >= val)
            total += val;
        else
            total = val;
    }

    return total;
}

int main(int argc, char const *argv[])
{
    int nums[] = {2, 3, 7, 9, 3};
    assert(maxArrayValue(nums, 5) == 21);

    return 0;
}
