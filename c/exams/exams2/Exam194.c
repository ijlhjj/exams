/* 194-最长交替子数组
 *
 */

#include <assert.h>

int alternatingSubarray(int *nums, int numsSize)
{
    int mc = 0;   // 最长 交替子数组 长度
    int c = 0;    // 当前 交替子数组 长度
    int diff = 1; // 相邻元素差值

    // 循环到最后一个元素之前，交替子数组 长度大于 1 ，只有最后一个元素时不需要处理
    for (int i = 0; i < numsSize - 1; i++)
    {
        int n = nums[i];        // 当前元素值
        int next = nums[i + 1]; // 下一元素值

        // s1 - s0 = 1 ，s2 - s1 = -1
        if (next == n + diff)
        {
            // 找到 交替子数组 ，起始长度应为 2
            if (c == 0)
                c = 1;
            c++;
        }
        else
        { // 不再交替
            // 长度更长时更新最长长度
            if (c > mc)
                mc = c;

            c = 0;    // 长度归 0
            diff = 1; // 差值归 1

            // 再次判断是否为 交替子数组 起始。
            // 此处有可能不是交替，但可能是下一个 交替子数组 的起始
            if (next == n + diff)
                c = 2;
            else
                diff = -diff; // 差值取反
        }

        diff = -diff; // 差值取反
    }

    // 最后都是 交替子数组 时，循环内可能没有更新最长长度
    // 长度更长时更新最长长度
    if (c > mc)
        mc = c;

    // 不存在交替子数组，返回 -1
    if (mc == 0)
        return -1;

    return mc;
}

int main(int argc, char const *argv[])
{
    int nums[] = {2, 3, 4, 3, 4};
    assert(alternatingSubarray(nums, 5) == 4);

    return 0;
}
