package exams.exams2

fun minLength(s: String): Int {
    var str = s
    var flag = true
    while (flag) {
        flag = false
        var index = str.indexOf("AB")
        if (index != -1) {
            str = str.removeRange(index, index + 2)
            flag = true
        }

        index = str.indexOf("CD")
        if (index != -1) {
            str = str.removeRange(index, index + 2)
            flag = true
        }
    }

    return str.length
}
