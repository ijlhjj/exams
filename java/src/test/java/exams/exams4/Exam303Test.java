package exams.exams4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam303Test {

    @Test
    void minEnd() {
        Exam303 exam = new Exam303();
        assertEquals(6, exam.minEnd(3, 4));
        assertEquals(15, exam.minEnd(2, 7));
    }

}
