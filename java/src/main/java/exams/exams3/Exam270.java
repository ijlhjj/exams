package exams.exams3;

/**
 * 270-移除字符串中的尾随零
 *
 * @author ijlhjj
 * @version 1.0 2024-06-29
 */
public class Exam270 {

    public String removeTrailingZeros(String num) {
        StringBuilder sb = new StringBuilder(num);
        while (!sb.isEmpty() && sb.charAt(sb.length() - 1) == '0')
            sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

}
