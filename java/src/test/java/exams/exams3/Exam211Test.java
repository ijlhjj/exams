package exams.exams3;

import exams.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam211Test {

    Exam211 exam = new Exam211();

    @Test
    void constructFromPrePost1() {
        TreeNode root = exam.constructFromPrePost(new int[]{1, 2, 4, 5, 3, 6, 7}, new int[]{4, 5, 2, 6, 7, 3, 1});
        TreeNode expected = TreeNode.createTreeNode(new int[]{1, 2, 3, 4, 5, 6, 7});
        assertEquals(expected, root);
    }

    @Test
    void constructFromPrePost2() {
        TreeNode root = exam.constructFromPrePost(new int[]{1}, new int[]{1});
        TreeNode expected = TreeNode.createTreeNode(new int[]{1});
        assertEquals(expected, root);
    }

    @Test
    void constructFromPrePost3() {
        TreeNode root = exam.constructFromPrePost(new int[]{1, 2, 4, 5}, new int[]{4, 5, 2, 1});
        TreeNode expected = TreeNode.createTreeNode(new int[]{1, 2, -1, 4, 5});
        assertEquals(expected, root);
    }

}
