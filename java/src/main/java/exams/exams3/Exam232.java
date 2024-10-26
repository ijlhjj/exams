package exams.exams3;

import exams.TreeNode;

import java.util.*;

/**
 * 232-节点与其祖先之间的最大差值
 *
 * @author ijlhjj
 * @version 1.0 2024-04-05
 */
public class Exam232 {

    Map<TreeNode, List<Integer>> nodes;

    private void preorder(TreeNode node) {
        //基准条件
        if (node == null)
            return;

        List<Integer> values = nodes.computeIfAbsent(node, k -> new ArrayList<>());
        values.add(node.val); //当前节点值

        //遍历左子树
        if (node.left != null) {
            preorder(node.left);
            List<Integer> leftValues = nodes.get(node.left);
            values.addAll(leftValues);
        }

        //遍历右子树
        if (node.right != null) {
            preorder(node.right);
            List<Integer> rightValues = nodes.get(node.right);
            values.addAll(rightValues);
        }
    }

    public int maxAncestorDiff(TreeNode root) {
        nodes = new HashMap<>(); //初始化结果映射

        preorder(root); //前序遍历处理二叉树

        int max = 0; //最大差初始为 0
        for (TreeNode node : nodes.keySet()) {
            //对所有子节点排序
            List<Integer> values = nodes.get(node);
            Collections.sort(values);

            //当前节点与最大子节点的差值
            int diff1 = values.get(values.size() - 1) - node.val;
            if (diff1 > max)
                max = diff1;

            //当前节点与最小子节点的差值
            int diff2 = node.val - values.get(0);
            if (diff2 > max)
                max = diff2;
        }

        return max;
    }

}
