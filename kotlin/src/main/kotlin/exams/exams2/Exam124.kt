package exams.exams2

fun countSeniors(details: Array<String>): Int {
    var c = 0

    for (d in details) {
        var age = d.substring(11, 13).toInt()
        if (age > 60)
            c++
    }

    return c
}
