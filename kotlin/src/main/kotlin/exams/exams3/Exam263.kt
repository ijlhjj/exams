package exams.exams3

import kotlin.math.max

fun findLUSlength(a: String, b: String): Int {
    if (a.length != b.length) return max(a.length, b.length)

    if (a == b) return -1

    return a.length
}
