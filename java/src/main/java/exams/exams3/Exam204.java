package exams.exams3;

import java.util.ArrayList;
import java.util.List;

/**
 * 204-N 叉树的层序遍历
 *
 * @author ijlhjj
 * @version 1.0 2024-02-17
 */
public class Exam204 {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> levels = new ArrayList<>(); //层遍历结果

        //根节点不为空才处理
        if (root != null) {
            List<Node> lastLevel = List.of(root); //最后一层节点
            //最后一层不为空时循环处理
            while (!lastLevel.isEmpty()) {
                //把最后一层节点值加入结果列表
                List<Integer> values = new ArrayList<>();
                for (var node : lastLevel)
                    values.add(node.val);
                levels.add(values);

                //处理最后一层的下层节点
                List<Node> nextLevel = new ArrayList<>();
                for (var node : lastLevel) {
                    //把最后一层不为null的子节点加入列表
                    if (node.children != null)
                        nextLevel.addAll(node.children);
                }

                lastLevel = nextLevel; //更新最后一层引用
            }
        }

        return levels;
    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }

}
