package exams.exams1;

import exams.exams1.Exam73.CQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam73Test {

    @Test
    void test1() {
        CQueue obj = new CQueue();
        obj.appendTail(3);
        assertEquals(3, obj.deleteHead());
        assertEquals(-1, obj.deleteHead());
        assertEquals(-1, obj.deleteHead());
    }

    @Test
    void test2() {
        CQueue obj = new CQueue();
        assertEquals(-1, obj.deleteHead());
        obj.appendTail(5);
        obj.appendTail(2);
        assertEquals(5, obj.deleteHead());
        assertEquals(2, obj.deleteHead());
    }

}
