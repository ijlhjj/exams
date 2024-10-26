package exams.exams1;

import exams.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 97-打家劫舍 III
 *
 * @author ijlhjj
 * @version 1.0 2023-09-18
 */
public class Exam97_3 {

    private Map<TreeNode, Integer> maxRobMap; //使用缓存减少递归重复计算

    public int rob(TreeNode root) {
        maxRobMap = new HashMap<>();
        return maxRob(root);
    }

    /**
     * 递归求不连续二叉树的最大和
     */
    public int maxRob(TreeNode node) {
        // null 返回 0
        if (node == null) return 0;

        //已缓存不再重复计算，直接返回
        if (maxRobMap.get(node) != null) {
            return maxRobMap.get(node);
        }

        // 包含当前节点的最大和
        int val1 = node.val;
        if (node.left != null) { //递归左子树最大和
            val1 = val1 + maxRob(node.left.left) + maxRob(node.left.right);
        }

        if (node.right != null) { //递归右子树最大和
            val1 = val1 + maxRob(node.right.left) + maxRob(node.right.right);
        }

        // 不包含当前节点的最大和
        int val2 = maxRob(node.left) + maxRob(node.right);

        int max = Math.max(val1, val2);//最终的最大和取两者中较大者
        maxRobMap.put(node, max);//加入缓存

        return max;
    }

}
