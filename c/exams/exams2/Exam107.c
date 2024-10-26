/* 107-将钱分给最多的儿童
 *
 */

#include <assert.h>

int distMoney(int money, int children)
{
    // 不能每个儿童至少获得 1 美元
    if (money < children)
        return -1;

    // 每个儿童分配 1 美元
    money -= children;

    int c = money / 7; // 还有多少人能分7美元，凑成8美元
    int r = money % 7; // 分完还剩多少美元

    if (c > children) // 如果能分7美元的大于总人数，把所有多出来的给最后一个人
        c = children - 1;
    else if (c == children && r > 0) // 如果刚好所有人都能分7美元，没有余数在所有人刚好8美元，有余数则最后一个人大于8美元
        c--;
    else if (c == children - 1 && r == 3) // 如果只有一个人不能分到7美元，则只需要保证最后一个人不是4美元
        c--;

    return c;
}

int main(int argc, char const *argv[])
{
    int c = distMoney(20, 3);
    assert(c == 1);

    return 0;
}
