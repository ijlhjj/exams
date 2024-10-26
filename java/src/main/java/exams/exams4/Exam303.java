package exams.exams4;

/**
 * 303-数组最后一个元素的最小值
 *
 * @author ijlhjj
 * @version 1.0 2024-08-22
 */
public class Exam303 {

    public long minEnd(int n, int x) {
        //转为二进制字符串
        String bx = Integer.toBinaryString(x);
        String bn = Integer.toBinaryString(n - 1);

        StringBuilder sb = new StringBuilder(); //拼接字符串结果
        int i = bn.length() - 1; //bn最后一个字符下标
        int j = bx.length() - 1; //bx最后一个字符下标

        // bx中的每一位0可以表示2个数组元素
        // 倒序把bn个元素全部拼接到bx中
        while (i >= 0) {
            //bx的字符1原样拼接
            while (j >= 0 && bx.charAt(j) == '1') {
                sb.insert(0, '1');
                j--;
            }

            //bx中的0用bn的字符替换，如果bx没有剩余字符，直接拼接bn中剩余字符
            sb.insert(0, bn.charAt(i));
            i--;
            j--;
        }

        // 如果bx有剩余字符，直接拼接bx中剩余字符
        while (j >= 0) {
            sb.insert(0, bx.charAt(j));
            j--;
        }

        //结果转为数字
        return Long.parseLong(sb.toString(), 2);
    }

}
