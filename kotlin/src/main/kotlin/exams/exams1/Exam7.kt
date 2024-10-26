package exams.exams1

import java.lang.Integer.max

/**
 * 使用双指针表示字符串中的某个子串（或窗口）的左右边界。
 * 假设我们选择字符串中的第 k 个字符作为起始位置，并且得到了不包含重复字符的最长子串的结束位置为 $r_k$ 。那么当我们选择第 k+1 个字符作为起始位置时，首先从 k+1 到 $r_k$ 的字符显然是不重复的。
 * 并且由于少了原本的第 k 个字符，我们可以尝试继续增大 $r_k$ ，直到右侧出现了重复字符为止。
 */
fun lengthOfLongestSubstring(s: String): Int {
    var charSet = mutableSetOf<Char>() //当前子串中的字符

    //右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
    var rk = -1
    var ans = 0
    for (i in s.indices) {
        // 左指针向右移动一格，移除一个字符
        if (i != 0)
            charSet.remove(s.elementAt(i - 1))

        // 不断地移动右指针
        while (rk + 1 < s.length && !charSet.contains(s.elementAt(rk + 1))) {
            charSet.add(s.elementAt(rk + 1))
            rk++
        }

        // 第 i 到 rk 个字符是当次无重复字符子串长度
        ans = max(ans, rk - i + 1)
    }

    return ans
}
