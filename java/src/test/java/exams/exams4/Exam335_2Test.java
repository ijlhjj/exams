package exams.exams4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam335_2Test {

    @Test
    void jump() {
        Exam335_2 exam = new Exam335_2();
        assertEquals(2, exam.jump(new int[]{2, 3, 1, 1, 4}));
        assertEquals(2, exam.jump(new int[]{2, 3, 0, 1, 4}));
    }

}
