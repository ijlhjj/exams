#include "exams4.h"

int latestTimeCatchTheBus(vector<int> &buses, vector<int> &passengers, int capacity)
{
    sort(buses.begin(), buses.end());           // 公交车排序
    sort(passengers.begin(), passengers.end()); // 乘客排序

    int sb = buses.size();
    int sp = passengers.size();

    int index = 0; // 存储最后一辆车的乘客下标
    int num;       // 最晚到达时间

    for (int i = 0; i < sb; i++)
    {
        int leave = buses[i]; // 发车时间
        int j = 0;
        // 最多可乘坐 capacity 个乘客
        for (; j < capacity && index < sp; j++)
        {
            if (passengers[index] <= leave)
                index++;
            else // 超出发车时间跳出循环
                break;
        }

        // 最后一辆车特殊处理
        if (i == sb - 1)
        {
            // 最后一辆车没有合适的乘客
            if (j == 0)
                return leave;

            // 最后一辆车坐满，下标减 1，指向最后一个可坐乘客的下标
            if (j == capacity)
            {
                index--;
                num = passengers[index] - 1;
            }
            else
            {
                num = leave; // 到达时间为发车时间
            }

            index--;

            // 不能 跟别的乘客同时刻到达，在时间冲突时递减
            while (index >= 0 && passengers[index] == num)
            {
                index--;
                num--;
            }
        }
    }

    return num;
}
