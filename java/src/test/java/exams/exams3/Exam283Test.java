package exams.exams3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam283Test {

    @Test
    void minimumAddedCoins() {
        Exam283 exam = new Exam283();
        assertEquals(2, exam.minimumAddedCoins(new int[]{1, 4, 10}, 19));
        assertEquals(1, exam.minimumAddedCoins(new int[]{1, 4, 10, 5, 7, 19}, 19));
        assertEquals(3, exam.minimumAddedCoins(new int[]{1, 1, 1}, 20));
    }

}
