package exams.exams2

fun findPeakGrid(mat: Array<IntArray>): IntArray {
    for (i in mat.indices) {
        for (j in mat[i].indices)
            if (checkPeak(mat, i, j))
                return intArrayOf(i, j)
    }
    return intArrayOf(0, 0)
}

fun checkPeak(mat: Array<IntArray>, row: Int, col: Int): Boolean {
    val m = mat.size //行数
    val n = mat[0].size //列数
    val num = mat[row][col]

    //上
    if (row > 0 && num <= mat[row - 1][col]) return false

    //下
    if (row < m - 1 && num <= mat[row + 1][col]) return false

    //左
    if (col > 0 && num <= mat[row][col - 1]) return false

    //右
    if (col < n - 1 && num <= mat[row][col + 1]) return false

    return true
}
