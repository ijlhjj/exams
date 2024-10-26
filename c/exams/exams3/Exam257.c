/* 257-给小朋友们分糖果 I
 *
 */

#include <assert.h>

int distributeCandies(int n, int limit)
{
    int count = 0;

    for (int i = 0; i <= n && i <= limit; i++)
        for (int j = 0; j <= n - i && j <= limit; j++)
            for (int k = 0; k <= n - i - j && k <= limit; k++)
            {
                // 不允许有剩余糖果
                if (n - i - j - k > 0)
                    continue;

                count++;
            }

    return count;
}

int main(int argc, char const *argv[])
{
    assert(distributeCandies(3, 3) == 10);

    return 0;
}
