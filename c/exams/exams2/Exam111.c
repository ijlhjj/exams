/* 111-递枕头
 *
 */

#include <assert.h>

int passThePillow(int n, int time)
{
    int l = n - 1;    // 队伍从头到尾需要传递 n-1 次
    int q = time / l; // 商表示需要来回传递多少遍
    int r = time % l; // 余表示最后一遍距离队首或队尾的距离

    // 余数为 0 表示最后一遍没有折返
    if (r == 0)
    {
        r += l;
        q--;
    }

    // 偶数趟最后一次是正向，按队首计；奇数趟最后一次是折返，按队尾计
    if (q % 2 == 0)
        return r + 1;
    else
        return n - r;
}

int main(int argc, char const *argv[])
{
    int c = passThePillow(4, 5);
    assert(c == 2);

    return 0;
}
