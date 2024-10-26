package exams.exams3;

import exams.TreeNode;

/**
 * 215-二叉搜索树的范围和
 *
 * @author ijlhjj
 * @version 1.0 2024-02-26
 */
public class Exam215 {

    int sum;

    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        preorder(root, low, high);
        return sum;
    }

    private void preorder(TreeNode node, int low, int high) {
        //基准条件
        if (node == null)
            return;

        //当前节点值
        if (node.val >= low && node.val <= high)
            sum += node.val;

        preorder(node.left, low, high); //遍历左子树
        preorder(node.right, low, high); //遍历右子树
    }

}
