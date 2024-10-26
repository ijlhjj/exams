/* 246-拆炸弹
 *
 */

#include <stdlib.h>
#include <assert.h>

int *decrypt(int *code, int codeSize, int k, int *returnSize)
{
    int *result = malloc(codeSize * sizeof(int)); /* 申请返回数组空间 */
    *returnSize = codeSize;                       // 返回数组元素数量

    // 循环赋值数组元素
    for (int i = 0; i < codeSize; i++)
    {
        if (k == 0)
        { // 直接赋值 0
            result[i] = 0;
        }
        else if (k > 0)
        {
            // 大于 0 替换为后续 k 个数字之和
            int sum = 0;
            // 计算后续 k 个数字之和
            for (int j = 1; j <= k; j++)
            {
                // 达到数组末尾循环至第一个元素
                int index = (i + j) % codeSize;
                sum += code[index];
            }
            result[i] = sum; // 替换
        }
        else
        {
            // 小于 0 替换为之前 k 个数字之和
            int sum = 0;
            // 计算之前 k 个数字之和。这里k为负值，使用 -k
            for (int j = 1; j <= -k; j++)
            {
                // 达到数组第一个元素之前循环至数组末尾
                int index = (i - j + codeSize) % codeSize;
                sum += code[index];
            }
            result[i] = sum; // 替换
        }
    }

    return result;
}

int main(int argc, char const *argv[])
{
    // int code[] = {5, 7, 1, 4};
    int code[] = {2, 4, 9, 3}; // 第一次提交答案错误
    int codeSize = 4;
    int returnSize;

    int *result = decrypt(code, codeSize, -2, &returnSize);
    assert(codeSize == returnSize);

    // int expected[] = {12, 10, 16, 13};
    int expected[] = {12, 5, 6, 13};
    for (int i = 0; i < codeSize; i++)
        assert(expected[i] == result[i]);

    return 0;
}
