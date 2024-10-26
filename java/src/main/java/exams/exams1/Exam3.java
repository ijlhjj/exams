package exams.exams1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 3-罗马数字转整数
 *
 * @author ijlhjj
 * @version 1.0 2023-06-22
 */
public class Exam3 {

    private Map<String, Integer> romanIntMap = new HashMap<>();
    private Set<String> romanNum = Set.of("IV", "IX", "XL", "XC", "CD", "CM");

    {
        romanIntMap.putAll(Map.of("I", 1, "V", 5, "X", 10, "L", 50, "C", 100, "D", 500, "M", 1000));
        romanIntMap.putAll(Map.of("IV", 4, "IX", 9, "XL", 40, "XC", 90, "CD", 400, "CM", 900));
    }

    public int romanToInt(String s) {
        if (s.length() == 1) { //只有1位直接转换
            return romanIntMap.get(s);
        }

        char[] chars = s.toCharArray(); //拆分为字符数组

        int num = 0; //转换后的值
        int index = 0; //处理索引位
        StringBuilder sb = new StringBuilder(""); //临时变量

        //每次循环可能处理两位，所以索引最大是倒数第2位，避免下标越界
        while (index < chars.length - 1) {
            sb.append(chars[index]).append(chars[index + 1]); //取2个字符
            if (romanNum.contains(sb.toString())) { //如果是2位罗马数字，数字计和后索引多加1位
                num += romanIntMap.get(sb.toString());
                index++;
            } else { //不是2位罗马数字只计和
                num += romanIntMap.get(String.valueOf(chars[index]));
            }
            sb.setLength(0); //清空
            index++; //索引加1
        }

        //循环对结尾不是2位罗马数字的最后一位没有处理，在这里处理最后1位
        if (index < chars.length) {
            num += romanIntMap.get(String.valueOf(chars[index]));
        }

        return num;
    }

}
