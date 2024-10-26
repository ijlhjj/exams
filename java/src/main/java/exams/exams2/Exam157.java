package exams.exams2;

import exams.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 157-从二叉搜索树到更大和树
 *
 * @author ijlhjj
 * @version 1.0 2023-12-04
 */
public class Exam157 {

    List<Integer> vals;

    public TreeNode bstToGst(TreeNode root) {
        vals = new ArrayList<>();

        addVals(root); //深度优先遍历，把所有值加入列表

        Collections.sort(vals); //列表排序，减少后续处理

        changeVals(root); //深度优先遍历，把所有值加入列表

        return root;
    }

    private void addVals(TreeNode root) {
        //递归左子树
        if (root.left != null) addVals(root.left);

        //递归右子树
        if (root.right != null) addVals(root.right);

        vals.add(root.val);
    }

    private void changeVals(TreeNode root) {
        //递归左子树
        if (root.left != null) changeVals(root.left);

        //递归右子树
        if (root.right != null) changeVals(root.right);

        //大于或者等于该节点值 的和
        int sum = 0;
        for (int i = vals.size() - 1; i >= 0; i--) {
            if (vals.get(i) >= root.val) sum += vals.get(i);
            else break; //有序列表，到第一个小于当前值则不继续处理
        }
        root.val = sum;
    }

}
