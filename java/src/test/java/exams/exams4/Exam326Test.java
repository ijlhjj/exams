package exams.exams4;

import exams.exams4.Exam326.BookMyShow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exam326Test {

    /**
     * 第一次提交答案错误
     */
    @Test
    void test1() {
        BookMyShow exam = new BookMyShow(5, 9);
        assertArrayEquals(new int[0], exam.gather(10, 1));
        assertTrue(exam.scatter(3, 3));
        assertArrayEquals(new int[]{1, 0}, exam.gather(9, 1));
        assertArrayEquals(new int[0], exam.gather(10, 2));
        assertArrayEquals(new int[]{0, 3}, exam.gather(2, 0));
    }

    /**
     * 第二次提交答案错误
     */
    @Test
    void test2() {
        BookMyShow exam = new BookMyShow(19, 40);
        assertTrue(exam.scatter(34, 14));
        assertTrue(exam.scatter(5, 5));

        assertArrayEquals(new int[]{1, 0}, exam.gather(20, 6));
        assertArrayEquals(new int[]{1, 20}, exam.gather(3, 3));
        assertArrayEquals(new int[0], exam.gather(50, 7));
        assertArrayEquals(new int[]{1, 23}, exam.gather(16, 5));
        assertArrayEquals(new int[0], exam.gather(12, 0));

        assertTrue(exam.scatter(23, 14));
        assertFalse(exam.scatter(36, 0));
        assertTrue(exam.scatter(25, 12));
    }

    /**
     * 第三次提交超出内存限制
     */
    @Test
    void test3() {
        BookMyShow exam = new BookMyShow(3, 999999999);
        assertTrue(exam.scatter(1000000000, 2));
        assertArrayEquals(new int[]{2, 0}, exam.gather(999999999, 2));
        assertArrayEquals(new int[0], exam.gather(999999999, 2));
        assertArrayEquals(new int[0], exam.gather(999999999, 2));
    }

    /**
     * 第四次提交答案错误
     */
    @Test
    void test4() {
        BookMyShow exam = new BookMyShow(18, 48);
        assertTrue(exam.scatter(24, 13));
        assertTrue(exam.scatter(12, 5));
        assertArrayEquals(new int[]{0, 36}, exam.gather(12, 5));
    }

    /**
     * 第五次提交答案错误
     */
    @Test
    void test5() {
        BookMyShow exam = new BookMyShow(30, 583);
        assertTrue(exam.scatter(699, 10));
        assertArrayEquals(new int[]{2, 0}, exam.gather(507, 24));

        assertTrue(exam.scatter(151, 15));
        assertArrayEquals(new int[0], exam.gather(753, 19));
        assertArrayEquals(new int[]{3, 0}, exam.gather(384, 4));
        assertArrayEquals(new int[]{1, 267}, exam.gather(178, 1));
        assertArrayEquals(new int[0], exam.gather(962, 3));

        assertFalse(exam.scatter(894, 2));
        assertArrayEquals(new int[0], exam.gather(742, 10));
        assertArrayEquals(new int[0], exam.gather(161, 2));

        assertTrue(exam.scatter(259, 8));
        assertArrayEquals(new int[0], exam.gather(692, 19));

        assertFalse(exam.scatter(530, 3));
        assertArrayEquals(new int[0], exam.gather(741, 22));
        assertArrayEquals(new int[]{4, 0}, exam.gather(304, 10));
    }

}
