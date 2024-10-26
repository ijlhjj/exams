/* 80-距离原点最远的点
 *
 */

#include <stdlib.h>
#include <assert.h>

int furthestDistanceFromOrigin(char *moves)
{
    int l = 0, r = 0, u = 0;

    while (*moves != '\0')
    {
        // moves 仅由字符 'L'、'R' 和 '_' 组成
        if (*moves == 'L')
            l++;
        else if (*moves == 'R')
            r++;
        else
            u++;

        moves++;
    }

    return abs(l - r) + u;
}

int main(int argc, char const *argv[])
{
    int l = furthestDistanceFromOrigin("L_RL__R");
    assert(l == 3);

    l = furthestDistanceFromOrigin("_R__LL_");
    assert(l == 5);

    l = furthestDistanceFromOrigin("_______");
    assert(l == 7);

    return 0;
}
