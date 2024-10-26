package exams.exams2

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

class Exam113KtTest {

    @Test
    fun canPlaceFlowers() {
        assertTrue(canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 1))
        assertFalse(canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 2))
    }

}
