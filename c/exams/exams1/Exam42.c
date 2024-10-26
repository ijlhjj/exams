/* 42-满足目标工作时长的员工数目
 *
 */

#include <stdio.h>

int numberOfEmployeesWhoMetTarget(int *hours, int hoursSize, int target)
{
    int count = 0;

    for (int i = 0; i < hoursSize; i++)
        if (*(hours + i) >= target)
            count++;

    return count;
}

int main(int argc, char const *argv[])
{
    int nums[] = {0, 1, 2, 3, 4};
    int *hours = nums;

    int count = numberOfEmployeesWhoMetTarget(hours, 5, 2);
    printf("%d\n", count);

    return 0;
}
