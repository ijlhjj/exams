package exams.exams3

import java.util.*

fun capitalizeTitle(title: String): String {
    val words = title.split(" ").toMutableList()

    for (i in words.indices) {
        val lower = words[i].lowercase()
        if (lower.length > 2)
            words[i] =
                lower.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        else
            words[i] = lower
    }

    return words.joinToString(separator = " ")
}
