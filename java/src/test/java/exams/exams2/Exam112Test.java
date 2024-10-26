package exams.exams2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class Exam112Test {

    Exam112 exam = new Exam112();

    @Test
    void filterRestaurants1() {
        int[][] restaurants = new int[][]{{1, 4, 1, 40, 10}, {2, 8, 0, 50, 5}, {3, 8, 1, 30, 4}, {4, 10, 0, 10, 3}, {5, 1, 1, 15, 1}};
        List<Integer> ids = List.of(3, 1, 5);
        List<Integer> actual = exam.filterRestaurants(restaurants, 1, 50, 10);
        assertIterableEquals(ids, actual);
    }

    @Test
    void filterRestaurants2() {
        int[][] restaurants = new int[][]{{1, 4, 1, 40, 10}, {2, 8, 0, 50, 5}, {3, 8, 1, 30, 4}, {4, 10, 0, 10, 3}, {5, 1, 1, 15, 1}};
        List<Integer> ids = List.of(4, 3, 2, 1, 5);
        List<Integer> actual = exam.filterRestaurants(restaurants, 0, 50, 10);
        assertIterableEquals(ids, actual);
    }

    @Test
    void filterRestaurants3() {
        int[][] restaurants = new int[][]{{1, 4, 1, 40, 10}, {2, 8, 0, 50, 5}, {3, 8, 1, 30, 4}, {4, 10, 0, 10, 3}, {5, 1, 1, 15, 1}};
        List<Integer> ids = List.of(4, 5);
        List<Integer> actual = exam.filterRestaurants(restaurants, 0, 30, 3);
        assertIterableEquals(ids, actual);
    }

}
