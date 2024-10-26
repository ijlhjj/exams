package exams.exams2;

import exams.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam157Test {

    Exam157 exam = new Exam157();

    @Test
    void bstToGst1() {
        TreeNode root = TreeNode.createTreeNode(new int[]{4, 1, 6, 0, 2, 5, 7, -1, -1, -1, 3, -1, -1, -1, 8});
        TreeNode expected = TreeNode.createTreeNode(new int[]{30, 36, 21, 36, 35, 26, 15, -1, -1, -1, 33, -1, -1, -1, 8});
        assertEquals(expected, exam.bstToGst(root));
    }

    @Test
    void bstToGst2() {
        TreeNode root = TreeNode.createTreeNode(new int[]{0, -1, 1});
        TreeNode expected = TreeNode.createTreeNode(new int[]{1, -1, 1});
        assertEquals(expected, exam.bstToGst(root));
    }

}
