package exams.exams1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 38-最长合法子字符串的长度
 *
 * @author ijlhjj
 * @version 1.0 2023-07-29
 */
public class Exam38 {

    public int longestValidSubstring(String word, List<String> forbidden) {
        // 禁止列表存在重复值，使用集合去重，减少后续处理次数
        Set<String> forbSet = new HashSet<>(forbidden);

        // 查找字符串 字符集，Character 集合不好转换，全部转成 Integer 集合效果相同
        Set<Integer> charSet = word.chars().collect(HashSet::new, Set::add, Set::addAll);

        // 禁止列表中的单字符集合，两种不同类型集合有各自用途
        Set<Integer> forbCharIntSet = new HashSet<>();
        Set<String> forbCharSet = new HashSet<>();
        for (String s : forbSet) {
            if (s.length() < 2) {
                forbCharSet.add(s);
                forbCharIntSet.add(Integer.valueOf(s.charAt(0)));
            }
        }

        // 经过缩减后的禁止列表，用作后续分隔循环处理。初始设置为单字符列表
        List<String> forbList = new ArrayList<>(forbCharSet);

        /* 对长禁止列表中包含单禁止字符列表的进行排除。
           分隔时不包含单字符 禁止序列 的不可能包含有此单字符的多字符序列。
           如禁止列表中有 'a'，则不需要再处理 'ab' 'abc' 这样的序列。
         */
        for (String s : forbSet) {
            boolean flag = false;

            /* 如果 禁止序列 包含不在 查找字符串 中的字符，其不可能在 查找字符串 中找到，不需要处理。
               这个处理加快了 word 只包含少量相同字符的长输入的处理速度。如 'a...a' （长度大于 10000），这种输入对包含 非'a' 字符的 禁止列表（'ab') 不需要处理。
               长序列中找到单字符，不需要处理。
             */
            Set<Integer> cSet = s.chars().collect(HashSet::new, Set::add, Set::addAll);
            if (!charSet.containsAll(cSet) || containsAny(cSet, forbCharIntSet)) flag = true;

            if (!flag) forbList.add(s);
        }

        // 对处理后的列表按长度由短到长排序。基于一个假设：短的字符串更常出现。
        forbList.sort((s1, s2) -> s1.length() - s2.length());

        int longest = 0;

        StringBuilder sb = new StringBuilder();
        // 不可能找到更长结果时不再循环
        for (int i = 0; i < word.length() - (longest - sb.length()); i++) {
            String str = sb.append(word.charAt(i)).toString();
            for (String forb : forbList) {
                // 列表字符串只可能出现在结尾
                if (str.endsWith(forb)) {
                    sb.setLength(0); // 清空
                    sb.append(forb.substring(1)); // 加入从 1 开始的子字符串
                    break; // 因为按长度排序，短字符串中不可能再包含长字符串，跳出循环
                }
            }

            // 如果找到更长子串，更新长度
            if (sb.length() > longest) longest = sb.length();
        }

        return longest;
    }

    public boolean containsAny(Set<Integer> aSet, Set<Integer> bSet) {
        for (Integer i : bSet)
            if (aSet.contains(i)) return true;

        return false;
    }

}
