/* 163-爬楼梯
 *
 */

#include <assert.h>

int climbStairs(int n)
{
    int last = 1, next = 2; // 初始值

    for (int i = 1; i < n; i++)
    {
        int oldLast = last;
        last = next;
        next = oldLast + next;
    }

    return last;
}

int main(int argc, char const *argv[])
{
    assert(climbStairs(2) == 2);

    return 0;
}
