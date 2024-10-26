package exams.exams2;

import exams.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 198-二叉树的堂兄弟节点
 *
 * @author ijlhjj
 * @version 1.0 2024-02-08
 */
public class Exam198 {

    public boolean isCousins(TreeNode root, int x, int y) {
        //定义当前层节点列表
        List<TreeNode> levels = new ArrayList<>();
        levels.add(root);

        boolean flag = false; //定义找到一个节点的旗标
        //广度遍历二叉树
        while (!levels.isEmpty()) {
            List<TreeNode> childs = new ArrayList<>(); //下一层的子节点列表
            //遍历当前层节点，把不为空的子节点加入子节点列表
            for (TreeNode node : levels) {
                TreeNode left = node.left;
                TreeNode right = node.right;

                //x和y父节点相同的情况
                if (left != null && right != null && ((left.val == x || left.val == y) && (right.val == x || right.val == y))) {
                    return false;
                }

                //左子节点不为空
                if (left != null) {
                    childs.add(left);
                    if (left.val == x || left.val == y) {
                        //旗标为真，并且在同一层找到第二个值
                        if (flag)
                            return true;
                        flag = true; //设置旗标
                    }
                }

                //右子节点不为空
                if (right != null) {
                    childs.add(right);
                    if (right.val == x || right.val == y) {
                        //旗标为真，并且在同一层找到第二个值
                        if (flag)
                            return true;
                        flag = true;//设置旗标
                    }
                }
            }

            //如果当前层只找到一个节点，则另一个节点不在同一层
            if (flag)
                return false;

            levels = childs; //遍历下一层
        }

        //循环中一定会返回，程序不会运行到这里
        return false;
    }

}
