package exams.exams2

import org.junit.jupiter.api.Assertions.assertIterableEquals
import org.junit.jupiter.api.Test

class Exam192KtTest {

    @Test
    fun splitWordsBySeparator() {
        assertIterableEquals(
            listOf("one", "two", "three", "four", "five", "six"),
            splitWordsBySeparator(listOf("one.two.three", "four.five", "six"), '.')
        )

        assertIterableEquals(
            listOf("easy", "problem"),
            splitWordsBySeparator(listOf("\$easy\$", "\$problem\$"), '$')
        )

        assertIterableEquals(
            emptyList<String>(),
            splitWordsBySeparator(listOf("|||"), '|')
        )
    }

}
