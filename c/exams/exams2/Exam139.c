/* 139-元素和最小的山形三元组 I
 *
 */

#include <assert.h>

int minimumSum(int *nums, int numsSize)
{
    int minSum = 150; // 按题目描述最大和不会超过 150

    int flag = 0; // 找到 山形三元组 标识
    for (int i = 0; i < numsSize; i++)
    {
        int first = nums[i];
        for (int j = i + 1; j < numsSize; j++)
        {
            if (nums[j] > first)
            { // 第 2 个元素要大于第 1 个元素
                int second = nums[j];
                for (int k = j + 1; k < numsSize; k++)
                {
                    // 第 2 个元素要大于第 3 个元素
                    if (nums[k] < second)
                    {
                        int sum = first + second + nums[k]; // 当前 山形三元组 的和
                        if (sum < minSum)
                        {
                            minSum = sum;
                            flag = 1; // 如果存在山形三元组，这个标识最少会更新 1 次。也可以加在判断外面多次更新
                        }
                    }
                }
            }
        }
    }

    // 找到 山形三元组，返回最小和
    if (flag)
        return minSum;

    return -1;
}

int main(int argc, char const *argv[])
{
    int nums[] = {8, 6, 1, 5, 3};
    assert(minimumSum(nums, 5) == 9);

    return 0;
}
