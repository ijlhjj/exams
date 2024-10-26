/* 272-哈沙德数
 *
 */

#include <assert.h>

int sumOfTheDigitsOfHarshadNumber(int x)
{
    int sum = 0;

    int n = x;
    while (n > 0)
    {
        int d = n % 10;
        n = n / 10;
        sum += d;
    }

    if (x % sum == 0)
        return sum;

    return -1;
}

int main(int argc, char const *argv[])
{
    assert(sumOfTheDigitsOfHarshadNumber(18) == 9);
    return 0;
}
