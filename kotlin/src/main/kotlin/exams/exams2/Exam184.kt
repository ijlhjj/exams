package exams.exams2

fun beautifulSubstrings(s: String, k: Int): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u') //元音字符集

    var count = 0 //非空美丽子字符串 的数量
    val chars = s.toCharArray()
    for (i in chars.indices) {
        var v = 0 //元音字符数量
        var c = 0 //辅音字符数量

        for (j in i..<chars.size) {
            if (vowels.contains(chars[j]))
                v++
            else
                c++

            //符合美丽字符串定义
            if (v == c && (v * c) % k == 0)
                count++
        }
    }

    return count
}
