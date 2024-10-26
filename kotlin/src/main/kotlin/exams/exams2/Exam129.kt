package exams.exams2

fun countPoints(rings: String): Int {
    //创建10个空集合数组代表10个杆
    var poles = mutableListOf<MutableSet<Char>>()
    for (i in 0..9)
        poles.add(mutableSetOf())

    //根据题意拆分入参加入相应的杆上
    var index = 0
    while (index < rings.length) {
        var colour = rings[index] //颜色
        var i = rings[index + 1].toString().toInt() //杆索引
        poles[i].add(colour)
        index += 2
    }

    //遍历10个杆统计有多少集齐3种颜色的环
    var c = 0
    for (p in poles) if (p.size == 3) c++

    return c
}
