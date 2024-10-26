package exams.exams3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam264Test {

    @Test
    void discountPrices() {
        Exam264 exam = new Exam264();
        assertEquals("there are $0.50 $1.00 and 5$ candies in the shop", exam.discountPrices("there are $1 $2 and 5$ candies in the shop", 50));
        assertEquals("1 2 $0.00 4 $0.00 $0.00 7 8$ $0.00 $10$", exam.discountPrices("1 2 $3 4 $5 $6 7 8$ $9 $10$", 100));
    }

}
