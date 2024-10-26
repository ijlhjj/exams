package exams;

import java.util.Objects;

/**
 * Definition for a binary tree node.
 */
public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) // 检测是否引用同一个对象，这是经常采用的优化形式
            return true;
        if (obj == null) // null值返回false，必须的检测
            return false;
        // 比较是否是同一个类
        if (getClass() != obj.getClass()) return false;

        TreeNode other = (TreeNode) obj;

        //比较 val、left 和 right 是否相等
        return val == other.val && Objects.equals(left, other.left) && Objects.equals(right, other.right);
    }

    /**
     * 根据数组元素值创建二叉树
     *
     * @param nodes 创建二叉树的元素值，左右指针的 NULL 使用 -1 表示
     * @return 空数组返回NULL，否则返回二叉树的根 root
     */
    public static TreeNode createTreeNode(int[] nodes) {
        if (nodes == null || nodes.length < 1) return null;

        // 遍历数组创建对应节点，-1 不处理直接是默认的 null
        TreeNode[] trees = new TreeNode[nodes.length];
        for (int i = 0; i < nodes.length; i++)
            if (nodes[i] != -1) trees[i] = new TreeNode(nodes[i]);

        //遍历创建的节点数组，赋值左右子节点的引用
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] == null)
                continue;

            // 如果存在子节点，左子节点下标为 2 * i + 1 ，右子节点下标为 2 * i + 2
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            //超出节点数组时表示没有剩余节点需要处理了
            if (left < trees.length) trees[i].left = trees[left];
            else break;

            if (right < trees.length) trees[i].right = trees[right];
            else break;
        }

        return trees[0]; //返回根节点
    }

}
