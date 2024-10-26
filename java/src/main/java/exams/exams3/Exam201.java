package exams.exams3;

import exams.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 201-二叉树的后序遍历
 *
 * @author ijlhjj
 * @version 1.0 2024-02-12
 */
public class Exam201 {

    private void postorder(List<Integer> nums, TreeNode node) {
        //基准条件
        if (node == null) return;

        postorder(nums, node.left); //遍历左子树
        postorder(nums, node.right); //遍历右子树
        nums.add(node.val); //当前节点值
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        postorder(nums, root); //递归求解
        return nums;
    }

}
