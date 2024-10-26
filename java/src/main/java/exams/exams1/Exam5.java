package exams.exams1;

import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * 5-有效的括号
 *
 * @author ijlhjj
 * @version 1.0 2023-06-27
 */
public class Exam5 {

    Map<Character, Character> braceMap = Map.of('(', ')', '{', '}', '[', ']');

    /**
     * 判断有效的括号方法
     *
     * @param : 1 <= s.length <= 10^4
     *          s 仅由括号 '()[]{}' 组成
     */
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) // 奇数字符长度不可能完全匹配，减少长字符匹配校验的一个优化
            return false;

        Set<Character> keys = braceMap.keySet(); // 左括号作为键值的集合
        LinkedList<Character> bufferStack = new LinkedList<>(); // 匹配缓冲堆栈

        // 按逐字符进行循环匹配
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (keys.contains(c)) { // 左括号加入堆栈
                bufferStack.push(c);
            } else if (bufferStack.isEmpty() || c != braceMap.get(bufferStack.pop())) {
                // 如果是右括号，堆栈顶应该是与之匹配的左括号
                // 返回fasle的条件：缓冲堆栈为空，没有匹配的左括号；当前字符与缓冲堆栈栈顶元素作为key对应的右括号不相同。
                return false;
            }
        }

        return bufferStack.isEmpty(); // 正确匹配缓冲堆栈为空
    }

}
