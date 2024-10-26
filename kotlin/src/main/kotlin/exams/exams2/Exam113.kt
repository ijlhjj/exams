package exams.exams2

fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var lastPosition = -2 //因为跟加 1 比较，所以初值设为 -2
    var c = 0 //新增栽种数量
    for (i in flowerbed.indices) {
        //新增栽种数量达到 n，返回 true
        if (c == n) return true

        //1 表示种植了花，种花位置不能栽种
        if (flowerbed[i] > 0) continue

        //前边相邻位置种植了花，当前位置不能栽种
        if (i > 0 && flowerbed[i - 1] > 0) continue

        //后边相邻位置种植了花，当前位置不能栽种
        if (i < flowerbed.size - 1 && flowerbed[i + 1] > 0) continue

        //不能连续新增栽种
        if (i == lastPosition + 1) continue

        //当前位置新增栽种，最后栽种位置更新，栽种数量加 1
        lastPosition = i
        c++
    }

    //返回栽种数量是否达到 n
    return c == n
}
