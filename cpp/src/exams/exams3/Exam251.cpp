#include "exams3.h"

int maxDivScore(vector<int> &nums, vector<int> &divisors)
{
    set<int> divSet(divisors.begin(), divisors.end()); // 使用集合避免重复处理
    map<int, int> scoreMap;                            // 使用字典存放元素得分

    // 循环计算集合元素得分
    for (int d : divSet)
    {
        int s = 0;
        for (int n : nums)
            if (n % d == 0)
                s++;

        scoreMap[d] = s;
    }

    // 按题意选取得分最高、值最小元素
    int minD = 1000000000;
    int maxS = 0;
    for (const auto &[key, value] : scoreMap)
    {
        if (value > maxS)
        { // 得分更大时赋值
            maxS = value;
            minD = key;
        }
        else if (value == maxS && key < minD)
        { // 得分相等、值更小时赋值
            minD = key;
        }
    }

    return minD;
}
