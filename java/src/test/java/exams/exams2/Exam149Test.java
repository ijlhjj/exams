package exams.exams2;

import exams.TestUtil;
import exams.TreeNode;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam149Test {

    Exam149 exam = new Exam149();

    @Test
    void pseudoPalindromicPaths1() {
        TreeNode root = TreeNode.createTreeNode(new int[]{2, 3, 1, 3, 1, -1, 1});
        assertEquals(2, exam.pseudoPalindromicPaths(root));
    }

    @Test
    void pseudoPalindromicPaths2() {
        TreeNode root = TreeNode.createTreeNode(new int[]{2, 1, 1, 1, 3, -1, -1, -1, -1, -1, 1});
        assertEquals(1, exam.pseudoPalindromicPaths(root));
    }

    @Test
    void pseudoPalindromicPaths3() {
        TreeNode root = TreeNode.createTreeNode(new int[]{9});
        assertEquals(1, exam.pseudoPalindromicPaths(root));
    }

    /**
     * 第1次提交超时
     */
    @Test
    void pseudoPalindromicPaths4() throws IOException {
        int[] nums = TestUtil.readIntArray("../exams2_Exam149Test_1.txt");
        TreeNode root = TreeNode.createTreeNode(nums);
        assertEquals(18, exam.pseudoPalindromicPaths(root));
    }

}
