package exams.exams2;

import exams.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 199-二叉树的中序遍历
 *
 * @author ijlhjj
 * @version 1.0 2024-02-10
 */
public class Exam199 {

    private void inorder(List<Integer> nums, TreeNode node) {
        //基准条件
        if (node == null) return;

        inorder(nums, node.left); //遍历左子树
        nums.add(node.val); //当前节点值
        inorder(nums, node.right); //遍历右子树
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        inorder(nums, root); //递归求解
        return nums;
    }

}
