package exams.exams2;

import exams.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 200-二叉树的前序遍历
 *
 * @author ijlhjj
 * @version 1.0 2024-02-11
 */
public class Exam200 {

    private void preorder(List<Integer> nums, TreeNode node) {
        //基准条件
        if (node == null) return;

        nums.add(node.val); //当前节点值
        preorder(nums, node.left); //遍历左子树
        preorder(nums, node.right); //遍历右子树
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        preorder(nums, root); //递归求解
        return nums;
    }

}
