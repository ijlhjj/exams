/* 266-气温变化趋势
 *
 */

#include <assert.h>

int temperatureTrend(int *temperatureA, int temperatureASize, int *temperatureB, int temperatureBSize)
{
    int max = 0;

    int c = 0;
    int flag1 = 0, flag2 = 0;
    for (size_t i = 0; i < temperatureASize - 1; i++)
    {
        if (temperatureA[i + 1] > temperatureA[i])
            flag1 = 1;
        else if (temperatureA[i + 1] < temperatureA[i])
            flag1 = -1;
        else
            flag1 = 0;

        if (temperatureB[i + 1] > temperatureB[i])
            flag2 = 1;
        else if (temperatureB[i + 1] < temperatureB[i])
            flag2 = -1;
        else
            flag2 = 0;

        if (flag1 == flag2)
            c++;
        else
            c = 0;

        if (c > max)
            max = c;
    }

    return max;
}

int main(int argc, char const *argv[])
{
    int nums1[] = {21, 18, 18, 18, 31};
    int nums2[] = {34, 32, 16, 16, 17};
    assert(temperatureTrend(nums1, 5, nums2, 5) == 2);

    return 0;
}
