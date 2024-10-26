package exams.exams3;

import exams.TreeNode;

import java.util.Arrays;

/**
 * 210-从中序与后序遍历序列构造二叉树
 *
 * @author ijlhjj
 * @version 1.0 2024-02-21
 */
public class Exam210 {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = postorder.length;

        //基准条件：空数组返回空
        if (len == 0)
            return null;

        //后序遍历最后一个元素为根节点
        TreeNode root = new TreeNode(postorder[len - 1]);

        int index = search(inorder, postorder[len - 1]); //在中序遍历查找根节点

        //创建左子树
        int[] postLeftNums = Arrays.copyOfRange(postorder, 0, index); //左子树后序遍历
        int[] inLeftNums = Arrays.copyOfRange(inorder, 0, index); //左子树中序遍历
        if (postLeftNums.length > 0 && inLeftNums.length > 0) //存在左子树元素，递归创建左子树
            root.left = buildTree(inLeftNums, postLeftNums);

        //创建右子树
        int[] postRightNums = Arrays.copyOfRange(postorder, index, len - 1); //右子树后序遍历
        int[] inRightNums = Arrays.copyOfRange(inorder, index + 1, inorder.length); //右子树中序遍历
        if (postRightNums.length > 0 && inRightNums.length > 0) //存在右子树元素，递归创建右子树
            root.right = buildTree(inRightNums, postRightNums);

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
