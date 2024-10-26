package exams.exams2

fun checkCost(
    n: Int, budget: Int, composition: List<List<Int>>, stock: List<Int>, cost: List<Int>, mid: Long
): Boolean {
    //循环判断每台机器
    for (comp in composition) {
        var totalCost = 0L //总花费
        //循环判断当前机器的每种材料
        for (i in 0..<n) {
            //如果拥有材料不足：制造mid个合金需要当前材料数量 - 拥有数量
            val c = comp[i] * mid - stock[i]
            if (c > 0) {
                val currCost = c * cost[i] //购买当前材料需要花费金额
                totalCost += currCost

                //如果花费金额超出预算，当前机器不能制造mid个合金
                if (totalCost > budget)
                    break
            }
        }

        //如果花费金额不超出预算，当前机器可以制造mid个合金
        if (totalCost <= budget)
            return true
    }

    //所有机器都不能制造mid个合金
    return false
}

/**
 * 用二分查找逐个尝试可制造的最大合金数
 */
fun maxNumberOfAlloys(
    n: Int, k: Int, budget: Int, composition: List<List<Int>>, stock: List<Int>, cost: List<Int>
): Int {
    var low = 0 //下限初始化为0
    // 1 <= composition[i][j] <= 100 ，制造合金最少需要每种材料1份
    // 1 <= cost[i] <= 100 ，购买每种材料最少花费 1
    // 上限不会超过 拥有材料的最大值 + 预算金额 ， 这里乘以 2 是为了循环的取中值
    var high = (stock.max() + budget) * 2
    while (low <= high) {
        val mid = (low + high) / 2;
        val flag = checkCost(n, budget, composition, stock, cost, mid.toLong()); // 判断是否可以合成 mid 的合金数量
        //可以合成时提高下限，不能合成时降低上限
        if (flag) low = mid + 1;
        else high = mid - 1;
    }

    return low - 1;
}
