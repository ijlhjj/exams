package exams.exams2

fun maxArea(h: Int, w: Int, horizontalCuts: IntArray, verticalCuts: IntArray): Int {
    //计算最大的 height 间距
    horizontalCuts.sort()
    var height = horizontalCuts[0]
    var i = 0
    while (i < horizontalCuts.size - 1) {
        var d1 = horizontalCuts[i + 1] - horizontalCuts[i]
        if (d1 > height)
            height = d1
        i++
    }
    var d2 = h - horizontalCuts[horizontalCuts.size - 1]
    if (d2 > height)
        height = d2

    //计算最大的 width 间距
    verticalCuts.sort()
    var width = verticalCuts[0]
    i = 0
    while (i < verticalCuts.size - 1) {
        var d3 = verticalCuts[i + 1] - verticalCuts[i]
        if (d3 > width)
            width = d3
        i++
    }
    var d4 = w - verticalCuts[verticalCuts.size - 1]
    if (d4 > width)
        width = d4

    //按题目要求取余
    var area = height.toLong() * width.toLong()
    var r = area % 1000000007L

    return r.toInt()
}
