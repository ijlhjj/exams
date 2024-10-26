/* 101-计算列车到站时间
 *
 */

#include <assert.h>

int findDelayedArrivalTime(int arrivalTime, int delayedTime)
{
    return (arrivalTime + delayedTime) % 24;
}

int main(int argc, char const *argv[])
{
    int c = findDelayedArrivalTime(15, 5);
    assert(c == 20);

    return 0;
}
