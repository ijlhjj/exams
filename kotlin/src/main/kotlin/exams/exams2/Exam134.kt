package exams.exams2

fun findTheLongestBalancedSubstring(s: String): Int {
    var maxLen = 0

    while (maxLen < s.length) {
        var c = maxLen / 2 + 1
        var sub = "0".repeat(c) + "1".repeat(c)
        if (s.contains(sub))
            maxLen += 2
        else
            break
    }

    return maxLen
}
