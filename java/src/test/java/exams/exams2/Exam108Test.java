package exams.exams2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Exam108Test {

    @Test
    void test1() {
        Exam108 exam = new Exam108();
        int[] parent = new int[]{-1, 0, 0, 1, 1, 2, 2};
        Exam108.LockingTree lockingTree = exam.new LockingTree(parent);

        assertTrue(lockingTree.lock(2, 2));
        assertFalse(lockingTree.unlock(2, 3));
        assertTrue(lockingTree.unlock(2, 2));
        assertTrue(lockingTree.lock(4, 5));
        assertTrue(lockingTree.upgrade(0, 1));
        assertFalse(lockingTree.lock(0, 1));
    }

}
