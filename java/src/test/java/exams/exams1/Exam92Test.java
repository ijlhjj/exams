package exams.exams1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam92Test {

    Exam92 exam = new Exam92();

    @Test
    void repairCars1() {
        int[] ranks = {4, 2, 3, 1};
        long t = exam.repairCars(ranks, 10);
        assertEquals(16l, t);
    }

    @Test
    void repairCars2() {
        int[] ranks = {5, 1, 8};
        long t = exam.repairCars(ranks, 6);
        assertEquals(16l, t);
    }

    /**
     * 第一次提交错误
     */
    @Test
    void repairCars3() {
        int[] ranks = {31, 31, 5, 19, 19, 10, 31, 18, 19, 3, 16, 20, 4, 16, 2, 25, 10, 16, 23, 18, 21, 23, 28, 6, 7, 29, 11, 11, 19, 20, 24, 19, 26, 12, 29, 29, 1, 14, 17, 26, 24, 7, 11, 28, 22, 14, 31, 12, 3, 19, 16, 26, 11};
        long t = exam.repairCars(ranks, 736185);
        assertEquals(2358388332l, t);
    }

    /**
     * 第二次提交超时
     */
    @Test
    void repairCars4() {
        int[] ranks = {30, 25, 16, 26, 17, 41, 33, 40, 15, 11, 6, 39, 33, 25, 43, 25, 21, 12, 35, 28, 42, 4, 16, 32, 14, 23, 19, 20, 2, 1, 13, 32, 30, 27, 10, 9, 18, 14, 17, 25, 36, 33, 1, 10, 7, 41, 42, 14, 33, 28, 21, 24, 33, 42, 10, 39, 6, 31, 23, 3, 25, 8, 13, 6, 39, 13, 18, 18, 11, 25, 20, 5, 41, 40, 41, 30, 41, 25, 27, 38, 21, 22, 10, 6, 11, 31, 30, 2, 20, 13, 27, 32, 42, 1, 34, 8, 37, 21, 25, 37, 35, 31, 30, 32, 12, 2, 7, 2, 21, 33, 4, 30, 14, 35, 14, 42, 36, 27, 20, 21, 18, 7, 4, 31, 34, 15, 12, 24, 20, 28, 16, 3, 30, 4, 32, 42, 33, 44, 13, 9, 24, 17, 21, 5, 27, 9, 2, 41, 12, 21, 44, 16, 13, 36, 19, 18, 27, 36, 39, 24, 30, 13, 28, 13, 7, 38, 8, 34, 23, 35, 31, 5, 44, 19, 27, 12, 16, 16, 35, 34, 8, 19, 17, 22, 4, 8, 36, 19, 9, 30, 25, 31, 29, 22, 36, 36, 12, 11, 39, 26, 23, 14, 11, 12, 31, 28, 24, 26, 34, 13, 39, 16, 35, 16, 11, 5, 8, 15, 39, 29, 9, 14, 20, 41, 21, 41, 15, 40, 8, 26, 44, 15, 1, 37, 35, 16, 17, 25, 35, 21, 30, 42, 2, 18, 34, 28, 32, 44, 18, 40, 10, 29, 25, 42, 24, 7, 40, 5, 32, 39, 26, 18, 42, 38, 28, 27, 6, 5, 21, 29, 26, 33, 38, 22, 29, 34, 15, 31, 9, 39, 41, 10, 8, 44, 17, 22, 22, 10, 3, 10, 18, 42, 37, 20, 44, 31, 30, 1, 37, 23, 16, 10, 34, 11, 32, 30, 21, 12, 17, 31, 41, 36, 4, 5, 26, 31, 2, 38, 32, 3, 14, 26, 8, 15, 14, 32, 32, 10, 11, 12, 12, 39, 34, 26, 3, 9, 5, 34, 41, 28, 12, 29, 8, 20, 32, 23, 44, 7, 10, 27, 39, 26, 8, 40, 20, 7, 26, 39, 39, 10, 29, 10, 10, 30, 16, 10, 38, 38, 38, 15, 38, 14, 43, 11, 29, 35, 34, 17, 27, 19, 30, 6, 44, 31, 26, 11, 10, 31, 33, 27, 30, 44, 16, 5, 28, 22, 11, 37, 6, 35, 25, 7, 17, 39, 10, 10, 38, 22, 24, 37, 39, 16, 35, 38, 40, 25, 25, 35, 39, 22, 35, 11, 16, 34, 33, 19, 26, 2, 11, 14, 41, 31, 6, 43, 31, 30, 34, 8, 11, 2, 3, 8, 7, 18, 7, 21, 36, 43, 10, 27, 34, 18, 30, 11, 43, 39, 20, 7, 41, 44, 29, 43, 19, 32, 39, 29, 39, 1, 1, 7, 2, 42, 27, 29, 40, 31, 14, 30, 19, 19, 38, 7, 26, 2, 38, 12, 24, 3, 43, 36, 5, 14, 34, 30, 13, 40, 12, 2, 38, 42, 20, 7, 21, 19, 5, 28, 1, 22, 29, 6, 44, 14, 31, 11, 32, 21, 1, 6, 27, 28, 15, 15, 1, 43, 33, 42, 21, 10, 32, 40, 28, 21, 12, 17, 10, 13, 41, 8, 29, 37, 33, 41, 11, 30, 1, 20, 17, 16, 4, 43, 27, 26, 21, 12, 40, 34, 29, 3, 39, 13, 29, 36, 14, 21, 42, 8, 9, 9, 33, 24, 19, 6, 10, 38, 24, 30, 40, 2, 9, 41, 14, 31, 27, 24, 5, 26, 39, 3, 5, 27, 31, 14, 33, 19, 35, 36, 15, 30, 37, 38, 10, 2, 19, 30, 14, 15, 30, 24, 9, 44, 19, 28, 6, 32, 6, 27, 9, 36, 20, 35, 13, 23, 27, 6, 11, 13, 44, 12, 9, 9, 21, 8, 2, 12, 25, 40, 28, 10, 6, 23, 44, 36, 25, 18, 28, 12, 40, 4, 2, 26, 37, 23, 36, 21, 24, 35, 30, 42, 39, 30, 7, 4, 23, 30, 12, 30, 23, 43, 21, 19, 2, 11, 18, 4, 41, 41, 5, 12, 2, 32, 8, 22, 1, 29, 30, 10, 5, 4, 9, 25, 14, 18, 25, 8, 32, 12, 27, 42, 19, 20, 33, 2, 19, 38, 16, 1, 41, 8, 41, 14, 21, 33, 32, 18, 20, 29, 18, 22, 8, 40, 17, 43, 24, 19, 17, 21, 11, 2, 41, 18, 15, 27, 19, 21, 11, 5, 14, 38, 35, 44, 5, 24, 30, 22, 7, 12, 23, 29, 15, 34, 41, 3, 30, 27, 23, 24, 20, 42, 22, 29, 36, 3, 4, 11, 40, 4, 7, 9, 10, 1, 24, 39, 26, 21, 26, 16, 26, 33, 24, 11, 2, 25, 5, 41, 40, 2, 15, 3, 6, 15, 7, 32, 26, 17, 27, 1, 33, 10, 21, 17, 22, 20, 19, 22, 8, 11, 20, 40, 29, 19, 38, 5, 19, 14, 26, 41, 35, 4, 27, 37, 29, 6, 41, 12, 44, 14, 8, 3, 22, 34, 5, 44, 1, 28, 33, 15, 4, 31, 19, 23, 36, 22, 41, 38, 25, 12, 37, 3, 40, 2, 8, 15, 39, 23, 39, 31, 9, 33, 15, 1, 7, 41, 16, 43, 32, 17, 16, 14, 14, 5, 18, 14, 26, 43, 3, 6, 14, 22, 5, 13, 26, 29, 36, 12, 23, 42, 32, 21, 26, 23, 3, 39, 21, 30, 37, 3, 9, 39, 30, 18, 23, 1, 2, 31, 33, 10, 42, 11, 20, 34, 29, 5, 36, 35, 30, 36, 43, 13, 27, 19, 30, 16, 39, 11, 28, 4, 14, 1, 25, 8, 14, 35, 40, 25, 4, 13, 21, 27, 26, 44, 18, 41, 11, 41, 11, 43, 44, 7, 16, 7, 43, 27, 1, 24, 5, 12, 24, 3, 21, 43, 40, 44, 7, 23, 38, 10, 42, 27, 43, 32, 43, 22, 14, 12, 11, 40, 17, 5, 35, 19, 25, 31, 28, 23, 13, 42, 31, 5, 29, 36, 11, 3, 8, 8, 23, 33, 16, 1, 39, 8, 40, 24, 34, 27, 42, 29, 14, 24, 34, 24, 39, 33, 3, 38, 24, 36, 41, 30, 31, 11, 32, 32, 2, 26, 27, 35, 16, 41, 9, 33, 6, 38, 21, 42, 34, 42, 3, 32, 22, 11, 35, 13, 42, 21, 27, 27, 12, 36, 32, 32, 42, 37, 44, 27, 9, 18, 10, 21, 17, 3, 12, 44, 27, 31, 43, 27, 9, 4, 30, 21, 36, 19, 22, 43, 3, 7, 36, 24, 43, 6, 38, 6, 23, 11, 42, 24, 16, 19, 37, 28, 42, 25, 35, 3, 25, 13, 2, 33, 13, 9, 27, 21, 12, 1, 15, 15, 39, 13, 22, 9, 19, 3, 20, 17, 33, 20, 2, 39, 5, 19, 14, 27, 40, 5, 36, 28, 15, 17, 10, 18, 20, 4, 41, 6, 32, 41, 11, 7, 41, 23, 34, 40, 11, 39, 43, 19, 27, 4, 14, 8, 33, 10, 17, 2, 5, 40, 15, 31, 34, 15, 25, 5, 21, 20, 34, 33, 37, 26, 24, 34, 2, 40, 11, 8, 20, 1, 3, 20, 44, 33, 1, 41, 39, 12, 6, 29, 37, 40, 36, 6, 32, 18, 28, 15, 21, 22, 10, 25, 35, 6, 16, 8, 18, 36, 6, 25, 36, 32, 25, 6, 9, 29, 3, 4, 12, 38, 14, 31, 15, 27, 26, 42, 18, 42, 31, 44, 17, 6, 29, 17, 35, 26, 31, 7, 5, 30, 5, 5, 13, 20, 22, 27, 42, 9, 35, 41, 33, 17, 27, 13, 32, 43, 6, 34, 8, 35, 17, 10, 12, 43, 42, 19, 26, 11, 42, 9, 30, 35, 24, 10, 40, 26, 24, 25, 10, 26, 11, 21, 23, 32, 44, 1, 2, 26, 18, 26, 1, 43, 39, 14, 29, 12, 33, 41, 17, 26, 27, 43, 27, 4, 6, 28, 23, 30, 13, 3, 20, 42, 4, 41, 22, 36, 27, 39, 2, 28, 10, 28, 6, 1, 24, 10, 6, 37, 3, 32, 12, 29, 38, 22, 4, 19, 44, 36, 37, 5, 43, 16, 27, 14, 25, 25, 38, 8, 12, 18, 25, 22, 6, 38, 1, 32, 32, 12, 2, 39, 20, 4, 9, 11, 21, 10, 14, 34, 29, 35, 4, 4, 25, 11, 38, 8, 36, 36, 24, 20, 8, 20, 24, 12, 44, 3, 19, 22, 5, 41, 22, 44, 17, 25, 33, 2, 26, 31, 44, 28, 26, 33, 19, 30, 8, 11, 19, 31, 26, 28, 11, 41, 39, 7, 11, 3, 38, 27, 23, 37, 3, 10, 6, 1, 36, 3, 20, 27, 4, 29, 9, 13, 38, 39, 28, 25, 42, 35, 27, 26, 42, 35, 2, 20, 9, 31, 44, 13, 13, 33, 19, 39, 8, 29, 39, 7, 17, 37, 11, 22, 6, 34, 42, 44, 24, 26, 8, 9, 44, 16, 5, 7, 2, 7, 25, 34, 1, 39, 17, 12, 20, 40, 25, 31, 24, 39, 17, 41, 35, 31, 32, 34, 32, 31, 43, 38, 44, 44, 11, 39, 8, 2, 19, 39, 39, 19, 18, 7, 41, 10, 24, 14, 39, 18, 31, 31, 33, 3, 27, 29, 2, 29, 4, 4, 37, 33, 31, 42, 1, 25, 44, 6, 23, 24, 7, 16, 42, 41, 28, 4, 12, 6, 10, 29, 27, 27, 13, 19, 11, 33, 32, 42, 32, 8, 38, 26, 42, 33, 41, 39, 35, 25, 43, 26, 3, 24, 30, 44, 1, 10, 5, 6, 4, 23, 26, 16, 29, 40, 42, 6, 1, 27, 41, 11, 25, 24, 25, 36, 35, 12, 10, 34, 37, 14, 13, 24, 31, 38, 42, 19, 41, 22, 34, 30, 23, 5, 12, 16, 36, 2, 35, 40, 26, 40, 30, 29, 10, 33, 34, 18, 30, 35, 34, 18, 23, 34, 34, 21, 14, 43, 43, 10, 5, 12, 10, 37, 23, 8, 43, 28, 24, 40, 24, 6, 21, 25, 36, 28, 42, 14, 18, 27, 7, 43, 13, 35, 19, 16, 27, 35, 42, 24, 25, 15, 41, 24, 14, 40, 13, 24, 2, 5, 20, 4, 5, 34, 10, 38, 12, 29, 24, 5, 6, 39, 12, 6, 38, 6, 32, 34, 14, 23, 38, 1, 13, 29, 44, 2, 28, 1, 32, 6, 28, 27, 24, 16, 31, 15, 41, 19, 34, 34, 33, 27, 38, 37, 10, 31, 43, 34, 29, 27, 34, 18, 28, 5, 29, 17, 10, 20, 31, 35, 22, 9, 37, 13, 38, 8, 27, 13, 5, 28, 27, 31, 7, 33, 7, 31, 36, 17, 18, 34, 37, 37, 3, 7, 9, 9, 38, 16, 4, 38, 21, 26, 15, 23, 39, 14, 22, 24, 28, 37, 40, 16, 44, 11, 8, 31, 16, 12, 14, 17, 2, 33, 2, 33, 31, 21, 26, 7, 12, 30, 5, 40, 24, 12, 19, 15, 18, 18, 22, 29, 43, 20, 32, 22, 3, 15, 25, 8, 2, 22, 33, 22, 42, 2, 37, 42, 39, 31, 12, 27, 31, 19, 42, 27, 27, 11, 42, 11, 32, 44, 15, 3, 27, 23, 34, 11, 14, 7, 32, 34, 12, 41, 42, 25, 39, 19, 8, 7, 28, 16, 32, 7, 41, 21, 31, 34, 4, 21, 18, 30, 15, 34, 16, 34, 8, 35, 28, 21, 31, 40, 3, 7, 14, 38, 22, 26, 25, 40, 31, 19, 22};
        long t = exam.repairCars(ranks, 726824);
        assertEquals(2138347l, t);
    }

}
