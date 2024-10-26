package exams.exams2;

import exams.TreeNode;

import java.util.*;

/**
 * 166-反转二叉树的奇数层
 *
 * @author ijlhjj
 * @version 1.0 2023-12-15
 */
public class Exam166 {

    public TreeNode reverseOddLevels(TreeNode root) {
        List<TreeNode> nodeList = new ArrayList<>(); //把所有节点存到列表中

        //广度优先遍历
        Queue<TreeNode> treeNodes = new LinkedList<>(); //待遍历节点
        treeNodes.add(root);

        Set<TreeNode> explored = new HashSet<>(); //已访问节点

        while (!treeNodes.isEmpty()) {
            TreeNode node = treeNodes.poll();
            nodeList.add(node);
            explored.add(node);

            //左子节点
            if (node.left != null && !explored.contains(node.left))
                treeNodes.offer(node.left);

            //右子节点
            if (node.right != null && !explored.contains(node.right))
                treeNodes.offer(node.right);
        }

        //从第 1 层开始处理，步进 2 ，只处理奇数层
        int count = 2; //当前层节点数，第 1 层 2 个节点
        int leftIndex = 1; //当前层在列表的起始下标，第 1 层起始下标 1

        //起始下标超出列表即完成遍历
        while (leftIndex < nodeList.size()) {
            //反转当前层节点值
            for (int start = leftIndex, end = leftIndex + count - 1; start < end; start++, end--) {
                int temp = nodeList.get(start).val;
                nodeList.get(start).val = nodeList.get(end).val;
                nodeList.get(end).val = temp;
            }

            leftIndex += count * 3; //当前层为 count ，下层为 count * 2 ，下标总计步进 count * 3
            count *= 4; //每层节点数翻倍，隔层翻 4 倍
        }

        return root; //返回根节点
    }

}
