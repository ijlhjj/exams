/* 161-使三个字符串相等
 *
 */

#include <string.h>
#include <assert.h>

int findMinimumOperations(char *s1, char *s2, char *s3)
{
    int l1 = strlen(s1);
    int l2 = strlen(s2);
    int l3 = strlen(s3);

    int i = 0; // 相等字符串长度
    for (; i < l1; i++)
    {
        // 超出任一字符串长度，退出循环
        if (i >= l2 || i >= l3)
            break;

        // 有字符不相同，退出循环
        if (s1[i] != s2[i] || s1[i] != s3[i])
            break;
    }

    // 不存在相等字符串返回 -1
    if (i == 0)
        return -1;

    // 操作次数等于3个字符串长度减去 相同字符串长度 * 3
    return (l1 + l2 + l3) - i * 3;
}

int main(int argc, char const *argv[])
{
    assert(findMinimumOperations("abc", "abb", "ab") == 2);

    return 0;
}
