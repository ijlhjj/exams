package exams.exams1;

import java.util.LinkedList;

/**
 * 73-用两个栈实现队列
 *
 * @author ijlhjj
 * @version 1.0 2023-08-26
 */
public class Exam73 {

    /**
     * Your CQueue object will be instantiated and called as such:
     * CQueue obj = new CQueue();
     * obj.appendTail(value);
     * int param_2 = obj.deleteHead();
     */
    static class CQueue {

        private LinkedList<Integer> addStack = new LinkedList<>();
        private LinkedList<Integer> delStack = new LinkedList<>();

        public CQueue() {
        }

        public void appendTail(int value) {
            addStack.addFirst(value);
        }

        public int deleteHead() {
            if (!delStack.isEmpty()) return delStack.removeFirst();

            if (addStack.isEmpty()) return -1;

            while (!addStack.isEmpty()) {
                delStack.addFirst(addStack.removeFirst());
            }

            return delStack.removeFirst();
        }
    }

}
