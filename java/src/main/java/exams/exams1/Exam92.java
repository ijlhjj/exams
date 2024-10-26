package exams.exams1;

import java.util.Arrays;

/**
 * 92-修车的最少时间
 *
 * @author ijlhjj
 * @version 1.0 2023-09-07
 */
public class Exam92 {

    /**
     * 定义题目辅助 三元组 类
     */
    private static class Triple implements Comparable<Triple> {

        public final long x; //能力值，赋值后不可变
        public long y; //车辆数
        public long z; //耗费时间， z = x * y * y

        public Triple(long x) {
            this.x = x;
        }

        public Triple(long x, long y) {
            this.x = x;
            this.y = y;
            this.z = x * y * y;
        }

        public void setY(long y) {
            this.y = y;
            this.z = x * y * y;
        }

        //增加车辆数 1
        public void addOne() {
            this.y++;
            this.z = x * y * y;
        }

        //排序按 z->x->y 进行
        @Override
        public int compareTo(Triple o) {
            if (z == o.z) {
                if (x == o.x) return (int) (y - o.y);

                return (int) (x - o.x);
            }

            if (z > o.z) return 1;
            else return -1;
        }
    }

    public long repairCars(int[] ranks, int cars) {
        int n = cars / ranks.length; //车辆平均分配给所有机械工

        //创建对应 三元组 数组
        Triple[] triples = new Triple[ranks.length];
        for (int i = 0; i < ranks.length; i++)
            triples[i] = new Triple(ranks[i], n);

        Arrays.sort(triples); //排序，保证数组有序

        //对不能平均分配的车辆，加在数组前端
        int n1 = cars % ranks.length;
        for (int i = 0; i < n1; i++)
            triples[i].addOne();

        Arrays.sort(triples);

        //不断循环处理，直到循环中没有继续优化空间为止
        while (true) {
            int j = triples.length - 1;
            Triple eleLast = triples[j]; //取最后一个元素，它的 时长(z) 最大

            boolean flag = true; //旗标
            for (int i = 0; i < j; i++) {
                Triple ele = triples[i];

                //计算当前 机械工 增加 1辆车 是否可以获得更短时长
                long num = ele.x * (ele.y + 1) * (ele.y + 1);
                if (num < eleLast.z) {
                    flag = false; //设置旗标

                    ele.addOne(); //当前 机械工 增加 1辆车
                    eleLast.setY(eleLast.y - 1); //最后元素减少 1辆车

                    //最后元素往前 退 1，每次循环处理多个可能元素
                    j--;
                    eleLast = triples[j];
                }
            }

            Arrays.sort(triples); //排序，保证每次循环初始状态有序

            if (flag) break; //如果一次循环中没有发现更小值，则可以结束循环
        }

        return triples[triples.length - 1].z; //最后一个元素的值即为最短时长
    }

}
