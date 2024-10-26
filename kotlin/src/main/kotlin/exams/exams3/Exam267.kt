package exams.exams3

fun detectCapitalUse(word: String): Boolean {
    //全部字母都是大写
    var s = word.uppercase()
    if (s == word)
        return true

    //全部字母都是小写
    s = word.lowercase()
    if (s == word)
        return true

    //只有首字母大写
    s = s.replaceFirstChar { it.uppercase() }
    return s == word
}
