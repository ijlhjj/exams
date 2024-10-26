package exams.exams3;

import java.util.ArrayList;
import java.util.List;

/**
 * 205-N 叉树的前序遍历
 *
 * @author ijlhjj
 * @version 1.0 2024-02-18
 */
public class Exam205 {

    private void preorder(List<Integer> nums, Node node) {
        //基准条件
        if (node == null)
            return;

        nums.add(node.val); //当前节点值

        if (node.children != null) {
            for (Node n : node.children)
                preorder(nums, n);
        }
    }

    public List<Integer> preorder(Node root) {
        List<Integer> nums = new ArrayList<>();
        preorder(nums, root); //递归求解
        return nums;
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
