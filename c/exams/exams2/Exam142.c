/* 142-阈值距离内邻居最少的城市
 *
 */

#include <assert.h>

int maximizeSum(int *nums, int numsSize, int k)
{
    int max = 0;
    for (int i = 0; i < numsSize; i++)
    {
        int n = *(nums + i);
        if (n > max)
            max = n;
    }

    int sum = 0;
    for (int i = 0; i < k; i++)
    {
        sum += max;
        max++;
    }
    return sum;
}

int main(int argc, char const *argv[])
{
    int nums[] = {1, 2, 3, 4, 5};
    assert(maximizeSum(nums, 5, 3) == 18);

    return 0;
}
