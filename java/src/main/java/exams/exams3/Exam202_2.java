package exams.exams3;

import exams.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 202-二叉树的层序遍历 II
 *
 * @author ijlhjj
 * @version 1.0 2024-02-15
 */
public class Exam202_2 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>(); //层遍历结果

        //根节点不为空才处理
        if (root != null) {
            List<TreeNode> lastLevel = List.of(root); //最后一层节点
            //最后一层不为空时循环处理
            while (!lastLevel.isEmpty()) {
                //把最后一层节点值加入结果列表
                List<Integer> values = new ArrayList<>();
                for (var node : lastLevel)
                    values.add(node.val);
                levels.add(values);

                //处理最后一层的下层节点
                List<TreeNode> nextLevel = new ArrayList<>();
                for (var node : lastLevel) {
                    //把最后一层不为null的子节点加入列表
                    if (node.left != null) nextLevel.add(node.left);
                    if (node.right != null) nextLevel.add(node.right);
                }

                lastLevel = nextLevel; //更新最后一层引用
            }
        }

        Collections.reverse(levels); //反转列表顺序

        return levels;
    }

}
