package exams.exams1;

import exams.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam91Test {

    Exam91 exam = new Exam91();

    @Test
    void subtreeWithAllDeepest1() {
        TreeNode root = TreeNode.createTreeNode(new int[]{3, 5, 1, 6, 2, 0, 8, -1, -1, 7, 4});
        TreeNode result = exam.subtreeWithAllDeepest(root);
        TreeNode expected = TreeNode.createTreeNode(new int[]{2, 7, 4});
        assertEquals(expected, result);
    }

    @Test
    void subtreeWithAllDeepest2() {
        TreeNode root = TreeNode.createTreeNode(new int[]{1});
        TreeNode result = exam.subtreeWithAllDeepest(root);
        TreeNode expected = TreeNode.createTreeNode(new int[]{1});
        assertEquals(expected, result);
    }

    @Test
    void subtreeWithAllDeepest3() {
        TreeNode root = TreeNode.createTreeNode(new int[]{0, 1, 3, -1, 2});
        TreeNode result = exam.subtreeWithAllDeepest(root);
        TreeNode expected = TreeNode.createTreeNode(new int[]{2});
        assertEquals(expected, result);
    }

}
