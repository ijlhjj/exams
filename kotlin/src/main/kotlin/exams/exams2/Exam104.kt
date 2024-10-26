package exams.exams2

fun sumIndicesWithKSetBits(nums: List<Int>, k: Int): Int {
    var sum = 0

    for (i in nums.indices) {
        var binStr = i.toString(2)
        var c = binStr.count { it == '1' }

        if (c == k)
            sum += nums[i]
    }

    return sum
}
