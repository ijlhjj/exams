package exams.exams2

import kotlin.math.floor
import kotlin.math.sqrt

fun pickGifts(gifts: IntArray, k: Int): Long {
    val last = gifts.size - 1
    for (i in 1..k) {
        gifts.sort()
        var maxG = gifts[last]
        gifts[last] = floor(sqrt(maxG.toDouble())).toInt()
    }

    var total = 0L
    for (g in gifts)
        total += g

    return total
}
