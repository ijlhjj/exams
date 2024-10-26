#include <set>
#include <cmath>

#include "exams3.h"

// 素数判断函数
bool isPrime(int num)
{
    // 最小素数是 2
    if (num < 2)
        return false;

    // 循环判断至开平方值即可
    double last = sqrt(num);
    for (int i = 2; i <= last; i++)
        if (num % i == 0)
            return false;

    return true; // 都不能整除时返回 true
}

int maximumPrimeDifference(vector<int> &nums)
{
    int l = nums.size();

    // 最大、最小下标赋初值
    int minIndex = l;
    int maxIndex = 0;

    // 创建100以内的素数集合
    set<int> primeSet;
    for (int i = 2; i < 100; i++)
        if (isPrime(i))
            primeSet.insert(i);

    for (int i = 0; i < l; i++)
    {
        // 发现素数则更新下标
        if (primeSet.contains(nums[i]))
        {
            if (i < minIndex)
                minIndex = i;

            maxIndex = i;
        }
    }

    return maxIndex - minIndex;
}
