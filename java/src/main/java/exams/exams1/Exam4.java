package exams.exams1;

/**
 * 4-最长公共前缀
 *
 * @author ijlhjj
 * @version 1.0 2023-06-24
 */
public class Exam4 {

    /**
     * 查找字符串数组中的最长公共前缀
     *
     * @param : 1 <= strs.length <= 200
     *          0 <= strs[i].length <= 200
     *          strs[i] 仅由小写英文字母组成
     * @return 如果不存在公共前缀，返回空字符串 ""
     */
    public String longestCommonPrefix(String[] strs) {
        StringBuilder builder = new StringBuilder(""); // 存储最终返回的字符串
        String s1 = strs[0];
        int l = s1.length(); // 第一个字符串长度，输入保证最少有一个字符串

        // 如果第一个字符串为空，不用处理，直接返回空字符串
        if (l > 0) {
            // 按第一个字符串进行循环处理
            for (int i = 0; i < l; i++) {
                char c1 = s1.charAt(i); // 取第一个字符串的当前字符

                // 循环对比其它字符串对应字符，j从1开始
                for (int j = 1; j < strs.length; j++) {
                    String s = strs[j]; // 当前对比字符串

                    // 如果当前字符串已至结尾，不用继续对比，直接返回已比对结果
                    if (s.length() == i) {
                        return builder.toString();
                    }

                    // 如果当前比对字符不同，不用继续对比，直接返回已比对结果
                    char c2 = s.charAt(i);
                    if (c1 != c2) {
                        return builder.toString();
                    }
                }

                builder.append(c1); // 如果所有字符串的当前字符都相同，则加入比对结果
            }
        }

        return builder.toString();
    }

}
