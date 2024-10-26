/* 331-鸡蛋掉落-两枚鸡蛋
 *
 */

#include <assert.h>

int twoEggDrop(int n)
{
    int count = 0;
    int diff = 0;
    while (n > 0)
    {
        count++;
        diff++;
        n -= diff;
    }
    return count;
}

int main(int argc, char const *argv[])
{
    assert(twoEggDrop(100) == 14);

    return 0;
}
