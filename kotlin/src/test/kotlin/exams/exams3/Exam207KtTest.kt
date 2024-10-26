package exams.exams3

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class Exam207KtTest {

    @Test
    fun distinctDifferenceArray() {
        assertArrayEquals(intArrayOf(-3, -1, 1, 3, 5), distinctDifferenceArray(intArrayOf(1, 2, 3, 4, 5)))
        assertArrayEquals(intArrayOf(-2, -1, 0, 2, 3), distinctDifferenceArray(intArrayOf(3, 2, 3, 4, 2)))
    }

}
