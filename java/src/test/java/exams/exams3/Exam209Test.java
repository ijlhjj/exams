package exams.exams3;

import exams.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam209Test {

    Exam209 exam = new Exam209();

    @Test
    void buildTree1() {
        TreeNode root = exam.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        TreeNode expected = TreeNode.createTreeNode(new int[]{3, 9, 20, -1, -1, 15, 7});
        assertEquals(expected, root);
    }

    /**
     * 目前创建二叉树的方法使用了 -1 表示节点为空，此数据暂时不可测。（待优化）
     */
    void buildTree2() {
        TreeNode root = exam.buildTree(new int[]{-1}, new int[]{-1});
        TreeNode expected = TreeNode.createTreeNode(new int[]{-1});
        assertEquals(expected, root);
    }

}
