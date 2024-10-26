/* 19-最长交替子序列
 *
 */

#include <stdio.h>
#include <stdbool.h>

/**
 * 计算最长交替子序列长度
 */
int alternatingSubarray(int *nums, int numsSize)
{
    int maxLen = -1; // 如果不存在交替子数组返回 -1
    int i = 0;

    // 对比与后一个元素的差，外层循环截至到倒数第2个元素
    while (i < numsSize - 1)
    {
        int len = 0; // 本次循环找到的交替子序列长度
        int t1 = *(nums + i);
        int t2 = *(nums + i + 1);

        if (t2 - t1 == 1)
        {                     // 找到交替子序列
            len += 2, i += 2; // 长度加2，步进加2

            // 内层循环对比后续元素是否是交替子序列
            while (i < numsSize)
            {
                if (t1 == *(nums + i))
                { // 第一个元素交替
                    len++, i++;

                    // 第二个元素交替，只有第一个元素交替时才需要判断第二个元素是否交替
                    if (i < numsSize && t2 == *(nums + i))
                        len++, i++;
                    else // 第二个元素不交替
                        break;
                }
                else // 第一个元素不交替
                    break;
            }
        }

        if (len > 0)
        { // 本次循环存在交替子序列，交替子序列长度更长时更新最大值
            if (len > maxLen)
                maxLen = len;

            // 发现交替子序列，步进长度 len - 1
            i--;
        }
        else // 没有发现交替子序列，步进 1
            i++;
    }

    return maxLen;
}

int main(int argc, char const *argv[])
{
    // int nums[] = {2, 3, 4, 3, 4};
    // int nums[] = {13, 14, 15, 14}; // 第一次提交结果错误
    int nums[] = {23, 24, 23, 24, 25, 24, 25, 24, 25}; // 第二次提交结果错误
    int maxLen = alternatingSubarray(nums, 9);
    printf("%d\n", maxLen);

    return 0;
}
