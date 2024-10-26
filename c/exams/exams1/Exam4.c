/* 4-最长公共前缀
 *
 */

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

/* 查找字符串数组中的最长公共前缀函数 */
char *longest_common_prefix(char **strs, int strsSize)
{
    char *result;     // 存储最终返回的字符串指针
    int l1;           // 存储字符串长度
    char c1;          // 存储比对字符
    char *s;          // 比对字符指针
    char *s1 = *strs; // 第一个字符串指针，输入保证最少有一个字符串

    result = malloc(200 * sizeof(char)); // 申请返回数组空间
    memset(result, '\0', 200);           // 结果数组初始化

    l1 = strlen(s1); // 第一个字符串长度

    /* 如果第一个字符串为空，不用处理，直接返回空字符串 */
    if (l1 > 0)
    {
        /* 按第一个字符串进行循环处理 */
        for (int i = 0; i < l1; i++)
        {
            c1 = *(s1 + i); // 取第一个字符串的当前字符

            /* 循环对比其它字符串对应字符，j从1开始 */
            for (int j = 1; j < strsSize; j++)
            {
                s = *(strs + j); // 当前对比字符串

                /* 如果当前字符串已至结尾，或如果当前比对字符不同，不用继续对比，直接返回已比对结果 */
                if (!(i < strlen(s) && c1 == *(s + i)))
                    return result;
            }

            result[i] = c1; // 如果所有字符串的当前字符都相同，则加入比对结果
        }
    }

    return result;
}

int main(int argc, char const *argv[])
{
    char *result;
    // char *strs[3] = {"flower", "flow", "flight"};
    char *strs[3] = {"dog", "racecar", "car"};

    result = longest_common_prefix(strs, 3);
    printf("%s", result);

    return 0;
}
