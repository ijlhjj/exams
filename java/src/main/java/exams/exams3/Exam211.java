package exams.exams3;

import exams.TreeNode;

import java.util.Arrays;

/**
 * 211-根据前序和后序遍历构造二叉树
 *
 * @author ijlhjj
 * @version 1.0 2024-02-22
 */
public class Exam211 {

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        //基准条件：空数组返回空
        if (preorder.length == 0)
            return null;

        //前序遍历第一个元素为根节点
        TreeNode root = new TreeNode(preorder[0]);

        if (preorder.length > 1) {
            int index = search(postorder, preorder[1]); //在后序遍历查找左子节点

            //创建左子树
            int[] postLeftNums = Arrays.copyOfRange(postorder, 0, index + 1); //左子树后序遍历
            int[] preLeftNums = Arrays.copyOfRange(preorder, 1, index + 2); //左子树前序遍历
            if (postLeftNums.length > 0 && preLeftNums.length > 0) //存在左子树元素，递归创建左子树
                root.left = constructFromPrePost(preLeftNums, postLeftNums);

            //创建右子树
            int[] postRightNums = Arrays.copyOfRange(postorder, index + 1, postorder.length - 1); //右子树后序遍历
            int[] preRightNums = Arrays.copyOfRange(preorder, index + 2, preorder.length); //右子树前序遍历
            if (postRightNums.length > 0 && preRightNums.length > 0) //存在右子树元素，递归创建右子树
                root.right = constructFromPrePost(preRightNums, postRightNums);
        }

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
