/* 12-字符串转换整数 (atoi)
 *
 */

#include <stdio.h>
#include <limits.h>

/**
 * 字符串转换整数 (atoi)
 */
int myAtoi(char *s)
{
    int flag = 0;  // 是否溢出标识
    int sign = -1; // 符号位，正数为 0，负数为 1
    int num = 0;   // 整数转换结果
    char c;        // 处理字符

    // 循环处理每个字符，直到字符串结束
    while ((c = *s++) != '\0')
    {
        if (c == ' ')
        {
            // 找到空格，如果 sign = -1 ，说明是前导空格，否则结束处理
            if (sign < 0)
                continue;
            else
                break;
        }

        // 找到非空格的第一个字符时判断符号位
        if (sign < 0)
        {
            if (c == '-')
            {
                sign = 1;
                continue;
            }
            else if (c == '+')
            {
                sign = 0;
                continue;
            }
            else
                sign = 0;
        }

        // 溢出判断
        if (num > INT_MAX / 10 || (num == INT_MAX / 10 && c > '7' && c <= '9'))
            flag = 1;

        // 累计发现的数字字符，不是数字字符时结束处理
        if (c >= '0' && c <= '9')
        {
            // 数字累计溢出时按符号位赋最大值或最小值
            if (flag)
            {
                if (sign == 0)
                    num = INT_MAX;
                else if (sign == 1)
                    num = INT_MIN;

                break;
            }
            num = num * 10 + (c - '0');
        }
        else
            break;
    }

    // 符号位为负，且累计和不是整数最小负值时取反
    if (num > 0 && sign > 0)
        num = -num;

    return num;
}

int main(int argc, char const *argv[])
{
    printf("%d\n", myAtoi("4193 with words"));
    printf("%d\n", myAtoi("   -42"));
    printf("%d\n", myAtoi("-91283472332"));
    printf("%d\n", myAtoi("+1"));
    printf("%d\n", myAtoi("2147483646"));
    printf("%d\n", myAtoi("-2147483648"));

    return 0;
}
