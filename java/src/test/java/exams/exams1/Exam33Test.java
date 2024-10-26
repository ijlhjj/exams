package exams.exams1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Exam33Test {

    Exam33 exam = new Exam33();

    @Test
    void splitWordsBySeparator1() {
        String[] expected = {"one", "two", "three", "four", "five", "six"};
        String[] result = exam.splitWordsBySeparator(List.of("one.two.three", "four.five", "six"), '.').toArray(new String[0]);
        assertArrayEquals(expected, result);
    }

    @Test
    void splitWordsBySeparator2() {
        String[] expected = {"easy", "problem"};
        String[] result = exam.splitWordsBySeparator(List.of("$easy$", "$problem$"), '$').toArray(new String[0]);
        assertArrayEquals(expected, result);
    }

    @Test
    void splitWordsBySeparator3() {
        String[] expected = {};
        String[] result = exam.splitWordsBySeparator(List.of("|||"), '|').toArray(new String[0]);
        assertArrayEquals(expected, result);
    }

}
