/* 243-满足目标工作时长的员工数目
 *
 */

#include <assert.h>

int numberOfEmployeesWhoMetTarget(int *hours, int hoursSize, int target)
{
    int c = 0;

    for (int i = 0; i < hoursSize; i++)
    {
        if (hours[i] >= target)
            c++;
    }

    return c;
}

int main(int argc, char const *argv[])
{
    int hours[] = {0, 1, 2, 3, 4};
    assert(numberOfEmployeesWhoMetTarget(hours, 5, 2) == 3);

    return 0;
}
