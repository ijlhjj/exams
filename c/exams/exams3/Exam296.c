/* 296-特殊数组 I
 *
 */

#include <stdbool.h>
#include <assert.h>

bool isArraySpecial(int *nums, int numsSize)
{
    int rem = nums[0] % 2; // 判断奇偶性
    bool flag = true;      // 设置旗标

    for (int i = 0; i < numsSize; i++)
    {
        if (flag)
        { // 隔位元素奇偶性不同，返回fasle
            if (nums[i] % 2 != rem)
                return false;
        }
        else
        { // 相邻元素奇偶性相同，返回fasle
            if (nums[i] % 2 == rem)
                return false;
        }

        flag = !flag;
    }

    return true;
}

int main(int argc, char const *argv[])
{
    int nums[] = {1};
    assert(isArraySpecial(nums, 1) == true);

    return 0;
}
