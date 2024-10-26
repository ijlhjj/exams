/* 294-捕获黑皇后需要的最少移动次数
 *
 *     答案只能是1或2
 */

#include <stdlib.h>
#include <assert.h>

// 定义最小值宏
#define min(a, b) (((a) < (b)) ? (a) : (b))
// 定义最大值宏
#define max(a, b) (((a) > (b)) ? (a) : (b))

int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f)
{
    // 象在不在对角线
    if (abs(e - c) == abs(f - d))
    {
        // 车有没有挡象
        if (abs(c - a) != abs(d - b))
            return 1;

        if (!(a > min(c, e) && a < max(c, e) && b > min(d, f) && b < max(d, f)))
            return 1;
    }

    // 车有没有在同一直线
    if (a == e)
    {
        // 象有没有挡车
        if (c == a)
        {
            if (d > min(b, f) && d < max(b, f))
                return 2;
            else
                return 1;
        }
        else
        {
            return 1;
        }
    }

    // 车有没有在同一直线
    if (b == f)
    {
        // 象有没有挡车
        if (d == b)
        {
            if (c > min(a, e) && c < max(a, e))
                return 2;
            else
                return 1;
        }
        else
        {
            return 1;
        }
    }

    return 2;
}

int main(int argc, char const *argv[])
{
    assert(minMovesToCaptureTheQueen(1, 1, 8, 8, 2, 3) == 2);

    return 0;
}
