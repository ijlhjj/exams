package exams.exams1;

/**
 * 10-N 字形变换
 *
 * @author ijlhjj
 * @version 1.0 2023-07-05
 */
public class Exam10 {

    public String convert(String s, int numRows) {
        // 只有1行直接返回
        if (numRows == 1) return s;

        // 使用一个可变字符数组存放处理数据
        StringBuilder[] sbArr = new StringBuilder[numRows];
        for (int i = 0; i < sbArr.length; i++) {
            sbArr[i] = new StringBuilder();
        }

        // 按逐字符进行循环处理
        // 行处理是按到达首尾进行 加1 和 减1 处理，因为第一次循环行为0，所以 step 初值为 -1
        char[] chars = s.toCharArray();
        for (int i = 0, row = 0, step = -1; i < chars.length; i++, row += step) {
            sbArr[row].append(chars[i]);

            // 到达第一行或最后一行，步长取负
            if (row == 0 || row == numRows - 1) {
                step = -step;
            }
        }

        // 逐行拼接最后结果
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sbArr.length; i++) {
            result.append(sbArr[i]);
        }

        return result.toString();
    }

}
