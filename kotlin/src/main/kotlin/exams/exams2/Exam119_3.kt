package exams.exams2

fun singleNumber3(nums: IntArray): IntArray {
    var numSet = mutableSetOf<Int>()
    for (n in nums) {
        if (numSet.contains(n)) numSet.remove(n)
        else numSet.add(n)
    }
    return numSet.toIntArray()
}
