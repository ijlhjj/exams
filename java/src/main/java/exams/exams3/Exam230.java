package exams.exams3;

import exams.TreeNode;

/**
 * 230-找出克隆二叉树中的相同节点
 *
 * @author ijlhjj
 * @version 1.0 2024-04-03
 */
public class Exam230 {

    private TreeNode preorder(TreeNode cloned, TreeNode target) {
        //基准条件
        if (cloned == null)
            return null;

        if (cloned.val == target.val)
            return cloned;

        TreeNode left = preorder(cloned.left, target); //遍历左子树

        if (left != null)
            return left;

        return preorder(cloned.right, target);
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return preorder(cloned, target);
    }

}
