/* 46-反转字符串
 *
 */

#include <stdio.h>
#include <string.h>

void reverseString(char *s, int sSize)
{
    char c;

    // 使用 O(1) 交换字符
    for (int i = 0, j = sSize - 1; i < j; i++, j--)
    {
        c = *(s + i);
        *(s + i) = *(s + j);
        *(s + j) = c;
    }
}

int main(int argc, char const *argv[])
{
    char words[] = "hello\0";
    char *s = words;

    reverseString(s, strlen(s));

    printf("%s\n", s);

    return 0;
}
