/* 14-将数字变成 0 的操作次数
 *
 */

#include <stdio.h>

int numberOfSteps(int num)
{
    int count = 0;

    while (num != 0)
    {
        if (num % 2 == 0)
            num /= 2;
        else
            num -= 1;

        count++;
    }

    return count;
}

int main(int argc, char const *argv[])
{
    int count = numberOfSteps(14);
    printf("%d\n", count);

    return 0;
}
