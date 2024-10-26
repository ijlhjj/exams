/* 3-罗马数字转整数
 *
 */

#include <stdio.h>
#include <string.h>

/* 1位罗马数字转整数 */
int roman_digit1(char c)
{
    switch (c)
    {
    case 'I':
        return 1;
    case 'V':
        return 5;
    case 'X':
        return 10;
    case 'L':
        return 50;
    case 'C':
        return 100;
    case 'D':
        return 500;
    case 'M':
        return 1000;
    default:
        return 0;
    }
}

/* 2个字符的相等性测试 */
int is_same_str(const char *str1, const char *str2)
{
    return !strncmp(str1, str2, 2);
}

/* 2位罗马数字转整数 */
int roman_digit2(char *s)
{
    if (is_same_str(s, "IV"))
        return 4;
    else if (is_same_str(s, "IX"))
        return 9;
    else if (is_same_str(s, "XL"))
        return 40;
    else if (is_same_str(s, "XC"))
        return 90;
    else if (is_same_str(s, "CD"))
        return 400;
    else if (is_same_str(s, "CM"))
        return 900;
    else
        return 0;
}

/* 罗马数字转整数函数 */
int roman_to_int(char *s)
{
    int r = 0;            // 两字符转换临时值
    int num = 0;          // 转换后的值
    int index = 0;        // 处理索引位
    size_t l = strlen(s); // 字符串长度

    /* 只有1位直接转换 */
    if (l == 1)
        return roman_digit1(s[0]);

    /* 每次循环可能处理两位，所以索引最大是倒数第2位，避免下标越界 */
    while (index < l - 1)
    {
        r = roman_digit2(s + index); // 尝试2个字符转换，不是合法2位罗马数字返回 0

        if (r)
        {
            // 如果是2位罗马数字，数字计和后索引多加1位
            num += r;
            index++;
        }
        else
        {
            num += roman_digit1(s[index]);
        }

        index++; // 索引加1
    }

    /* 循环对结尾不是2位罗马数字的最后一位没有处理，在这里处理最后1位 */
    if (index < l)
        num += roman_digit1(s[index]);

    return num;
}

int main(int argc, char const *argv[])
{
    printf("%d\n", roman_to_int("III"));
    printf("%d\n", roman_to_int("IV"));
    printf("%d\n", roman_to_int("IX"));
    printf("%d\n", roman_to_int("LVIII"));
    printf("%d\n", roman_to_int("MCMXCIV"));

    return 0;
}
