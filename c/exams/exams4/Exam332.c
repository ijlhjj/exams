/* 332-三角形的最大高度
 *
 */

#include <assert.h>

int maxHeightOfTriangle(int red, int blue)
{
    int high = 1; // 高度
    int odd = 0;  // 奇层和
    int even = 0; // 偶层和
    int *curr;    // 当前处理层

    while (1)
    {
        // 判断当前处理奇、偶层
        if (high % 2 == 1)
            curr = &odd;
        else
            curr = &even;

        *curr += high; // 增加当前层球数

        // 如果两种颜色都足够继续处理
        if (*curr <= red && *curr <= blue)
            high++;
        else
        {
            // 上一层两种颜色都满足，这里需要减 1
            if (*curr > red && *curr > blue)
                high--;

            break;
        }
    }

    return high;
}

int main(int argc, char const *argv[])
{
    assert(maxHeightOfTriangle(2, 4) == 3);

    return 0;
}
