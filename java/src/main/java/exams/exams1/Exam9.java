package exams.exams1;

/**
 * 9-最长回文子串
 *
 * @author ijlhjj
 * @version 1.0 2023-07-04
 */
public class Exam9 {

    /**
     * 判断字符数组起止值之间是否为回文
     * <p>
     * 前置条件：from < to
     * 判断序列：from <= subChars < to
     *
     * @param chars：待校验字符数组，不为空数组
     * @param from：起始索引，包括
     * @param to：截至索引，不包括
     * @return：是回文返回 true，否则返回 false
     */
    private boolean isPalindrome(char[] chars, int from, int to) {
        while (from < to) {
            if (chars[from++] != chars[--to]) return false;
        }
        return true;
    }

    /**
     * 查找最长的回文子串
     */
    public String longestPalindrome(String s) {
        String result = "";

        char[] chars = s.toCharArray(); // 拆分为字符数组，逐字符循环查找
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > i + result.length(); j--) {
                if (isPalindrome(chars, i, j)) { // 判断子序列是否为回文
                    int len = j - i; // 回文字符长度
                    if (len > result.length()) { // 保存最新最长结果
                        result = new String(chars, i, len);
                    }
                    break; // j 为递减，找到回文后本次内循环不可能找到更长结果
                }
            }
        }

        return result;
    }

}
