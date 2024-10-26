package exams.exams1;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 73-用栈实现队列
 *
 * @author ijlhjj
 * @version 1.0 2024-03-04
 */
public class Exam73_2 {

    static class MyQueue {
        private Deque<Integer> addStack;
        private Deque<Integer> delStack;

        public MyQueue() {
            addStack = new LinkedList<>();
            delStack = new LinkedList<>();
        }

        public void push(int x) {
            addStack.push(x);
        }

        public int pop() {
            if (!delStack.isEmpty())
                return delStack.pop();

            if (addStack.isEmpty())
                return -1;

            while (!addStack.isEmpty()) {
                delStack.push(addStack.pop());
            }

            return delStack.pop();
        }

        public int peek() {
            if (!delStack.isEmpty())
                return delStack.peek();

            if (addStack.isEmpty())
                return -1;

            while (!addStack.isEmpty()) {
                delStack.push(addStack.pop());
            }

            return delStack.peek();
        }

        public boolean empty() {
            return addStack.isEmpty() && delStack.isEmpty();
        }
    }

}
