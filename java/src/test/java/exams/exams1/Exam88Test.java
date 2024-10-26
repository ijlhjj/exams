package exams.exams1;

import exams.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Exam88Test {

    Exam88 exam = new Exam88();

    @Test
    void test1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        String str = exam.serialize(root);
        assertEquals("2,1,3,", str);

        TreeNode tree = exam.deserialize(str);
        assertEquals(root, tree);
    }

    @Test
    void test2() {
        String str = exam.serialize(null);
        assertEquals("", str);

        TreeNode tree = exam.deserialize(str);
        assertNull(tree);
    }

}
