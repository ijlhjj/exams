package exams.exams2

fun numOfBurgers(tomatoSlices: Int, cheeseSlices: Int): List<Int> {
    // 特殊情况处理，奶酪 数量为 0
    if (cheeseSlices == 0) {
        return if (tomatoSlices == 0)
            listOf(0, 0)
        else
            listOf()
    }

    // 设置 小皇堡 数量为 奶酪 数量，使用的番茄数量为 小皇堡 的 2 倍
    var totalSmall = cheeseSlices
    var useTomato = totalSmall * 2

    // 剩余 番茄数量 小于 0 ，不可能同时为 0 ，返回空列表
    var surplusTomato = tomatoSlices - useTomato
    if (surplusTomato < 0)
        return listOf()

    // 剩余 番茄数量 不是 2 的整数倍 ，不可能同时为 0 ，返回空列表
    if (surplusTomato % 2 != 0)
        return listOf()

    // 每个 小皇堡 再分 2 个番茄，转成 巨无霸汉堡。小皇堡 数量等于 奶酪 - 巨无霸汉堡
    var totalJumbo = surplusTomato / 2
    totalSmall = cheeseSlices - totalJumbo

    // 小皇堡 数量不能小于 0
    return if (totalSmall < 0)
        listOf()
    else listOf(totalJumbo, totalSmall)
}
