package exams.exams2

fun giveGem(gem: IntArray, operations: Array<IntArray>): Int {
    for ((x, y) in operations) {
        var n = gem[x] / 2
        gem[x] -= n
        gem[y] += n
    }

    return gem.max() - gem.min()
}
