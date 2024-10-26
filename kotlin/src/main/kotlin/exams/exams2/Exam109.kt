package exams.exams2

fun countWays(nums: List<Int>): Int {
    var arr = nums.sorted()

    //逐个测试选中 i 个学生时是否符合题目要求，最多可选中 nums.size 个学生
    var c = 0
    for (i in 0..arr.size) {
        //选中 i 个学生如果在数组中能找到 i ，则不符合 严格大于 或 严格小于
        var index = arr.binarySearch(i)
        if (index < 0) {
            var numCount = -index - 1 //没有查找到 i 时，有 numCount 个学生 严格小于
            // 严格小于 的人数必须 等于当前选中人数：
            // numCount<i 表示没有办法选中 i 个 严格小于 的学生；
            // numCount>i 表示选中 i 个学生后，有未选中学生 不能 严格大于 选中人数
            if (numCount == i) c++
        }
    }

    return c
}
