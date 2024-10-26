/* 136-最大二进制奇数
 *
 */

#include <string.h>
#include <assert.h>

/*
 * 交换字符串中 i 和 j 位置的字符
 */
void swap(char *s, int i, int j)
{
    char c = *(s + i);
    *(s + i) = *(s + j);
    *(s + j) = c;
}

/*
 * 双指针题解
 * 函数原地交换字符，返回入参 s ，没有申请额外空间
 */
char *maximumOddBinaryNumber(char *s)
{
    size_t size = strlen(s);
    int i = 0;        // 左指针
    int j = size - 1; // 右指针

    // 把右边第一个发现的字符 1 交换到最后一个位置，保证结果是 奇数
    while (j >= i)
    {
        // 发现字符 1 ，交换到最后一个字符，退出循环
        if (*(s + j) == '1')
        {
            if (j != size - 1)
                swap(s, j, size - 1);
            break;
        }
        j--;
    }

    j--; // 跳出循环后右指针需要左移 1 位

    // 移动双指针，对右侧发现的 1 和左侧发现的 0 进行交换，使结果最大
    while (j > i)
    {
        if (*(s + j) == '1') // 右边发现 1
        {
            while (i < j && *(s + i) == '1') // 左边递增到不为 1
                i++;

            if (i < j) // 字符交换
                swap(s, i, j);
        }
        j--;
    }

    return s;
}

int main(int argc, char const *argv[])
{
    char s1[] = "010";
    assert(strcmp("001", maximumOddBinaryNumber(s1)) == 0);

    char s2[] = "0101";
    assert(strcmp("1001", maximumOddBinaryNumber(s2)) == 0);

    return 0;
}
