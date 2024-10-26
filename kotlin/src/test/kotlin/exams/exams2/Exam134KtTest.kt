package exams.exams2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Exam134KtTest {

    @Test
    fun findTheLongestBalancedSubstring() {
        assertEquals(6, findTheLongestBalancedSubstring("01000111"))
        assertEquals(4, findTheLongestBalancedSubstring("00111"))
        assertEquals(0, findTheLongestBalancedSubstring("111"))
    }

}
