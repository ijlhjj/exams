package exams.exams2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam110Test {

    @Test
    void test1() {
        Exam110 exam = new Exam110();
        Exam110.LRUCache lRUCache = exam.new LRUCache(2);

        lRUCache.put(1, 1); // 缓存是 {1=1}
        lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
        assertEquals(1, lRUCache.get(1));     // 返回 1
        lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        assertEquals(-1, lRUCache.get(2));     // 返回 -1 (未找到)

        lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
        assertEquals(-1, lRUCache.get(1));     // 返回 -1 (未找到)
        assertEquals(3, lRUCache.get(3));      // 返回 3
        assertEquals(4, lRUCache.get(4));     // 返回 4
    }

    @Test
    void test2() {
        Exam110 exam = new Exam110();
        Exam110.LRUCache lRUCache = exam.new LRUCache(2);

        assertEquals(-1, lRUCache.get(2));     // 返回 -1 (未找到)
        lRUCache.put(2, 6);
        assertEquals(-1, lRUCache.get(1));     // 返回 -1 (未找到)
        lRUCache.put(1, 5);
        lRUCache.put(1, 2);

        assertEquals(2, lRUCache.get(1));
        assertEquals(6, lRUCache.get(2));
    }

}
