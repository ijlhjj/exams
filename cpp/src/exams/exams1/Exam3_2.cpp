// 3-整数转罗马数字

#include "exams1.h"

// 根据罗马数字的唯一表示法，为了表示一个给定的整数 num ，我们寻找不超过 num 的最大符号值，将 num 减去该符号值，
// 然后继续寻找不超过 num 的最大符号值，将该符号拼接在上一个找到的符号之后，循环直至 num 为 0 。
// 最后得到的字符串即为 num 的罗马数字表示。
string intToRoman(int num)
{
    const pair<int, string> valueSymbols[] = {
        {1000, "M"},
        {900, "CM"},
        {500, "D"},
        {400, "CD"},
        {100, "C"},
        {90, "XC"},
        {50, "L"},
        {40, "XL"},
        {10, "X"},
        {9, "IX"},
        {5, "V"},
        {4, "IV"},
        {1, "I"},
    };

    string roman;
    // 循环符号数组
    for (auto &[value, symbol] : valueSymbols)
    {
        // 当前值不超过 num 时，不断拼接当前符号
        while (value <= num)
        {
            roman = roman + symbol;
            num -= value;
        }

        // 余数为 0 时可结束循环
        if (num == 0)
            break;
    }

    return roman;
}
