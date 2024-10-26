/* 276-寻找数组的中心下标
 *
 */

#include <assert.h>

int pivotIndex(int *nums, int numsSize)
{
    // 求数组和
    int sum = 0;
    for (int i = 0; i < numsSize; i++)
        sum += nums[i];

    // 定义左侧元素和、右侧元素和
    int leftSum;
    int rightSum;
    for (int i = 0; i < numsSize; i++)
    {
        if (i == 0)
        {
            leftSum = 0;
            rightSum = sum - nums[0];
        }
        else
        {
            leftSum += nums[i - 1];
            rightSum -= nums[i];
        }

        if (leftSum == rightSum)
            return i;
    }

    return -1;
}

int main(int argc, char const *argv[])
{
    int nums[] = {1, 7, 3, 6, 5, 6};
    assert(pivotIndex(nums, 6) == 3);

    return 0;
}
