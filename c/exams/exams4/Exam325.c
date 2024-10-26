/* 325-每种字符至少取 K 个
 *
 */

#include <string.h>
#include <stdbool.h>
#include <assert.h>

// 定义最小值宏
#define min(a, b) (((a) < (b)) ? (a) : (b))

// 判断每种字符 至少 k 个
bool check(int *counter, int k)
{
    for (size_t i = 0; i < 3; i++)
        if (counter[i] < k) // 字符少于 k 个，返回 false
            return false;
    return true;
}

int takeCharacters(char *s, int k)
{
    // 0直接返回
    if (k == 0)
        return 0;

    size_t l = strlen(s); // 字符串长度

    int counter[3] = {0}; // 定义3个元素的数组，存放 'a','b','c' 的个数

    int minLen = 0; // 最少满足题意长度

    // 左侧满足题意子串
    for (int i = 0; i < l; i++)
    {
        counter[s[i] - 'a']++; // 相应统计元素增加
        if (check(counter, k))
        {                   // 满足题意退出
            minLen = i + 1; // 长度为下标加 1
            break;
        }
    }

    // 字符串不满足题意 返回 -1
    if (minLen == 0)
        return -1;

    // 双指针
    int leftLimit = minLen; // 左子串上限（不包含）
    int right = l;          // 右子串下限（包含），初始为空

    bool flag = true; // 满足题意旗标，按以上处理，初始为 true

    // 循环至没有左子串
    while (leftLimit > 0)
    {
        if (flag)
        { // 如果满足题意，左指针不断左移，直到不满足题意
            while (flag && leftLimit > 0)
            {
                minLen = min(minLen, leftLimit + l - right); // 计算最小长度

                // 统计减当前字符，指针左移
                leftLimit--;
                counter[s[leftLimit] - 'a']--;

                flag = check(counter, k); // 检查是否满足题意
            }
        }
        else
        { // 如果不满足题意，右指针不断左移，直到满足题意
            while (!flag && right >= 0)
            {
                // 指针左移，统计加当前字符
                right--;
                counter[s[right] - 'a']++;

                flag = check(counter, k); // 检查是否满足题意
            }
        }
    }

    // 退出上面循环时仍可能满足题意，再补充计算一次
    if (check(counter, k))
        minLen = min(minLen, leftLimit + l - right); // 计算最小长度

    return minLen;
}

int main(int argc, char const *argv[])
{
    char *s = "aabaaaacaabc";
    // char *s = "cbbac"; // 第一次提交答案错误
    // char *s = "abc";   // 第二次提交答案错误
    assert(takeCharacters(s, 2) == 8);

    return 0;
}
