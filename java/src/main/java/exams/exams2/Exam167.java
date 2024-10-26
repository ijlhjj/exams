package exams.exams2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 167-统计区间中的整数数目
 *
 * @author ijlhjj
 * @version 1.0 2023-12-16
 */
public class Exam167 {

    static class CountIntervals {
        boolean useA; // 使用 列表A 还是 列表B 标识
        // 列表保存不重叠区间，重叠区间做合并操作
        // 使用双列表避免 add 方法调用时多个区间合并的多次移位操作
        List<int[]> intervalsA;
        List<int[]> intervalsB;

        boolean flag; // count 是否最新值标识
        int count; //整数个数

        //区间比较器，先对比左边界，再对比右边界
        Comparator comparator = Comparator.comparing((int[] c) -> c[0]).thenComparing((int[] c) -> c[1]);

        public CountIntervals() {
            useA = true;
            intervalsA = new ArrayList<>();
            intervalsB = new ArrayList<>();

            flag = true;
            count = 0;
        }

        public void add(int left, int right) {
            flag = false; //每次调用 add 后 count 值需要重新计算

            List<int[]> intervals = currentIntervals(); //当前使用列表
            int[] interval = {left, right}; //待添加区间
            int index = Collections.binarySearch(intervals, interval, comparator); //二分查找

            //如果列表已包含当前区间，不需要处理
            if (index < 0) {
                index = -index - 1;
                int c = getC(index, intervals, interval);
                if (c == 0) {
                    //区间不重叠：直接增加当前区间
                    intervals.add(index, interval);
                } else if (c == 1) {
                    //只跟一个区间重叠：更新重叠区间边界
                    updateInterval(index, intervals, interval);
                } else {
                    //跟多个区间重叠：合并重叠区间
                    mergeInterval(index, interval);
                }
            }
        }

        /**
         * 时间复杂度：O(N)
         */
        public int count() {
            // count 是最新值直接返回，避免连续多次调用count方法的重复计算
            if (flag)
                return count;

            List<int[]> intervals = currentIntervals(); //当前使用列表

            int sum = 0;
            for (int[] pair : intervals) {
                sum += (pair[1] - pair[0] + 1);
            }

            // 计算后保存 count 值，设置旗标
            count = sum;
            flag = true;
            return sum;
        }

        /**
         * 获取重叠区间数量，只计算是否大于 1
         */
        private int getC(int index, List<int[]> intervals, int[] interval) {
            int c = 0;
            //是否跟左边区间重叠
            if (index > 0) {
                int[] preIntervals = intervals.get(index - 1);
                if (preIntervals[1] >= interval[0] - 1)
                    c++;
            }
            //是否跟右边相邻元素重叠
            if (index < intervals.size()) {
                int[] nextIntervals = intervals.get(index);
                if (interval[1] >= nextIntervals[0] - 1)
                    c++;
            }
            //是否跟右边间隔元素重叠
            if (index < intervals.size() - 1) {
                int[] nextIntervals = intervals.get(index + 1);
                if (interval[1] >= nextIntervals[0] - 1)
                    c++;
            }
            return c;
        }

        /**
         * 重叠区间数量为 1 时，更新重叠区间边界
         */
        private void updateInterval(int index, List<int[]> intervals, int[] interval) {
            //是否跟左边区间重叠
            if (index > 0) {
                int[] preIntervals = intervals.get(index - 1);
                if (preIntervals[1] >= interval[0] - 1) {
                    //查找时保证了左边界值正确，只更新右边界
                    preIntervals[1] = Math.max(preIntervals[1], interval[1]);
                }
            }
            //是否跟右边相邻元素重叠
            if (index < intervals.size()) {
                int[] nextIntervals = intervals.get(index);
                if (interval[1] >= nextIntervals[0] - 1) {
                    nextIntervals[0] = Math.min(nextIntervals[0], interval[0]);
                    nextIntervals[1] = Math.max(nextIntervals[1], interval[1]);
                }
            }
        }

        /**
         * 重叠区间数量大于 1 时，合并重叠区间
         */
        private void mergeInterval(int index, int[] interval) {
            List<int[]> currentIntervals = null; //当前使用列表
            List<int[]> willIntervals = null; //将要替换的列表
            if (useA) {
                currentIntervals = intervalsA;
                willIntervals = intervalsB;
            } else {
                currentIntervals = intervalsB;
                willIntervals = intervalsA;
            }
            willIntervals.clear(); //清空

            //加入前面不重叠区间
            for (int i = 0; i < index - 1; i++)
                willIntervals.add(currentIntervals.get(i));

            //合并重叠区间
            int currentIndex = index - 1;

            //前一个区间是否重叠
            if (currentIndex >= 0) {
                int[] preIntervals = currentIntervals.get(currentIndex);
                if (preIntervals[1] >= interval[0] - 1) {
                    interval[0] = preIntervals[0];
                    interval[1] = Math.max(preIntervals[1], interval[1]);
                } else {//不重叠直接加入
                    willIntervals.add(currentIntervals.get(currentIndex));
                }
            }
            //currentIndex小于0时这个不能放在上面判断里
            currentIndex++;

            //后续重叠区间
            while (currentIndex < currentIntervals.size()) {
                int[] nextIntervals = currentIntervals.get(currentIndex);
                if (interval[1] >= nextIntervals[0] - 1) {
                    interval[1] = Math.max(nextIntervals[1], interval[1]);
                } else { //不重叠时跳出循环
                    break;
                }
                currentIndex++;
            }

            willIntervals.add(interval); //插入合并后的区间

            //加入后面不重叠区间
            for (; currentIndex < currentIntervals.size(); currentIndex++)
                willIntervals.add(currentIntervals.get(currentIndex));

            useA = !useA;
        }

        /**
         * 返回当前使用的列表
         */
        private List<int[]> currentIntervals() {
            if (useA)
                return intervalsA;
            else
                return intervalsB;
        }
    }

}
