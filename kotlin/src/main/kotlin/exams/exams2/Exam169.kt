package exams.exams2

fun findPeakElement(nums: IntArray): Int {
    //题意允许只有一个元素
    if (nums.size == 1)
        return 0

    var flag = false
    var i = 1;
    while (i < nums.size - 1) {
        if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
            flag = true
            break;
        }
        i++
    }

    //循环找到符合题意元素
    if (flag)
        return i

    //循环没找到时返回符合题意的第一个或最后一个元素
    if (nums[0] > nums[1])
        return 0
    else
        return nums.size - 1
}
