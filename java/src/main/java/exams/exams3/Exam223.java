package exams.exams3;

import exams.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class Exam223 {

    static class FindElements {

        Set<Integer> values = new HashSet<>();

        public FindElements(TreeNode root) {
            root.val = 0;
            preorder(root);
        }

        public boolean find(int target) {
            return values.contains(target);
        }

        private void preorder(TreeNode node) {
            values.add(node.val);

            //遍历左子树
            if (node.left != null) {
                node.left.val = 2 * node.val + 1;
                preorder(node.left);
            }

            //遍历右子树
            if (node.right != null) {
                node.right.val = 2 * node.val + 2;
                preorder(node.right);
            }
        }

    }

}
