package exams.exams2;

import exams.TreeNode;

import java.util.*;

/**
 * 149-二叉树中的伪回文路径
 * 大量输入场景下本地运行通过，网站运行超时
 *
 * @author ijlhjj
 * @version 1.0 2023-11-25
 */
public class Exam149 {

    public int pseudoPalindromicPaths(TreeNode root) {
        List<List<TreeNode>> leafPathsList = new ArrayList<>(); //存放所有根节点到叶节点的路径

        //使用队列存放还没有遍历到叶节点的路径
        Queue<List<TreeNode>> leafPathsDeque = new LinkedList<>();
        leafPathsDeque.add(List.of(root));

        //队列不空时继续遍历，队列空时所有到 叶节点的路径 加入 leafPathsList
        while (!leafPathsDeque.isEmpty()) {
            //弹出队头的列表，查看最后一个节点是否是叶节点
            List<TreeNode> pathsList = leafPathsDeque.remove();
            TreeNode node = pathsList.get(pathsList.size() - 1);

            //如果是叶节点，加入叶节点路径列表
            if (node.left == null && node.right == null) {
                leafPathsList.add(pathsList);
            }

            //如果不是叶节点，左子节点不为空，路径列表加入左子节点，推入队列
            if (node.left != null) {
                List<TreeNode> leftPathList = new ArrayList<>(pathsList);
                leftPathList.add(node.left);
                leafPathsDeque.add(leftPathList);
            }

            //右子节点不为空，路径列表加入右子节点，推入队列
            if (node.right != null) {
                List<TreeNode> rightPathList = new ArrayList<>(pathsList);
                rightPathList.add(node.right);
                leafPathsDeque.add(rightPathList);
            }
        }

        int count = 0; //伪回文 数量

        //遍历所有根节点到叶节点的路径
        for (List<TreeNode> pathsList : leafPathsList) {
            //分组统计值数量
            Map<Integer, Integer> counters = new HashMap<>();
            for (TreeNode node : pathsList)
                counters.merge(node.val, 1, Integer::sum);

            //符合 伪回文 的路径中 奇数数量的元素必须为 0 或 1
            int c = 0;
            for (int n : counters.values()) {
                if (n % 2 == 1)
                    c++;

                if (c > 1) break; //超过 1 时不可能是 伪回文 路径
            }

            //伪回文 路径数量
            if (c < 2)
                count++;
        }

        return count;
    }

}
