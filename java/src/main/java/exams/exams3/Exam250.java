package exams.exams3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 250-安排工作以达到最大收益
 *
 * @author ijlhjj
 * @version 1.0 2024-05-17
 */
public class Exam250 {

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        //定义工作难度收益映射，方便后续查询
        Map<Integer, Integer> profitMap = new HashMap<>();
        for (int i = 0; i < difficulty.length; i++) {
            profitMap.merge(difficulty[i], profit[i], Math::max);
        }

        //工作收益已存放上面的映射中，这里可以对工作难度进行排序处理
        Arrays.sort(difficulty);

        //循环处理映射值，把每个收益替换为工作难度更小但收益更大的值
        int maxProfit = 0;
        for (int d : difficulty) {
            int p = profitMap.get(d);
            if (p > maxProfit) {
                maxProfit = p;
            } else {
                profitMap.put(d, maxProfit);
            }
        }

        int total = 0; //最大利润

        //循环分配每一个工人
        for (int w : worker) {
            //在工作难度数组进行二分查找
            int index = Arrays.binarySearch(difficulty, w);
            //如果找到相等值
            if (index >= 0) {
                int key = difficulty[index]; //取当前元素为key值（等于w）
                total += profitMap.get(key); //增加相应利润值
            } else {
                //没有找到，计算插入位置
                index = -index - 1;
                //等于0表示 不能完成任何工作
                if (index > 0) {
                    int key = difficulty[index - 1]; //key为可完成工作难度最大值
                    total += profitMap.get(key);//增加相应利润值
                }
            }
        }

        return total;
    }

}
