/* 327-买票需要的时间
 *
 */

int timeRequiredToBuy(int *tickets, int ticketsSize, int k)
{
    int seconds = 0;        // 需要的时间
    int limit = tickets[k]; // 位置 k 的票数作为上限

    // 位置 k 之前的，增加不超过 limit 值（大于limit增加limit，否则增加当前票数）
    for (int i = 0; i <= k; i++)
    {
        if (tickets[i] > limit)
            seconds += limit;
        else
            seconds += tickets[i];
    }

    limit--; // 位置 k 之后的上限减 1

    // 位置 k 之后的，增加不超过 limit 值（大于limit增加limit，否则增加当前票数）
    for (int i = k + 1; i < ticketsSize; i++)
    {
        if (tickets[i] > limit)
            seconds += limit;
        else
            seconds += tickets[i];
    }

    return seconds;
}
