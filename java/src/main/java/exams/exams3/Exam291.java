package exams.exams3;

import exams.TreeNode;

/**
 * 291-另一棵树的子树
 *
 * @author ijlhjj
 * @version 1.0 2024-08-04
 */
public class Exam291 {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return preorder(root, subRoot); //递归求解
    }

    /**
     * 前序遍历对比
     */
    private boolean preorder(TreeNode root, TreeNode subRoot) {
        //基准条件
        if (root == null)
            return false;

        if (root.val == subRoot.val && isSame(root, subRoot))
            return true;

        //遍历左子树
        if (preorder(root.left, subRoot))
            return true;

        //遍历右子树
        return preorder(root.right, subRoot);
    }

    /**
     * 判断两棵树是否相等
     */
    private boolean isSame(TreeNode root, TreeNode subRoot) {
        //两个null相等，null和非null不相等
        if (root == null)
            return subRoot == null;

        if (subRoot == null)
            return false;

        if (root.val != subRoot.val) //当前节点不同返回false
            return false;

        //对比左子树
        if (!isSame(root.left, subRoot.left))
            return false;

        //对比右子树
        if (!isSame(root.right, subRoot.right))
            return false;

        return true;
    }

}
