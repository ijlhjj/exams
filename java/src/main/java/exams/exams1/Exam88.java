package exams.exams1;

import exams.TreeNode;

/**
 * 88-序列化和反序列化二叉搜索树
 * <p>
 * 二叉查找树（Binary Search Tree），（又：二叉搜索树，二叉排序树）它或者是一棵空树，或者是具有下列性质的二叉树： 若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值； 若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值； 它的左、右子树也分别为二叉排序树。
 * 题目数据 保证 输入的树是一棵二叉搜索树。这里确定输入不存在相等值的节点，如果存在相同值节点，则相同值放在左子树还是右子树需要特殊考虑。
 *
 * @author ijlhjj
 * @version 1.0 2023-09-4
 */
public class Exam88 {

    /**
     * Encodes a tree to a single string.
     * <p>
     * 使用前序遍历组装字符串，即先 访问当前节点，再访问左子树，最后访问右子树。
     * 深度优先遍历
     *
     * @param root 树的根节点
     * @return 节点间使用 "," 分隔
     */
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();

        //不为 null 才处理，否则直接返回空字符串 ""
        if (root != null) {
            sb.append(root.val + ","); //添加当前节点

            //左子树不为空，则递归序列化左子树
            if (root.left != null) sb.append(serialize(root.left));

            //右子树不为空，则递归序列化右子树
            if (root.right != null) sb.append(serialize(root.right));
        }

        return sb.toString();
    }

    /**
     * Decodes your encoded data to tree.
     *
     * @param data 使用 "," 分隔的树节点字符串
     * @return 树的根节点
     */
    public TreeNode deserialize(String data) {
        //空参数直接返回 null
        if (data == null || "".equals(data)) return null;

        //创建当前节点
        int index = data.indexOf(",");
        if (index < 1) return null;

        String val = data.substring(0, index);
        int currVal = Integer.valueOf(val);
        TreeNode curr = new TreeNode(currVal);

        //分析剩余字符串
        String sub = data.substring(index + 1);
        if (sub.length() > 1) {
            //查找左子树和右子树的字符串分隔位置
            int i = -1;
            while (i < sub.length()) { //分隔位置不可超过子串
                //比对下一个节点值是否大于当前节点值
                int k = sub.indexOf(",", i + 1);
                if (k < 0) break;

                //下一节点值大于当前值则属于右子树，退出循环
                val = sub.substring(i + 1, k);
                int nextVal = Integer.valueOf(val);
                if (nextVal > currVal) break;

                i = k;
            }

            //从 分隔位置 分开左、右子树
            String leftStr = sub.substring(0, i + 1);
            String rightStr = sub.substring(i + 1);

            //左子树字符串不为空，递归解析左子树
            if (leftStr.length() > 0) curr.left = deserialize(leftStr);

            //右子树字符串不为空，递归解析右子树
            if (rightStr.length() > 0) curr.right = deserialize(rightStr);
        }

        return curr; //返回当前节点
    }

}
