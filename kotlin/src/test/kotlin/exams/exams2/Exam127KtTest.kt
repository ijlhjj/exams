package exams.exams2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Exam127KtTest {

    @Test
    fun pickGifts() {
        assertEquals(29, pickGifts(intArrayOf(25, 64, 9, 4, 100), 4))
        assertEquals(4, pickGifts(intArrayOf(1, 1, 1, 1), 4))
    }

}
