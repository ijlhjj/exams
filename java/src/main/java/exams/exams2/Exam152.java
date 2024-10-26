package exams.exams2;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 152-无限集中的最小数字
 *
 * @author ijlhjj
 * @version 1.0 2023-11-29
 */
public class Exam152 {

    static class SmallestInfiniteSet {
        SortedSet<Integer> numSet;

        public SmallestInfiniteSet() {
            numSet = new TreeSet<>();
            //题述最多调用 1000 次，不会移除1000以上的数字，这里只添加1000以内的数字模拟 无限正整数集
            for (int i = 1; i <= 1000; i++)
                numSet.add(i);
        }

        public int popSmallest() {
            Integer num = numSet.first();
            numSet.remove(num);
            return num;
        }

        public void addBack(int num) {
            numSet.add(num);
        }
    }

}
