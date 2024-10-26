/* 265-美丽下标对的数目
 *
 */

#include <assert.h>

int getFirstDigit(int n)
{
    while (n > 9)
        n /= 10;
    return n;
}

int getLastDigit(int n)
{
    return n % 10;
}

int gcd(int m, int n)
{
    if (m % n == 0)
        return n;
    else
        return gcd(n, m % n);
}

int countBeautifulPairs(int *nums, int numsSize)
{
    int c = 0;

    for (size_t i = 0; i < numsSize; i++)
    {
        int f = getFirstDigit(nums[i]);
        for (size_t j = i + 1; j < numsSize; j++)
        {
            int l = getLastDigit(nums[j]);
            if (gcd(f, l) <= 1)
                c++;
        }
    }

    return c;
}

int main(int argc, char const *argv[])
{
    // int nums[] = {2, 5, 1, 4};
    int nums[] = {11, 21, 12};
    assert(countBeautifulPairs(nums, 3) == 2);

    return 0;
}
