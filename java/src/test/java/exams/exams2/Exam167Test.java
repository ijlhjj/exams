package exams.exams2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam167Test {

    @Test
    void test1() {
        Exam167.CountIntervals countIntervals = new Exam167.CountIntervals(); // 用一个区间空集初始化对象
        countIntervals.add(2, 3);  // 将 [2, 3] 添加到区间集合中
        countIntervals.add(7, 10); // 将 [7, 10] 添加到区间集合中

        // 整数 2 和 3 出现在区间 [2, 3] 中
        // 整数 7、8、9、10 出现在区间 [7, 10] 中
        assertEquals(6, countIntervals.count());

        countIntervals.add(5, 8);  // 将 [5, 8] 添加到区间集合中
        assertEquals(8, countIntervals.count());
    }

    /**
     * 第 1 次提交答案错误
     */
    @Test
    void test2() {
        Exam167.CountIntervals countIntervals = new Exam167.CountIntervals();
        assertEquals(0, countIntervals.count());

        countIntervals.add(571, 770);
        assertEquals(200, countIntervals.count());

        countIntervals.add(920, 996);
        assertEquals(277, countIntervals.count());

        countIntervals.add(65, 512);
        assertEquals(725, countIntervals.count());

        countIntervals.add(959, 959);
        assertEquals(725, countIntervals.count());
    }

    /**
     * 第2次提交抛出异常：下标越界
     */
    @Test
    void test3() {
        Exam167.CountIntervals countIntervals = new Exam167.CountIntervals(); // 用一个区间空集初始化对象
        assertEquals(0, countIntervals.count());

        countIntervals.add(457, 717);
        countIntervals.add(918, 927);
        assertEquals(271, countIntervals.count());

        countIntervals.add(660, 675);
        assertEquals(271, countIntervals.count());

        countIntervals.add(885, 905);
        assertEquals(292, countIntervals.count());

        countIntervals.add(323, 416);
        countIntervals.add(774, 808);
        assertEquals(421, countIntervals.count());

        countIntervals.add(671, 787);
        countIntervals.add(133, 963);
        countIntervals.add(374, 823);
        assertEquals(831, countIntervals.count());
    }

}
