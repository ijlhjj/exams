/* 247-给植物浇水 II
 *
 */

#include <assert.h>

int minimumRefill(int *plants, int plantsSize, int capacityA, int capacityB)
{
    int c = 0; // 装水次数

    int waterA = capacityA;
    int waterB = capacityB;
    // 双指针循环处理
    for (int i = 0, j = plantsSize - 1; i <= j; i++, j--)
    {
        if (i == j)
        { // 奇数个数时两个指针相遇
            if (waterA < plants[i] && waterB < plants[i])
                c++;
        }
        else
        {
            // Alice
            if (waterA < plants[i])
            {
                // 剩余水量不够
                waterA = capacityA - plants[i];
                c++;
            }
            else
            {
                waterA -= plants[i];
            }

            // Bob
            if (waterB < plants[j])
            {
                // 剩余水量不够
                waterB = capacityB - plants[j];
                c++;
            }
            else
            {
                waterB -= plants[j];
            }
        }
    }

    return c;
}

int main(int argc, char const *argv[])
{
    int plants[] = {2, 2, 3, 3};
    assert(minimumRefill(plants, 4, 5, 5) == 1);

    return 0;
}
