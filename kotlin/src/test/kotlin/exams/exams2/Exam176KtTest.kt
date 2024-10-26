package exams.exams2

import org.junit.jupiter.api.Assertions.assertIterableEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Exam176KtTest {

    @Test
    fun numOfBurgers() {
        assertIterableEquals(listOf(1, 6), numOfBurgers(16, 7))
        assertTrue(numOfBurgers(17, 4).isEmpty())
        assertTrue(numOfBurgers(4, 17).isEmpty())
        assertIterableEquals(listOf(0, 0), numOfBurgers(0, 0))
        assertIterableEquals(listOf(0, 1), numOfBurgers(2, 1))
    }

}
