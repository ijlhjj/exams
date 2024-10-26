package exams.exams1

/**
 * 使用 Map 辅助，达到时间复杂度：O(N)
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    var indexMap = mutableMapOf<Int, Int>()

    for ((index, value) in nums.withIndex()) {
        if ((target - value) in indexMap) return intArrayOf(index, indexMap.getValue(target - value))

        indexMap[value] = index
    }

    return intArrayOf()
}
