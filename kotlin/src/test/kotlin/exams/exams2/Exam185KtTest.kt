package exams.exams2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Exam185KtTest {

    @Test
    fun minLength() {
        assertEquals(2, minLength("ABFCACDB"))
        assertEquals(5, minLength("ACBBD"))
    }

}
