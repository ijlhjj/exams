package exams.exams1;

/**
 * 2-回文数
 *
 * @author ijlhjj
 * @version 1.0 2023-06-11
 */
public class Exam2 {

    public boolean isPalindrome(int x) {
        String text = x + "";
        StringBuilder sb = new StringBuilder(text);
        sb.reverse(); //原地反转
        return text.equals(sb.toString());
    }

}
