package exams.exams2

import kotlin.math.pow

fun findKOr(nums: IntArray, k: Int): Int {
    var digits = IntArray(32) //题目描述为小于31位，这里取整

    for (n in nums) {
        //转换为二进制字符串
        var binStr = n.toString(2)
        for (i in binStr.indices)
            if (binStr[binStr.length - i - 1] == '1')
            //按位统计数位 1
                digits[i]++
    }

    var sum = 0
    for (i in digits.indices) {
        //符合题目的 K-or ，按题目求 乘方 后加入总和
        if (digits[i] >= k) {
            var n = 2.0.pow(i).toInt()
            sum += n
        }
    }

    return sum
}
