/* 318-公交站间的距离
 *
 */

#include <assert.h>

// 定义最小值宏
#define min(a, b) (((a) < (b)) ? (a) : (b))

int distanceBetweenBusStops(int *distance, int distanceSize, int start, int destination)
{
    int total = 0; // 距离总和
    int ds1 = 0;   // 正向距离

    // 交换使 start 到 destination 是正向间距
    if (destination < start)
    {
        int temp = start;
        start = destination;
        destination = temp;
    }

    for (int i = 0; i < distanceSize; i++)
    {
        total += distance[i];
        // 在正向范围内的才统计正向
        if (i >= start && i < destination)
            ds1 += distance[i];
    }

    return min(ds1, total - ds1); // 返回两者较小的
}

int main(int argc, char const *argv[])
{
    int distance[] = {7, 10, 1, 12, 11, 14, 5, 0};
    assert(distanceBetweenBusStops(distance, 8, 7, 2) == 17);

    return 0;
}
