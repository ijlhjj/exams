/* 298-Alice 和 Bob 玩鲜花游戏
 *
 */

#include <assert.h>

long long flowerGame(int n, int m)
{
    int evenCount1 = n / 2;               // 小于等于 n 的偶数个数
    long long oddCount1 = n - evenCount1; // 奇数个数，使用 long long 避免溢出和计算时强制转换

    int evenCount2 = m / 2;               // 小于等于 m 的偶数个数
    long long oddCount2 = m - evenCount2; // 奇数个数，使用 long long 避免溢出和计算时强制转换

    long long count = 0LL;

    // 鲜花总是为奇数时 Alice 可以获胜，所以符合题意的组合数量为 两个奇偶值乘积的和
    count += oddCount1 * evenCount2;
    count += evenCount1 * oddCount2;

    return count;
}

int main(int argc, char const *argv[])
{
    assert(flowerGame(3, 2) == 3);

    return 0;
}
