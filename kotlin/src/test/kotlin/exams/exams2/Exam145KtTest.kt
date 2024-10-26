package exams.exams2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Exam145KtTest {

    @Test
    fun maxSubArray() {
        assertEquals(6, maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
        assertEquals(1, maxSubArray(intArrayOf(1)))
        assertEquals(23, maxSubArray(intArrayOf(5, 4, -1, 7, 8)))
        assertEquals(-1, maxSubArray(intArrayOf(-1))) //第1次提交错误
    }

}
