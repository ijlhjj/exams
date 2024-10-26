package exams.exams2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Exam104KtTest {

    @Test
    fun sumIndicesWithKSetBits() {
        assertEquals(13, sumIndicesWithKSetBits(listOf(5, 10, 1, 5, 2), 1))
        assertEquals(1, sumIndicesWithKSetBits(listOf(4, 3, 2, 1), 2))
    }

}
