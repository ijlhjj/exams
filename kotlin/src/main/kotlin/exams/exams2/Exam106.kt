package exams.exams2

import kotlin.math.ceil


fun minCount(coins: IntArray): Int {
    var c = 0

    for (coin in coins) {
        var upper = ceil(coin / 2.0)
        c += upper.toInt()
    }

    return c
}
