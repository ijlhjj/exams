package exams.exams2

fun numberOfPoints(nums: List<List<Int>>): Int {
    var c = 0

    for (i in 1..100) {
        for (pair in nums)
            if (i in pair[0]..pair[1]) {
                c++
                break
            }
    }

    return c
}
