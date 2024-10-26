/* 44-反转字符串中的单词
 *
 */

#include <stdio.h>
#include <string.h>

/* 字符交换函数，使用 O(1) 额外空间 */
void swap(char *a, char *b)
{
    char c = *a;
    *a = *b;
    *b = c;
}

char *reverseWords(char *s)
{
    size_t size = strlen(s);

    // 对字符串进行倒序，原地 操作
    int low = -1;
    int high = size;
    while (++low < --high)
        swap(s + low, s + high);

    // 遍历倒序后的字符串，原地 操作
    int curr = 0;
    int start = 0;
    int end;
    while (start < size)
    {
        // 找第一个非空格作为单词起始
        while (*(s + start) == ' ' && *(s + start) != '\0')
            start++;

        if (start >= size) // 遍历完字符串则跳出循环
            break;

        // 从单词起始找第一个空格作为单词结尾
        int l = start - 1;
        int r = start + 1;
        while (*(s + r) != ' ' && *(s + r) != '\0')
            r++;

        end = r; // 记录单词结束位置

        // 单词倒序，经过两次倒序，单词恢复正序
        while (++l < --r)
            swap(s + l, s + r);

        // 如果不是字符串起始位置0，则在单词之间加一个空格
        if (curr > 0)
        {
            *(s + curr) = ' ';
            curr++;
        }

        // 拷贝单词到合适位置
        while (start < end)
        {
            *(s + curr) = *(s + start);
            curr++;
            start++;
        }
    }

    *(s + curr) = '\0'; // 添加字符串结束标识

    return s;
}

int main(int argc, char const *argv[])
{
    // char words[] = "the sky is blue\0";
    // char words[] = "  hello world  \0";
    char words[] = "a good   example\0";

    char *s = words;
    char *result = reverseWords(s);

    printf("%s\n", result);

    return 0;
}
