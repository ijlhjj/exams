package exams.exams2;

import java.util.ArrayList;
import java.util.List;

/**
 * 130-填充每个节点的下一个右侧节点指针 II
 * 单元测试比较麻烦，不写了
 *
 * @author ijlhjj
 * @version 1.0 2023-11-03
 */
public class Exam130 {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        List<List<Node>> levelNodes = new ArrayList<>(); //存放每层的节点

        List<Node> nodeList = new ArrayList<>();//存放一层的节点
        if (root != null) nodeList.add(root);

        //当前层有节点时继续遍历下一层节点，广度优先遍历
        while (nodeList.size() > 0) {
            levelNodes.add(nodeList);
            nodeList = loopLevel(nodeList);
        }

        //按题目要求对每层节点的 next 指针进行赋值
        for (List<Node> levelNode : levelNodes)
            for (int i = 0; i < levelNode.size() - 1; i++)
                levelNode.get(i).next = levelNode.get(i + 1);

        return root; //返回根节点
    }

    /**
     * 遍历当前层的下层节点，不为NULL的加入结果列表
     */
    private List<Node> loopLevel(List<Node> nodeList) {
        List<Node> levelNode = new ArrayList<>();
        for (Node node : nodeList) {
            if (node.left != null) levelNode.add(node.left);
            if (node.right != null) levelNode.add(node.right);
        }
        return levelNode;
    }

}
