package exams.exams2

fun singleNumber2(nums: IntArray): Int {
    var numOddSet = mutableSetOf<Int>() //存放奇数次元素
    var numEvenSet = mutableSetOf<Int>() //存放偶数次元素

    //只出现一次的元素不会出现在 numEvenSet 中
    for (n in nums) {
        if (n in numOddSet) {
            numOddSet.remove(n)
            numEvenSet.add(n)
        } else numOddSet.add(n)
    }

    var numSet = numOddSet - numEvenSet
    return numSet.elementAt(0)
}
