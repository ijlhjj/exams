/* 245-去掉最低工资和最高工资后的工资平均值
 *
 */

#include <assert.h>

double average(int *salary, int salarySize)
{
    int max = salary[0];
    int min = salary[0];
    double sum = 0;

    for (int i = 0; i < salarySize; i++)
    {
        sum += salary[i];
        if (salary[i] > max)
            max = salary[i];
        else if (salary[i] < min)
            min = salary[i];
    }

    return (sum - max - min) / (salarySize - 2);
}

int main(int argc, char const *argv[])
{
    int salary[] = {4000, 3000, 1000, 2000};
    double avg = average(salary, 4);
    assert(avg == 2500.000000);

    return 0;
}
