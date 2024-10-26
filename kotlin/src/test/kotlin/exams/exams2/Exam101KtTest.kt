package exams.exams2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Exam101KtTest {

    @Test
    fun findDelayedArrivalTime() {
        assertEquals(20, findDelayedArrivalTime(15, 5))
        assertEquals(0, findDelayedArrivalTime(13, 11))
    }

}
