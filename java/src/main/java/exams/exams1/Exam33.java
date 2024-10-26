package exams.exams1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * 33-按分隔符拆分字符串
 *
 * @author ijlhjj
 * @version 1.0 2023-07-24
 */
public class Exam33 {

    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();

        String sep = Pattern.quote(Character.toString(separator)); // 翻译成文本模式字符串

        for (String word : words) {
            String[] sArr = word.split(sep);
            for (String s : sArr) {
                if (!"".equals(s)) result.add(s);
            }
        }

        return result;
    }

}
