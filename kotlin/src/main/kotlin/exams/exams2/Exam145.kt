package exams.exams2

fun maxSubArray(nums: IntArray): Int {
    var maxSum = 0
    var thisSum = 0
    var max = Int.MIN_VALUE

    for (i in nums.indices) {
        thisSum += nums[i]

        if (nums[i] > max) max = nums[i]

        if (thisSum > maxSum) maxSum = thisSum
        else if (thisSum < 0) //任何负的子序列不可能是最优子序列的前缀
            thisSum = 0
    }

    if (max < 0) return max //如果所有的整数都是负的，那么连续子序列的最大和是那个最大的负数项

    return maxSum
}
