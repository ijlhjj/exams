package exams.exams3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * 284-双模幂运算
 *
 * @author ijlhjj
 * @version 1.0 2024-07-20
 */
public class Exam284 {

    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> indexList = new ArrayList<>(); //结果下标列表

        //循环判断每组入参
        for (int i = 0; i < variables.length; i++) {
            int[] vars = variables[i];
            BigInteger a = BigInteger.valueOf(vars[0]); //转为大数处理防止溢出
            BigInteger m = BigInteger.valueOf(vars[3]);

            //按题目要求进行计算
            a = a.pow(vars[1]);
            a = a.mod(BigInteger.TEN);
            a = a.pow(vars[2]);
            a = a.mod(m);

            //判断是否符合题意
            if (a.intValue() == target)
                indexList.add(i);
        }

        return indexList;
    }

}
