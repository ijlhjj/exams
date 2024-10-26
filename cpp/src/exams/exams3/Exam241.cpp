#include "exams3.h"

int distanceTraveled(int mainTank, int additionalTank)
{
    int tank{0}; // 消耗燃料

    // 主油箱 5 升燃料处理一次
    while (mainTank >= 5)
    {
        // 消耗增加，主油箱减少
        tank += 5;
        mainTank -= 5;

        // 副油箱有油则转移，没有时退出循环
        if (additionalTank > 0)
        {
            additionalTank--;
            mainTank++;
        }
        else
        {
            break;
        }
    }

    tank += mainTank; // 消耗完主油箱

    // 返回行驶距离，每升燃料行驶 10 km
    return tank * 10;
}
