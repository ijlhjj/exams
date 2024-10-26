/* 274-交替子数组计数
 *
 */

#include <assert.h>

long long gaussSum(int r, int l)
{
    int d = r - l - 1;
    if (d < 1)
        return 0;
    return (1LL + d) * d / 2LL; // 交替子数组为高斯和
}

long long countAlternatingSubarrays(int *nums, int numsSize)
{
    long long c = numsSize; // 数量初始化为单元素数量

    int l = 0;  // 交替元素左起始下标
    int k = -1; // 当前元素值，初始化为-1保证第一次比对不会跟第一个元素相同
    for (int i = 0; i < numsSize; i++)
    {
        if (nums[i] != k)
        { // 当前元素跟前一个元素值不同，更新当前值
            k = nums[i];
        }
        else
        {                        // 元素相同，不再是交替子数组
            c += gaussSum(i, l); // 计算当前子段的交替子数组的数量
            l = i;               // 更新左边界下标
        }
    }

    // 计算最后一个子段的交替子数组的数量
    c += gaussSum(numsSize, l);

    return c;
}

int main(int argc, char const *argv[])
{
    int nums[] = {0, 1, 1, 1};
    assert(countAlternatingSubarrays(nums, 4) == 5);

    return 0;
}
