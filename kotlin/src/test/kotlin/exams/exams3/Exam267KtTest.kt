package exams.exams3

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Exam267KtTest {

    @Test
    fun detectCapitalUse() {
        assertTrue(detectCapitalUse("USA"))
        assertFalse(detectCapitalUse("FlaG"))
    }

}
