package exams.exams3;

import exams.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Exam213Test {

    Exam213 exam = new Exam213();

    @Test
    void closestNodes1() {
        TreeNode root = TreeNode.createTreeNode(new int[]{6, 2, 13, 1, 4, 9, 15, -1, -1, -1, -1, -1, -1, 14});

        List<List<Integer>> actual = exam.closestNodes(root, List.of(2, 5, 16));

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(2, 2));
        expected.add(List.of(4, 6));
        expected.add(List.of(15, -1));

        assertTrue(Objects.deepEquals(expected, actual));
    }

    @Test
    void closestNodes2() {
        TreeNode root = TreeNode.createTreeNode(new int[]{4, -1, 9});

        List<List<Integer>> actual = exam.closestNodes(root, List.of(3));

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(-1, 4));

        assertTrue(Objects.deepEquals(expected, actual));
    }

}
