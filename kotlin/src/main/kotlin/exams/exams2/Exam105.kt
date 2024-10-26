package exams.exams2

fun lengthOfLastWord(s: String): Int {
    var s1 = s.trim() //去空格
    var words = s1.split(" ") //分隔字符串
    return words.last().length //返回最后一个的长度
}
