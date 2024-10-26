/* 45-找出字符串中第一个匹配项的下标
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void getNext(char *p, int pLen, int *nextVal)
{
    nextVal[0] = -1;

    int j = 0;
    int k = -1;
    while (j < pLen - 1)
    {
        if (k == -1 || p[j] == p[k])
        {
            j++;
            k++;
            if (p[j] != p[k])
                *(nextVal + j) = k;
            else
                *(nextVal + j) = *(nextVal + k);
        }
        else
        {
            k = *(nextVal + k);
        }
    }
}

/* KMP算法 */
int strStr(char *haystack, char *needle)
{
    int i = 0; // 主串的位置
    int j = 0; // 模式串的位置

    int sLen = strlen(haystack);
    int pLen = strlen(needle);

    int *nextVal = malloc(pLen * sizeof(int)); // 申请返回数组空间
    getNext(needle, pLen, nextVal);

    while (i < sLen && j < pLen)
    {
        // 当j为-1时，要移动的是i，当然j也要归0
        if (j == -1 || haystack[i] == needle[j])
            i++, j++;
        else
            j = *(nextVal + j); // j回到指定位置
    }

    if (j == pLen)
        return i - j;

    return -1;
}

int main(int argc, char const *argv[])
{
    // printf("%d\n", strStr("sadbutsad", "sad"));
    printf("%d\n", strStr("hello", "ll"));

    return 0;
}
