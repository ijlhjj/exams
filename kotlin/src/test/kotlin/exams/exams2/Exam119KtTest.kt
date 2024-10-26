package exams.exams2

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Exam119KtTest {

    @Test
    fun singleNumber() {
        assertEquals(1, singleNumber(intArrayOf(2, 2, 1)))
        assertEquals(4, singleNumber(intArrayOf(4, 1, 2, 1, 2)))
        assertEquals(1, singleNumber(intArrayOf(1)))
    }

    @Test
    fun singleNumber2() {
        assertEquals(3, singleNumber2(intArrayOf(2, 2, 3, 2)))
        assertEquals(99, singleNumber2(intArrayOf(0, 1, 0, 1, 0, 1, 99)))
    }

    @Test
    fun singleNumber3() {
        assertArrayEquals(intArrayOf(3, 5), singleNumber3(intArrayOf(1, 2, 1, 3, 2, 5)))
        assertArrayEquals(intArrayOf(-1, 0), singleNumber3(intArrayOf(-1, 0)))
        assertArrayEquals(intArrayOf(0, 1), singleNumber3(intArrayOf(0, 1)))
    }

}
