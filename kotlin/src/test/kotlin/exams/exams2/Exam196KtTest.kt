package exams.exams2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Exam196KtTest {

    @Test
    fun maxNumberOfAlloys1() {
        assertEquals(
            2,
            maxNumberOfAlloys(3, 2, 15, listOf(listOf(1, 1, 1), listOf(1, 1, 10)), listOf(0, 0, 0), listOf(1, 2, 3))
        )
        assertEquals(
            5,
            maxNumberOfAlloys(3, 2, 15, listOf(listOf(1, 1, 1), listOf(1, 1, 10)), listOf(0, 0, 100), listOf(1, 2, 3))
        )
        assertEquals(
            2,
            maxNumberOfAlloys(2, 3, 10, listOf(listOf(2, 1), listOf(1, 2), listOf(1, 1)), listOf(1, 1), listOf(5, 5))
        )
    }

    /**
     * 第一次提交答案错误
     */
    @Test
    fun maxNumberOfAlloys2() {
        assertEquals(
            2443,
            maxNumberOfAlloys(
                15,
                17,
                80884895,
                listOf(
                    listOf(53, 57, 69, 73, 13, 41, 70, 74, 50, 74, 64, 54, 93, 86, 66),
                    listOf(73, 85, 78, 31, 68, 34, 65, 70, 58, 92, 54, 24, 5, 94, 79),
                    listOf(19, 12, 21, 48, 18, 62, 37, 38, 94, 16, 30, 88, 23, 18, 48),
                    listOf(62, 74, 62, 77, 57, 23, 42, 90, 46, 88, 76, 22, 60, 1, 62),
                    listOf(99, 37, 97, 67, 51, 97, 75, 40, 49, 40, 77, 12, 27, 62, 37),
                    listOf(27, 9, 32, 20, 2, 36, 95, 30, 96, 51, 67, 23, 29, 56, 39),
                    listOf(69, 83, 34, 27, 75, 42, 14, 59, 20, 34, 75, 3, 56, 53, 43),
                    listOf(33, 42, 26, 21, 10, 25, 6, 94, 7, 64, 65, 58, 94, 83, 7),
                    listOf(88, 11, 62, 92, 90, 69, 1, 54, 6, 44, 82, 5, 28, 46, 47),
                    listOf(61, 16, 58, 87, 5, 95, 23, 93, 14, 58, 77, 32, 37, 72, 39),
                    listOf(64, 14, 55, 81, 60, 52, 36, 9, 97, 84, 55, 41, 28, 75, 37),
                    listOf(5, 5, 97, 92, 18, 3, 65, 69, 95, 70, 61, 7, 47, 100, 19),
                    listOf(90, 66, 53, 17, 94, 70, 53, 42, 34, 19, 94, 29, 31, 58, 11),
                    listOf(44, 77, 21, 33, 98, 84, 28, 74, 39, 49, 57, 47, 72, 95, 29),
                    listOf(89, 68, 13, 47, 29, 57, 36, 47, 46, 69, 97, 81, 23, 33, 45),
                    listOf(27, 63, 96, 44, 22, 1, 59, 31, 87, 54, 10, 66, 62, 54, 88),
                    listOf(87, 25, 6, 46, 44, 3, 31, 97, 83, 58, 6, 46, 92, 57, 45)
                ),
                listOf(24, 13, 1, 7, 76, 99, 26, 62, 25, 65, 47, 27, 93, 41, 5),
                listOf(45, 6, 87, 41, 82, 40, 36, 26, 53, 92, 100, 89, 23, 39, 75)
            )
        )
    }

}
