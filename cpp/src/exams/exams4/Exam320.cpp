#include "exams4.h"

int longestContinuousSubstring(string s)
{
    int maxL{0};
    int i{0};
    int j{0};
    int k{1};

    while (k < s.size())
    {
        if (s[j] + 1 != s[k])
        { // 不连续
            int l = k - i;
            if (l > maxL)
            {
                maxL = l;
                // 达到最长可达值，直接返回
                if (maxL == 26)
                    return maxL;
            }

            i = k;
        }

        j = k;
        k++;
    }

    // 字符串最后一次处理
    int l = k - i;
    if (l > maxL)
        maxL = l;

    return maxL;
}
