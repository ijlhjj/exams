package exams.exams1

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class Exam1KtTest {

    @Test
    fun twoSum1() {
        val expected = intArrayOf(0, 1)
        expected.sort()
        val actual = twoSum(intArrayOf(2, 7, 11, 15), 9)
        actual.sort()
        assertArrayEquals(expected, actual)
    }

    @Test
    fun twoSum2() {
        val expected = intArrayOf(1, 2)
        expected.sort()
        val actual = twoSum(intArrayOf(3, 2, 4), 6)
        actual.sort()
        assertArrayEquals(expected, actual)
    }

    @Test
    fun twoSum3() {
        val expected = intArrayOf(0, 1)
        expected.sort()
        val actual = twoSum(intArrayOf(3, 3), 6)
        actual.sort()
        assertArrayEquals(expected, actual)
    }

}
