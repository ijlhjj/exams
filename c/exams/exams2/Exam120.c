/* 120-倍数求和
 *
 */

#include <assert.h>

int sumOfMultiples(int n)
{
    int sum = 0;

    for (int i = 1; i <= n; i++)
    {
        if (i % 3 == 0)
            sum += i;
        else if (i % 5 == 0)
            sum += i;
        else if (i % 7 == 0)
            sum += i;
    }

    return sum;
}

int main(int argc, char const *argv[])
{
    assert(sumOfMultiples(7) == 21);
    assert(sumOfMultiples(10) == 40);
    assert(sumOfMultiples(9) == 30);

    return 0;
}
