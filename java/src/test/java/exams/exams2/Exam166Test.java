package exams.exams2;

import exams.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam166Test {

    Exam166 exam = new Exam166();

    @Test
    void reverseOddLevels1() {
        TreeNode root = TreeNode.createTreeNode(new int[]{2, 3, 5, 8, 13, 21, 34});
        TreeNode expected = TreeNode.createTreeNode(new int[]{2, 5, 3, 8, 13, 21, 34});
        assertEquals(expected, exam.reverseOddLevels(root));
    }

    @Test
    void reverseOddLevels2() {
        TreeNode root = TreeNode.createTreeNode(new int[]{7, 13, 11});
        TreeNode expected = TreeNode.createTreeNode(new int[]{7, 11, 13});
        assertEquals(expected, exam.reverseOddLevels(root));
    }

    @Test
    void reverseOddLevels3() {
        TreeNode root = TreeNode.createTreeNode(new int[]{0, 1, 2, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2});
        TreeNode expected = TreeNode.createTreeNode(new int[]{0, 2, 1, 0, 0, 0, 0, 2, 2, 2, 2, 1, 1, 1, 1});
        assertEquals(expected, exam.reverseOddLevels(root));
    }

    @Test
    void reverseOddLevels4() {
        TreeNode root = TreeNode.createTreeNode(new int[]{1});
        TreeNode expected = TreeNode.createTreeNode(new int[]{1});
        assertEquals(expected, exam.reverseOddLevels(root));
    }

}
