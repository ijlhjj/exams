package exams.exams3;

import exams.TreeNode;

import java.util.Arrays;

/**
 * 209-从前序与中序遍历序列构造二叉树
 *
 * @author ijlhjj
 * @version 1.0 2024-02-20
 */
public class Exam209 {

    /**
     * 根据前序与中序遍历序列构造二叉树。递归实现
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //基准条件：空数组返回空
        if (preorder.length == 0)
            return null;

        //前序遍历第一个元素为根节点
        TreeNode root = new TreeNode(preorder[0]);

        int index = search(inorder, preorder[0]); //在中序遍历查找根节点

        //创建左子树
        int[] preLeftNums = Arrays.copyOfRange(preorder, 1, index + 1); //左子树前序遍历
        int[] inLeftNums = Arrays.copyOfRange(inorder, 0, index); //左子树中序遍历
        if (preLeftNums.length > 0 && inLeftNums.length > 0) //存在左子树元素，递归创建左子树
            root.left = buildTree(preLeftNums, inLeftNums);

        //创建右子树
        int[] preRightNums = Arrays.copyOfRange(preorder, index + 1, preorder.length); //右子树前序遍历
        int[] inRightNums = Arrays.copyOfRange(inorder, index + 1, inorder.length); //右子树中序遍历
        if (preRightNums.length > 0 && inRightNums.length > 0) //存在右子树元素，递归创建右子树
            root.right = buildTree(preRightNums, inRightNums);

        return root; //返回根节点
    }

    /**
     * 从数组中查找指定元素下标
     */
    private int search(int[] nums, int n) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == n)
                return i;
        }
        return -1;
    }

}
