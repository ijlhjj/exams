package exams.exams3;

import java.util.ArrayList;
import java.util.List;

/**
 * 208-N 叉树的后序遍历
 *
 * @author ijlhjj
 * @version 1.0 2024-02-19
 */
public class Exam208 {

    private void postorder(List<Integer> nums, Node node) {
        //基准条件
        if (node == null)
            return;

        if (node.children != null) {
            for (Node n : node.children)
                postorder(nums, n);
        }

        nums.add(node.val); //当前节点值
    }

    public List<Integer> postorder(Node root) {
        List<Integer> nums = new ArrayList<>();
        postorder(nums, root); //递归求解
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
