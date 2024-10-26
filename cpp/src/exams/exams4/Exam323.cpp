#include "exams4.h"

long long maximumSubsequenceCount(string text, string pattern)
{
    char c1 = pattern.at(0);
    char c2 = pattern.at(1);

    // 统计第2个字符数量
    int count2 = 0;
    for (char c : text)
    {
        if (c == c2)
            count2++;
    }

    // 如果2个字符相同，则结果为以下 序列和
    if (c1 == c2)
        return (long long)count2 * (1 + count2) / 2;

    // 定义在首位插入字符1的 total1 和 在尾部插入字符2的 total2 统计数量
    long long total1 = count2;
    long long total2 = 0;

    int count1 = 0; // 统计字符1出现数量
    for (char c : text)
    {
        if (c == c1)
        { // 发现字符1
            total1 += count2;
            count1++;
        }
        else if (c == c2)
        { // 发现字符2
            total2 += count1;
            count2--;
        }
    }

    // 在尾部插入字符2时 加入字符1的数量
    total2 += count1;

    // 返回两者较大者
    if (total1 > total2)
        return total1;
    else
        return total2;
}
