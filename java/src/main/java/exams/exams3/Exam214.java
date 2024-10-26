package exams.exams3;

import exams.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 214-二叉搜索树的最近公共祖先
 *
 * @author ijlhjj
 * @version 1.0 2024-02-25
 */
public class Exam214 {

    private Map<Integer, List<Integer>> nodeParents; //存放节点到根节点路径
    private Map<Integer, TreeNode> nodes; //存放节点

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //初始化并加入根节点
        nodes = new HashMap<>();
        nodes.put(root.val, root);

        //初始化并加入根节点
        nodeParents = new HashMap<>();
        nodeParents.put(root.val, List.of(root.val));

        preorder(root); //前序遍历处理

        //获取两个节点到根节点的路径
        List<Integer> pPath = nodeParents.get(p.val);
        List<Integer> qPath = nodeParents.get(q.val);

        //获取公共路径部分
        int val = root.val;
        for (int i = 0; i < pPath.size() && i < qPath.size(); i++) {
            if (pPath.get(i).equals(qPath.get(i)))
                val = pPath.get(i);
            else
                break;
        }

        return nodes.get(val); //返回最近公共祖先
    }

    private void preorder(TreeNode node) {
        //基准条件
        if (node == null)
            return;

        List<Integer> values = nodeParents.get(node.val);

        //遍历左子树
        if (node.left != null) {
            TreeNode left = node.left;
            List<Integer> leftValues = new ArrayList<>(values);
            leftValues.add(left.val);
            nodeParents.put(left.val, leftValues);

            nodes.put(left.val, left);

            preorder(node.left);
        }

        //遍历右子树
        if (node.right != null) {
            TreeNode right = node.right;
            List<Integer> rightValues = new ArrayList<>(values);
            rightValues.add(right.val);
            nodeParents.put(right.val, rightValues);

            nodes.put(right.val, right);

            preorder(node.right);
        }
    }

    /**
     * 在二叉排序树中，value1和value2的最低公共祖先的值介于value1和value2之间。
     * 由此可得出解决此题的算法：从二叉排序树的根节点出发，当访问的节点大于给定的两个节点时，沿左子树前进；
     * 当访问的节点小于给定的两个节点时，沿右子树前进；
     * 第1次访问到的介于两个节点值之间的那个节点即是它们的最低公共祖先节点。
     */
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        //交换使 p 的值小于 q 的值
        if (p.val > q.val) {
            TreeNode t = p;
            p = q;
            q = t;
        }

        //逐层推进到 最近公共祖先
        TreeNode node = root;
        while (true) {
            //相等说明一个节点是另一个节点的祖先节点；否则当前节点是 最近公共祖先
            if (p.val <= node.val && node.val <= q.val)
                return node;

            //不符合区间的只能是大于2者或者小于2者。小于时往右子节点推进，大于时往左子节点推进。
            if (node.val < p.val)
                node = node.right;
            else
                node = node.left;
        }
    }

}
