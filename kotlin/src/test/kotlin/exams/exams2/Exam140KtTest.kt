package exams.exams2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Exam140KtTest {

    @Test
    fun findKOr() {
        assertEquals(9, findKOr(intArrayOf(7, 12, 9, 8, 9, 15), 4))
        assertEquals(0, findKOr(intArrayOf(2, 12, 1, 11, 4, 5), 6))
        assertEquals(15, findKOr(intArrayOf(10, 8, 5, 9, 11, 6, 8), 1))
    }

}
