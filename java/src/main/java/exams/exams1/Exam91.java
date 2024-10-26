package exams.exams1;

import exams.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 91-具有所有最深节点的最小子树
 * TreeNode没有重新 hashCode ，在本题中使用 内存地址 即可
 *
 * @author ijlhjj
 * @version 1.0 2023-09-06
 */
public class Exam91 {

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        Map<Integer, TreeNode> parentLink = new HashMap<>(); //存放节点到父节点的引用，空间复杂度 O(N)

        //输入保证根节点不为 null ，当前层最终存放 深度最大 的所有叶节点
        Set<TreeNode> currLevel = new HashSet<>();
        currLevel.add(root);

        // 遍历完当前层存放 最深层 节点
        while (true) {
            Set<TreeNode> nextLevel = new HashSet<>(); //临时存放下一层节点

            //遍历当前层节点
            for (TreeNode node : currLevel) {
                if (node.left != null) { //左子节点不为 null
                    nextLevel.add(node.left);
                    parentLink.put(node.left.val, node);
                }

                if (node.right != null) { //右子节点不为 null
                    nextLevel.add(node.right);
                    parentLink.put(node.right.val, node);
                }
            }

            //下一层没有节点，说明已遍历到最深层，退出循环
            if (nextLevel.size() < 1) break;

            currLevel = nextLevel; //下一层有节点时使当前层指向下一层
        }

        //从最深层递推至父一层，直到只有一个节点时即为 最近公共祖先
        while (currLevel.size() > 1) {
            Set<TreeNode> preLevel = new HashSet<>(); //临时存放父层节点，Set会对左、右子节点的父进行去重
            for (TreeNode node : currLevel)
                preLevel.add(parentLink.get(node.val));
            currLevel = preLevel;
        }

        return currLevel.iterator().next(); //Set只有1个元素
    }

}
