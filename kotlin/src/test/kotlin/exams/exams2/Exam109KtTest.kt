package exams.exams2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Exam109KtTest {

    @Test
    fun countWays() {
        assertEquals(2, countWays(listOf(1, 1)))
        assertEquals(3, countWays(listOf(6, 0, 3, 3, 6, 7, 2, 7)))
    }

}
