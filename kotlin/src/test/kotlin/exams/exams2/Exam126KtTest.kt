package exams.exams2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Exam126KtTest {

    @Test
    fun maxArea() {
        assertEquals(4, maxArea(5, 4, intArrayOf(1, 2, 4), intArrayOf(1, 3)))
        assertEquals(6, maxArea(5, 4, intArrayOf(3, 1), intArrayOf(1)))
        assertEquals(9, maxArea(5, 4, intArrayOf(3), intArrayOf(3)))
        assertEquals(81, maxArea(1000000000, 1000000000, intArrayOf(2), intArrayOf(2)))
    }

}
