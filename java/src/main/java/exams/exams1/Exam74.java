package exams.exams1;

import java.util.LinkedList;

/**
 * 74-最小栈
 *
 * @author ijlhjj
 * @version 1.0 2023-08-26
 */
public class Exam74 {

    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
    static class MinStack {

        private LinkedList<Node> elementsStack = new LinkedList<>();
        private int minVal = Integer.MAX_VALUE;

        public MinStack() {
        }

        public void push(int val) {
            if (val < minVal)
                minVal = val;

            Node e = new Node(val, minVal);
            elementsStack.addFirst(e);
        }

        public void pop() {
            Node e = elementsStack.removeFirst();

            if (elementsStack.isEmpty())
                minVal = Integer.MAX_VALUE;
            else
                minVal = getMin();
        }

        public int top() {
            return elementsStack.getFirst().val;
        }

        public int getMin() {
            return elementsStack.getFirst().minVal;
        }

        private class Node {
            public int val;
            public int minVal;

            public Node(int val, int minVal) {
                this.val = val;
                this.minVal = minVal;
            }
        }
    }

}
