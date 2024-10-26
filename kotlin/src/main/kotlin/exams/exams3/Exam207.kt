package exams.exams3

fun distinctDifferenceArray(nums: IntArray): IntArray {
    //使用映射进行元素统计
    val counter = mutableMapOf<Int, Int>()
    for (n in nums) counter.merge(n, 1, Integer::sum)

    val diffArr = IntArray(nums.size) //元素差数组
    val elements = mutableSetOf<Int>() //前缀数组元素集合

    //循环处理每个元素
    for (i in nums.indices) {
        val n = nums[i]
        val c = counter[n]

        //当前元素加入前缀元素集合。如果元素数量为1，则后缀数组中不再有当前元素值，从统计字典中删除；否则元素数量减 1
        elements.add(n)
        if (c == 1) counter.remove(n)
        else if (c != null) counter[n] = c - 1

        //当前差值等于前缀统计减去后缀统计数量
        diffArr[i] = elements.size - counter.size
    }

    return diffArr
}
