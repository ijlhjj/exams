package exams.exams3;

import exams.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 212-二叉树中的第 K 大层和
 *
 * @author ijlhjj
 * @version 1.0 2024-02-24
 */
public class Exam213 {

    private void postorder(List<Integer> nums, TreeNode node) {
        //基准条件
        if (node == null)
            return;

        postorder(nums, node.left); //遍历左子树
        postorder(nums, node.right); //遍历右子树
        nums.add(node.val); //当前节点值
    }

    private List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        postorder(nums, root); //递归求解
        return nums;
    }

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> nums = postorderTraversal(root); //前序遍历获取所有节点值
        int[] vals = nums.stream().mapToInt(Integer::intValue).toArray(); //转为数组
        Arrays.sort(vals); //排序

        List<List<Integer>> limits = new ArrayList<>(); //定义结果列表

        //循环处理输入元素
        for (int n : queries) {
            int index = Arrays.binarySearch(vals, n);
            if (index >= 0) { //找到相等元素值，上下限都是元素值
                limits.add(List.of(n, n));
            } else {
                index = -index - 1;
                if (index == 0) //左边界使用 -1
                    limits.add(List.of(-1, vals[0]));
                else if (index == vals.length) //右边界使用 -1
                    limits.add(List.of(vals[vals.length - 1], -1));
                else
                    limits.add(List.of(vals[index - 1], vals[index]));
            }
        }

        return limits;
    }

}
