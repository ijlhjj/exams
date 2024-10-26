package exams.exams2;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 174-移除石子使总数最小
 *
 * @author ijlhjj
 * @version 1.0 2023-12-23
 */
public class Exam174 {

    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int n : piles)
            priorityQueue.add(n);

        for (int i = 0; i < k; i++) {
            int num = priorityQueue.poll();
            num = (int) Math.ceil(num / 2.0);
            priorityQueue.add(num);
        }

        int sum = priorityQueue.stream().mapToInt(Integer::intValue).sum();

        return sum;
    }

}
