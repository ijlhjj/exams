/* 261-取整购买后的账户余额
 *
 */

#include <math.h>
#include <assert.h>

int accountBalanceAfterPurchase(int purchaseAmount)
{
    double d = round(purchaseAmount / 10.0);
    return 100 - (int)(d * 10);
}

int main(int argc, char const *argv[])
{
    assert(accountBalanceAfterPurchase(9) == 90);
    assert(accountBalanceAfterPurchase(15) == 80);
    assert(accountBalanceAfterPurchase(11) == 90); // 第一次提交答案错误

    return 0;
}
