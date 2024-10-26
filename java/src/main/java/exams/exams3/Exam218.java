package exams.exams3;

import java.util.LinkedList;
import java.util.Queue;

public class Exam218 {

    static class MyStack {
        private Queue<Integer> queue1;
        private Queue<Integer> queue2;

        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        public void push(int x) {
            if (queue1.isEmpty()) {
                queue2.offer(x);
            } else {
                queue1.offer(x);
            }
        }

        public int pop() {
            if (queue1.isEmpty()) {
                while (!queue2.isEmpty()) {
                    int x = queue2.poll();
                    if (queue2.isEmpty())
                        return x;
                    queue1.add(x);
                }
            } else {
                while (!queue1.isEmpty()) {
                    int x = queue1.poll();
                    if (queue1.isEmpty())
                        return x;
                    queue2.add(x);
                }
            }
            return -1;
        }

        public int top() {
            if (queue1.isEmpty()) {
                while (!queue2.isEmpty()) {
                    int x = queue2.poll();
                    queue1.add(x);
                    if (queue2.isEmpty())
                        return x;
                }
            } else {
                while (!queue1.isEmpty()) {
                    int x = queue1.poll();
                    queue2.add(x);
                    if (queue1.isEmpty())
                        return x;
                }
            }
            return -1;
        }

        public boolean empty() {
            return queue1.isEmpty() && queue2.isEmpty();
        }
    }

}
