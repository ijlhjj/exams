package exams.exams2;

import java.util.ArrayList;
import java.util.List;

/**
 * 108-树上的操作
 *
 * @author ijlhjj
 * @version 1.0 2023-09-23
 */
public class Exam108 {

    class TreeNode {
        public TreeNode parent;
        public Integer lockUser;
        public List<TreeNode> childrenList = new ArrayList<>();
    }

    class LockingTree {

        TreeNode[] tree; //存储树节点

        public LockingTree(int[] parent) {
            //创建树节点
            tree = new TreeNode[parent.length];
            for (int i = 0; i < tree.length; i++)
                tree[i] = new TreeNode();

            //根节点不处理。树的根节点为 0 号节点，所以 parent[0] = -1
            for (int i = 1; i < parent.length; i++) {
                TreeNode node = tree[i];
                TreeNode p = tree[parent[i]];
                node.parent = p; //父指针
                p.childrenList.add(node); //子链接
            }
        }

        public boolean lock(int num, int user) {
            TreeNode node = tree[num];
            if (node.lockUser != null) //只有当节点处于未上锁的状态下，才能进行上锁操作
                return false;

            node.lockUser = user; //锁定
            return true;
        }

        public boolean unlock(int num, int user) {
            TreeNode node = tree[num];
            //只有当节点处于上锁的状态下，才能进行解锁操作
            //只有当前用户锁定节点才能执行解锁操作
            if (node.lockUser == null || node.lockUser != user) return false;

            node.lockUser = null; //解锁
            return true;
        }

        /**
         * 指定用户给指定节点 上锁 ，并且将该节点的所有子孙节点 解锁
         */
        public boolean upgrade(int num, int user) {
            TreeNode node = tree[num];

            //当前节点和祖先节点都为未上锁。
            if (!checkParent(node)) return false;

            //检查至少有一个上锁状态的子孙节点（可以是 任意 用户上锁的）
            if (!checkChildren(node)) return false;

            node.lockUser = user; //锁定当前节点
            unlockChildren(node); //解锁所有子孙节点
            return true;
        }

        /**
         * 检查当前节点和所有祖先节点都是未上锁状态，成功返回 true；如果有任何节点上锁，返回 false
         */
        private boolean checkParent(TreeNode node) {
            if (node == null) return true;

            if (node.lockUser != null) return false;

            return checkParent(node.parent);
        }

        /**
         * 指定节点至少有一个上锁状态的子孙节点（可以是 任意 用户上锁的），成功返回 true，所有子孙节点都未上锁返回 false
         */
        private boolean checkChildren(TreeNode node) {
            if (node == null) return false;

            for (TreeNode n : node.childrenList) {
                if (n.lockUser != null) return true;
                if (checkChildren(n)) return true;
            }

            return false;
        }

        /**
         * 解锁当前节点的所有子孙节点
         */
        private void unlockChildren(TreeNode node) {
            if (node == null) return;

            for (TreeNode n : node.childrenList) {
                n.lockUser = null;
                unlockChildren(n);
            }
        }
    }

}
