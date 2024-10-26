package exams.exams3;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Exam228 {

    public int distinctIntegers(int n) {
        Set<Integer> nums = new HashSet<>();
        nums.add(n);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);

        while (!queue.isEmpty()) {
            int val = queue.poll();

            for (int i = 2; i <= n; i++) {
                if (val % i == 1 && !nums.contains(i)) {
                    nums.add(i);
                    queue.offer(i);
                }
            }
        }

        return nums.size();
    }

}
