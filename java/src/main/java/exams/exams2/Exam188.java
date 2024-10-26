package exams.exams2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 188-构造限制重复的字符串
 *
 * @author ijlhjj
 * @version 1.0 2024-01-13
 */
public class Exam188 {

    public String repeatLimitedString(String s, int repeatLimit) {
        // 转为字符列表并倒排序
        char[] chars = s.toCharArray();

        LinkedList<Character> characterList = new LinkedList<>();
        for (char c : chars)
            characterList.add(c);

        Collections.sort(characterList, Comparator.reverseOrder());

        StringBuilder word = new StringBuilder(chars.length); // 定义结果字符串
        char prevChar = ' '; // 存储上一个字符，判断字符是否重复
        int repeatCount = 0; // 字符重复次数

        // 存在可用字符时继续处理
        while (!characterList.isEmpty()) {
            int index = 0; // 当前处理下标

            if (characterList.get(index) != prevChar) {
                // 字符不重复：加入结果列表，重复次数赋值为 1
                prevChar = characterList.get(index);
                word.append(prevChar);
                repeatCount = 1;
                characterList.remove(index);
            } else if (repeatCount < repeatLimit) {
                // 字符重复，重复次数不超限制：加入结果列表，重复次数加 1
                word.append(prevChar);
                repeatCount++;
                characterList.remove(index);
            } else {
                // 字符重复，重复次数达到限制
                ListIterator<Character> iter = characterList.listIterator();
                boolean flag = true;
                // 查找第一个不重复字符
                while (iter.hasNext()) {
                    char c = iter.next();
                    // 找到不重复字符：加入结果列表，重复次数赋值为 1
                    if (c != prevChar) {
                        prevChar = c;
                        word.append(prevChar);
                        repeatCount = 1;

                        iter.remove();
                        flag = false;
                        break;
                    }
                }

                // 找不到不重复字符，则处理完成，跳出循环
                if (flag)
                    break;
            }
        }

        return word.toString();
    }

}
