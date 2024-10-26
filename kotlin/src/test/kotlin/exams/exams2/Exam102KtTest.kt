package exams.exams2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Exam102KtTest {

    @Test
    fun giveGem1() {
        var gem = intArrayOf(3, 1, 2)
        var operations = arrayOf(intArrayOf(0, 2), intArrayOf(2, 1), intArrayOf(2, 0))
        assertEquals(2, giveGem(gem, operations))
    }

    @Test
    fun giveGem2() {
        var gem = intArrayOf(100, 0, 50, 100)
        var operations = arrayOf(intArrayOf(0, 2), intArrayOf(0, 1), intArrayOf(3, 0), intArrayOf(3, 0))
        assertEquals(75, giveGem(gem, operations))
    }

    @Test
    fun giveGem3() {
        var gem = intArrayOf(0, 0, 0, 0)
        var operations = arrayOf(intArrayOf(1, 2), intArrayOf(3, 1), intArrayOf(1, 2))
        assertEquals(0, giveGem(gem, operations))
    }

}
