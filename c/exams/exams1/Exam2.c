/* 2-回文数
 *
 */

#include <stdio.h>
#include <stdbool.h>

/* 回文数判断函数 */
bool isPalindrome(int x)
{
    int i, j, size;
    int digit[10] = {0}; // 存储每一位数字，题目设定：x <= 2^31 - 1

    if (x < 0) // 负数不是回文
        return false;
    else if (x < 10) // 1位正整数是回文
        return true;

    size = 0; // 数值的位数
    do
    {
        digit[size] = x % 10; // 取1位数字，此处反向存储不会影响回文数判断
        x /= 10;              // 舍弃上步取的数字
        size++;               // 位数+1
    } while (x > 0);          // 还存在数值则继续取值

    // 从两端向中间对每1位进行相等判断，不相等则不是回文
    for (i = 0, j = size - 1; i < j; i++, j--)
        if (digit[i] != digit[j])
            return false;

    return true; // 循环完所有位判断则是回文
}

int main(int argc, char const *argv[])
{
    printf("%d, %d, %d\n", isPalindrome(121), isPalindrome(-121), isPalindrome(10));

    return 0;
}
