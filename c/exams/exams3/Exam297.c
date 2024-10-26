/* 297-按键变更的次数
 *
 */

#include <ctype.h>

int countKeyChanges(char *s)
{
    int c = 0;                // 统计数
    int letter = toupper(*s); // 第一个字符转为大写

    // 遍历直到结尾
    while ((*s) != '\0')
    {
        int curr = toupper(*s); // 获取当前字符转为大写
        if (curr != letter)
        { // 两个字符不同时视为一次按键变更
            c++;
            letter = curr;
        }
        s++; // 指针推进
    }

    return c;
}
