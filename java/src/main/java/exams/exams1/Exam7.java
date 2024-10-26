package exams.exams1;

import java.util.HashSet;
import java.util.Set;

/**
 * 7-无重复字符的最长子串
 *
 * @author ijlhjj
 * @version 1.0 2023-06-29
 */
public class Exam7 {

    public int lengthOfLongestSubstring(String s) {
        int longest = 0; // 存储最长子串长度

        Set<Character> charSet = new HashSet<>(); // 定义缓存集合存放不重复字符

        // 按字符循环统计 无重复字符的最长子串 长度
        char[] chars = s.toCharArray();
        // 循环到 倒数 longest 时不可能获得更长子串，停止循环
        for (int i = 0; i < chars.length - longest; i++) {
            charSet.clear(); // 进入循环时清空缓存集合字符
            int len = 0;

            // 每次循环从第 i 个字符开始统计
            for (int j = i; j < chars.length; j++) {
                // 字符重复，本次循环统计结束。开始下次外部循环
                if (charSet.contains(chars[j])) break;

                // 字符不重复时，集合加入当前字符，子串长度加1
                charSet.add(chars[j]);
                len++;

                // 子串长度大于 最长长度 时更新 最长长度
                if (len > longest) longest = len;
            }
        }

        return longest;
    }

}
