package exams.exams2;

import java.util.ArrayList;
import java.util.List;

/**
 * 151-设计前中后队列
 *
 * @author ijlhjj
 * @version 1.0 2023-11-28
 */
public class Exam151 {

    static class FrontMiddleBackQueue {
        private List<Integer> vals; //使用列表存储内部数据。数据量1000以内对性能不会有太大影响

        public FrontMiddleBackQueue() {
            vals = new ArrayList<>(); //初始化列表
        }

        /**
         * 添加到队列的 最前面
         */
        public void pushFront(int val) {
            vals.add(0, val); //相当于插入位置0
        }

        /**
         * 添加到队列的 正中间
         */
        public void pushMiddle(int val) {
            //两个 中间位置 的时候，选择靠前面的位置进行操作
            int mid = vals.size() / 2;
            vals.add(mid, val);
        }

        /**
         * 添加到队里的 最后面
         */
        public void pushBack(int val) {
            vals.add(val); //相当于插入最后位置
        }

        /**
         * 将 最前面 的元素从队列中删除并返回值
         */
        public int popFront() {
            if (vals.isEmpty()) return -1; //队列为空，返回 -1

            return vals.remove(0);
        }

        /**
         * 将 正中间 的元素从队列中删除并返回值
         */
        public int popMiddle() {
            if (vals.isEmpty()) return -1; //队列为空，返回 -1

            //两个 中间位置 的时候，选择靠前面的位置进行操作。偶数个元素时，取前一个下标
            int mid = (vals.size() - 1) / 2;
            return vals.remove(mid);
        }

        /**
         * 将 最后面 的元素从队列中删除并返回值
         */
        public int popBack() {
            if (vals.isEmpty()) return -1; //队列为空，返回 -1

            return vals.remove(vals.size() - 1);
        }
    }

}
