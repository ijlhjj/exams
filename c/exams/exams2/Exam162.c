/* 162-区分黑球与白球
 *
 */

#include <string.h>
#include <assert.h>

long long minimumSteps(char *s)
{
    int l = strlen(s);
    int i = l - 1; // 双指针初始都指向最后一个字符
    int j = l - 1;

    long long n = 0LL; // 移动步数

    while (i >= 0 && j >= 0)
    {
        // 指针 i 指向第一个找到的字符 '0'
        while (i >= 0 && s[i] == '1')
            i--;

        // 指针 j 的初始位置从 i 下标开始
        if (j == l - 1)
            j = i;

        // 指针 j 指向第一个找到的字符 '1'
        while (j >= 0 && s[j] == '0')
            j--;

        // 如果超出字符串范围，则不再处理
        if (i < 0 || j < 0)
            break;

        // 如果两个指针分别指向字符 '0' 和 '1'，交换字符并计算交换移动步数
        if (s[j] == '1' && s[i] == '0')
        {
            n = n + i - j;
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
        }
    }

    return n;
}

int main(int argc, char const *argv[])
{
    char s[] = "101";
    assert(minimumSteps(s) == 1LL);

    return 0;
}
