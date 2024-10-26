package exams.exams1;

import exams.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam97_3Test {

    Exam97_3 exam = new Exam97_3();

    @Test
    void rob1() {
        int[] nodes = {3, 2, 3, -1, 3, -1, 1};
        TreeNode root = TreeNode.createTreeNode(nodes);
        assertEquals(7, exam.rob(root));
    }

    @Test
    void rob2() {
        int[] nodes = {3, 4, 5, 1, 3, -1, 1};
        TreeNode root = TreeNode.createTreeNode(nodes);
        assertEquals(9, exam.rob(root));
    }

    /**
     * 第一次提交答案错误
     */
    @Test
    void rob3() {
        int[] nodes = {4, 1, -1, 2, -1, -1, -1, 3};
        TreeNode root = TreeNode.createTreeNode(nodes);
        assertEquals(7, exam.rob(root));
    }

}
