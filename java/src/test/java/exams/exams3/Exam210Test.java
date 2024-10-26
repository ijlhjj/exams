package exams.exams3;

import exams.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam210Test {

    Exam210 exam = new Exam210();

    @Test
    void buildTree1() {
        TreeNode root = exam.buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3});
        TreeNode expected = TreeNode.createTreeNode(new int[]{3, 9, 20, -1, -1, 15, 7});
        assertEquals(expected, root);
    }

}
