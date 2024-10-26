package exams.exams1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Exam7KtTest {

    @Test
    fun lengthOfLongestSubstring() {
        assertEquals(3, lengthOfLongestSubstring("abcabcbb"))
        assertEquals(1, lengthOfLongestSubstring("bbbbb"))
        assertEquals(3, lengthOfLongestSubstring("pwwkew"))
    }

}
