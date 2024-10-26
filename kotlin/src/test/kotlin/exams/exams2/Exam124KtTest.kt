package exams.exams2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Exam124KtTest {

    @Test
    fun countSeniors() {
        assertEquals(2, countSeniors(arrayOf("7868190130M7522", "5303914400F9211", "9273338290F4010")))
        assertEquals(0, countSeniors(arrayOf("1313579440F2036", "2921522980M5644")))
    }

}
