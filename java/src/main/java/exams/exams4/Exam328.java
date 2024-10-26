package exams.exams4;

import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 328-座位预约管理系统
 *
 * @author ijlhjj
 * @version 1.0 2024-09-30
 */
public class Exam328 {

    static class SeatManager {

        private PriorityQueue<Integer> priorityQueue;

        public SeatManager(int n) {
            priorityQueue = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toCollection(PriorityQueue::new));
        }

        public int reserve() {
            return priorityQueue.poll();
        }

        public void unreserve(int seatNumber) {
            priorityQueue.add(seatNumber);
        }
    }

}
