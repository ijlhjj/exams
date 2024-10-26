/* 247-给植物浇水
 *
 */

#include <assert.h>

int wateringPlants(int *plants, int plantsSize, int capacity)
{
    int step = 0;

    int water = capacity;
    for (int i = 0; i < plantsSize; i++)
    {
        if (water >= plants[i])
        {
            // 剩余水量足够
            water -= plants[i];
            step++;
        }
        else
        {
            water = capacity - plants[i];
            step += (2 * i + 1);
        }
    }

    return step;
}

int main(int argc, char const *argv[])
{
    int plants[] = {2, 2, 3, 3};
    assert(wateringPlants(plants, 4, 5) == 14);

    return 0;
}
