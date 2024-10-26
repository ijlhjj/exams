package exams.exams3;

import exams.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 212-二叉树中的第 K 大层和
 *
 * @author ijlhjj
 * @version 1.0 2024-02-23
 */
public class Exam212 {

    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> levelSum = new ArrayList<>(); //层遍历结果和

        List<TreeNode> lastLevel = List.of(root); //最后一层节点
        //最后一层不为空时循环处理
        while (!lastLevel.isEmpty()) {
            //把最后一层节点值加入结果列表
            long sum = 0;
            for (var node : lastLevel)
                sum += node.val;
            levelSum.add(sum);

            //处理最后一层的下层节点
            List<TreeNode> nextLevel = new ArrayList<>();
            for (var node : lastLevel) {
                //把最后一层不为null的子节点加入列表
                if (node.left != null)
                    nextLevel.add(node.left);
                if (node.right != null)
                    nextLevel.add(node.right);
            }

            lastLevel = nextLevel; //更新最后一层引用
        }

        //树不少于 k 层
        if (levelSum.size() >= k) {
            Collections.sort(levelSum); //排序
            Collections.reverse(levelSum); //倒序
            return levelSum.get(k - 1); //返回索引需减 1
        }

        return -1;
    }

}
