package exams.exams2;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 121-执行 K 次操作后的最大分数
 *
 * @author ijlhjj
 * @version 1.0 2023-10-18
 */
public class Exam121 {

    public long maxKelements(int[] nums, int k) {
        long sum = 0;

        //使用优先队列存储数据
        PriorityQueue<Integer> numPriorityQueue = new PriorityQueue(Comparator.naturalOrder().reversed());
        for (int n : nums)
            numPriorityQueue.add(n);

        for (int i = 0; i < k; i++) {
            // 取最大分数计入总和
            int n = numPriorityQueue.poll();
            sum += n;

            // 按题目要求更新值
            n = (int) Math.ceil(n / 3.0);
            numPriorityQueue.add(n);
        }

        return sum;
    }

}
