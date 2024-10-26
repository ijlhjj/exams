/* 86-最多可以摧毁的敌人城堡数目
 *
 */

#include <assert.h>

int captureForts(int *forts, int fortsSize)
{
    int max = 0, flag = 0;

    for (int i = 0, j = 0, k = 0; k < fortsSize; k++)
    {
        int num = *(forts + k);
        if (num == 0)
            continue;
        else if (num == 1)
        {
            i = k;
            if (flag == -1)
            {
                int c = i - j - 1;
                if (c > max)
                    max = c;
            }
            flag = 1;
        }
        else if (num == -1)
        {
            j = k;
            if (flag == 1)
            {
                int c = j - i - 1;
                if (c > max)
                    max = c;
            }
            flag = -1;
        }
    }

    return max;
}

int main(int argc, char const *argv[])
{
    int forts[] = {1, 0, 0, -1, 0, 0, 0, 0, 1};
    int c = captureForts(forts, 9);
    assert(c == 4);

    return 0;
}
