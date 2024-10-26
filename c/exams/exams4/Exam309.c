/* 309-在既定时间做作业的学生人数
 *
 */

int busyStudent(int *startTime, int startTimeSize, int *endTime, int endTimeSize, int queryTime)
{
    int c = 0;

    for (int i = 0; i < startTimeSize; i++)
    {
        if (startTime[i] <= queryTime && queryTime <= endTime[i])
            c++;
    }

    return c;
}
