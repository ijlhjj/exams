package exams.exams2

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Exam164KtTest {

    @Test
    fun areSimilar() {
        assertTrue(areSimilar(arrayOf(intArrayOf(1, 2, 1, 2), intArrayOf(1, 2, 1, 2), intArrayOf(1, 2, 1, 2)), 2))
        assertTrue(areSimilar(arrayOf(intArrayOf(2, 2), intArrayOf(2, 2)), 3))
        assertFalse(areSimilar(arrayOf(intArrayOf(1, 2)), 1))
    }

}
