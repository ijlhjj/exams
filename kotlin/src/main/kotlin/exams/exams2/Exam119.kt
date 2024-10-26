package exams.exams2

fun singleNumber(nums: IntArray): Int {
    var numSet = mutableSetOf<Int>()
    for (n in nums) {
        if (numSet.contains(n))
            numSet.remove(n)
        else
            numSet.add(n)
    }
    return numSet.elementAt(0)
}
