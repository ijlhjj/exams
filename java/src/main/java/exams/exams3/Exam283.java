package exams.exams3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 283-需要添加的硬币的最小数量
 *
 * @author ijlhjj
 * @version 1.0 2024-07-20
 */
public class Exam283 {

    public int minimumAddedCoins(int[] coins, int target) {
        //排序以方便后续处理，元素顺序不影响结果
        Arrays.sort(coins);

        //定义列表存储需要添加的硬币面值
        List<Integer> addCoin = new ArrayList<>();

        /*
         2的n次方元素序列可以组合成所有的金额大小。
            例如：1、2、4 可以组成7以内的所有金额；
            1、2、4、8 可以组成15以内的所有金额。
         */

        //寻找在可用面值之前需要添加哪些面值硬币。初值为1，如果小于最小的可用面值，则持续添加乘以2的元素序列
        int curr = 1;
        while (curr < coins[0]) {
            addCoin.add(curr);
            curr *= 2;
        }

        //添置完前置元素计算当前可获得的最大金额和
        int maxSum = 0;
        for (int n : addCoin)
            maxSum += n;

        maxSum += coins[0];    //可获得金额和初始加上 coins[0]
        int index = 1; //可用面值下标初值 1
        int coin = maxSum + 1; //下一个需要添加的面值
        //当前可获得金额和小于目标值时继续处理
        while (maxSum < target) {
            if (index < coins.length) {
                //如果数组还有可用面值：需要的面值小于下一个可用面值，这时需要添加
                while (coin < coins[index]) {
                    addCoin.add(coin); //增加1个可用面值
                    maxSum += coin; //可获得的金额和也增加 coin
                    coin = maxSum + 1;
                }

                //金额和增加当前可用面值，更新下一个需要添加的面值和下标
                maxSum += coins[index];
                coin = maxSum + 1;
                index++;
            } else {
                //如果已经没有可用面值，直接增加需要的面值即可
                addCoin.add(coin); //增加1个可用面值
                maxSum += coin; //可获得的金额和也增加 coin
                coin = maxSum + 1;
            }
        }

        //返回添加的面值数量
        return addCoin.size();
    }

}
