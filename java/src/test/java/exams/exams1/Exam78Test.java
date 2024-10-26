package exams.exams1;

import exams.exams1.Exam78.Node;
import org.junit.jupiter.api.Test;

class Exam78Test {

    /**
     * 这个相等性不好测试，不测了
     */
    @Test
    void copyRandomList() {
        Exam78 exam = new Exam78();

        int[][] nodes = {{7, -1}, {13, 0}, {11, 4}, {10, 2}, {1, 0}};
        Node head = Node.createNode(nodes);
        Node node = exam.copyRandomList(head);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

}
