package exams.exams3;

import exams.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam232Test {

    @Test
    void maxAncestorDiff() {
        Exam232 exam = new Exam232();
        TreeNode root = TreeNode.createTreeNode(new int[]{8, 3, 10, 1, 6, -1, 14, -1, -1, 4, 7, 13});
        assertEquals(7, exam.maxAncestorDiff(root));
    }

}