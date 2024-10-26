package exams.exams4;

import java.util.Arrays;

/**
 * 326-以组为单位订音乐会的门票
 * 两种分配方式都是在可分配的情况下尽量靠左分配（座位编号最小），所以每排剩余座位都是右侧连续
 *
 * @author ijlhjj
 * @version 1.0 2024-09-28
 */
public class Exam326 {

    static class BookMyShow {

        // n 和 m 作为处理边界值
        private final int n;
        private final int m;

        private final int[] rowSurplusSeats; //每排剩余座位数
        private final long[] maxRowLimit; //当前排（包括）之前所有可用座位总和

        public BookMyShow(int n, int m) {
            this.n = n;
            this.m = m;

            //初始每排剩余 m 个座位
            rowSurplusSeats = new int[n];
            Arrays.fill(rowSurplusSeats, m);

            //可用座位等于前排座位和加上当前排座位数
            maxRowLimit = new long[n];
            maxRowLimit[0] = m; //第一排为 m
            for (int i = 1; i < n; i++)
                maxRowLimit[i] = maxRowLimit[i - 1] + rowSurplusSeats[i];
        }

        /**
         * 组座位联排
         */
        public int[] gather(int k, int maxRow) {
            //大于排座位或大于排座位和，直接返回
            if (k > m || k > maxRowLimit[maxRow])
                return new int[0];

            //从 最小 的排数开始查找可满足位置
            for (int i = 0; i <= maxRow; i++) {
                //如果当前排剩余座位可满足
                if (rowSurplusSeats[i] >= k) {
                    int[] ans = {i, m - rowSurplusSeats[i]}; //返回排数和列数

                    rowSurplusSeats[i] -= k; //当前排座位减少 k

                    //之后所有排座位和递减 k
                    for (int j = i; j < n; j++)
                        maxRowLimit[j] -= k;

                    return ans;
                }
            }

            return new int[0]; //没有找到满足要求时返回空
        }

        /**
         * 成员非联排插缝
         */
        public boolean scatter(int k, int maxRow) {
            //最大排的座位和不足以分配，直接返回
            if (k > maxRowLimit[maxRow])
                return false;

            int c = 0; //已分配座位数
            for (int i = 0; i <= maxRow; i++) {
                c += rowSurplusSeats[i]; //加当前排座位数
                if (c < k) {
                    //没有达到要求，当前排剩余座位为 0 ，总座位和为 0 （之前的座位已全部分配）
                    rowSurplusSeats[i] = 0;
                    maxRowLimit[i] = 0;
                } else {
                    rowSurplusSeats[i] = c - k; //最后分配的排不一定全部分配完

                    //之后所有排座位和递减 k
                    for (int j = i; j < n; j++)
                        maxRowLimit[j] -= k;

                    return true; //分配完返回 true
                }
            }

            //前置检查没有返回时一定可以满足座位分配。实际上会在循环中返回，不会执行到这里，但有的编译器必须在这里有返回语句。
            return true;
        }

    }

}
