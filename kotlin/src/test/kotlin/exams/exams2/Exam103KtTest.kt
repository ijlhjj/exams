package exams.exams2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Exam103KtTest {

    @Test
    fun numberOfPoints() {
        assertEquals(7, numberOfPoints(listOf(listOf(3, 6), listOf(1, 5), listOf(4, 7))))
        assertEquals(7, numberOfPoints(listOf(listOf(1, 3), listOf(5, 8))))
    }

}
