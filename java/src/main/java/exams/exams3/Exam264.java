package exams.exams3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * 264-价格减免
 *
 * @author ijlhjj
 * @version 1.0 2024-06-18
 */
public class Exam264 {

    public String discountPrices(String sentence, int discount) {
        //用列表存放转换后的结果列表
        List<String> wordList = new ArrayList<>();

        String[] words = sentence.split(" "); //按空格切分语句

        //折扣转换
        int dis = 100 - discount;
        BigDecimal per = BigDecimal.valueOf(dis);
        per = per.divide(BigDecimal.valueOf(100), 2, RoundingMode.UNNECESSARY);

        String regex = "^\\$\\d+$"; //定义价格匹配模式
        for (String s : words) {
            //符合价格正则的进行转为，不符合直接加入结果列表
            if (s.matches(regex)) {
                s = s.substring(1); //去除前缀 $

                //价格转换
                BigDecimal val = new BigDecimal(s);
                val = val.multiply(per);
                val = val.setScale(2, RoundingMode.UNNECESSARY);

                wordList.add("$" + val.toString()); //添加转换后的结果
            } else {
                wordList.add(s);
            }
        }

        return String.join(" ", wordList); //返回拼接后的结果
    }

}
