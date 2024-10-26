package exams.exams2;

import exams.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exam198Test {

    Exam198 exam = new Exam198();

    @Test
    void isCousins1() {
        TreeNode root = TreeNode.createTreeNode(new int[]{1, 2, 3, 4});
        assertFalse(exam.isCousins(root, 4, 3));
    }

    @Test
    void isCousins2() {
        TreeNode root = TreeNode.createTreeNode(new int[]{1, 2, 3, -1, 4, -1, 5});
        assertTrue(exam.isCousins(root, 5, 4));
    }

    @Test
    void isCousins3() {
        TreeNode root = TreeNode.createTreeNode(new int[]{1, 2, 3, -1, 4});
        assertFalse(exam.isCousins(root, 2, 3));
    }

}
