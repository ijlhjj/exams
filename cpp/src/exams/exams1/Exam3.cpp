#include "exams1.h"

int romanToInt(string s)
{
    // 定义符号字典
    map<char, int> symbolValues{
        {'I', 1},
        {'V', 5},
        {'X', 10},
        {'L', 50},
        {'C', 100},
        {'D', 500},
        {'M', 1000}};

    int ans{};
    int n = s.length();

    for (int i = 0; i < n; i++)
    {
        int val = symbolValues[s[i]];
        // 若存在小的数字在大的数字的左边的情况，根据规则需要减去小的数字。
        if (i < n - 1 && val < symbolValues[s[i + 1]])
            ans -= val;
        else
            ans += val;
    }

    return ans;
}
