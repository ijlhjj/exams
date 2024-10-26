package exams.exams2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Exam129KtTest {

    @Test
    fun countPoints() {
        assertEquals(1, countPoints("B0B6G0R6R0R6G9"))
        assertEquals(1, countPoints("B0R0G0R9R0B0G0"))
        assertEquals(0, countPoints("G4"))
    }

}
