package exams.exams1;

import exams.exams1.Exam74.MinStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam74Test {

    @Test
    void test1() {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);

        assertEquals(-3, obj.getMin());

        obj.pop();
        assertEquals(0, obj.top());
        assertEquals(-2, obj.getMin());
    }

    @Test
    void test2() {
        MinStack obj = new MinStack();
        obj.push(2);
        obj.push(0);
        obj.push(3);
        obj.push(0);

        assertEquals(0, obj.getMin());

        obj.pop();
        assertEquals(0, obj.getMin());

        obj.pop();
        assertEquals(0, obj.getMin());

        obj.pop();
        assertEquals(2, obj.getMin());
    }

}
