package exams.exams2

fun areSimilar(mat: Array<IntArray>, k: Int): Boolean {
    for (i in mat.indices) {
        val lenCol = mat[i].size
        val row = IntArray(lenCol)

        if (i % 2 == 0) {//奇数行 右移
            for (j in 0..<lenCol) {
                val index = (j + k) % lenCol
                row[index] = mat[i][j]
            }
        } else {//偶数行 左移
            for (j in 0..<lenCol) {
                var index = j - k;
                while (index < 0)
                    index += lenCol

                index %= lenCol
                row[index] = mat[i][j]
            }
        }

        for (j in 0..<lenCol) {
            if (row[j] != mat[i][j])
                return false
        }
    }

    return true
}
