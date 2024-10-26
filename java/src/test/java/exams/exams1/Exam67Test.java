package exams.exams1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam67Test {

    Exam67 exam = new Exam67();

    @Test
    void fourSum1() {
        List<List<Integer>> quadruples = new ArrayList<>();
        quadruples.add(List.of(-2, -1, 1, 2));
        quadruples.add(List.of(-2, 0, 0, 2));
        quadruples.add(List.of(-1, 0, 0, 1));

        List<List<Integer>> result = exam.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        assertListEquals(quadruples, result);
    }

    @Test
    void fourSum2() {
        List<List<Integer>> quadruples = new ArrayList<>();
        quadruples.add(List.of(2, 2, 2, 2));

        List<List<Integer>> result = exam.fourSum(new int[]{2, 2, 2, 2, 2}, 8);
        assertListEquals(quadruples, result);
    }

    void assertListEquals(List<List<Integer>> expected, List<List<Integer>> actual) {
        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            List<Integer> e = expected.get(i);
            List<Integer> a = actual.get(i);
            for (int j = 0; j < e.size(); j++)
                assertEquals(e.get(j), a.get(j));
        }
    }

}
