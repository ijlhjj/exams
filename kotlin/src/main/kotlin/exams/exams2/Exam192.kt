package exams.exams2

fun splitWordsBySeparator(words: List<String>, separator: Char): List<String> {
    val wordList = mutableListOf<String>()
    for (w in words) {
        val subList = w.split(separator)
        for (s in subList) {
            if (s.isNotEmpty())
                wordList.add(s)
        }
    }
    return wordList
}
