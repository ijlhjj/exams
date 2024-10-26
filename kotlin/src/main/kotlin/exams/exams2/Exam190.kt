package exams.exams2

fun maximumNumberOfStringPairs(words: Array<String>): Int {
    var count = 0

    for (i in words.indices) {
        for (j in i + 1..<words.size) {
            if (words[i] == words[j].reversed()) {
                count++
                break
            }
        }
    }

    return count
}
