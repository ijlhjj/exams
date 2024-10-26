package exams.exams2;

import java.util.List;

/**
 * 195-美丽塔 I
 *
 * @author ijlhjj
 * @version 1.0 2024-01-24
 */
public class Exam195 {

    /**
     * 计算 美丽塔 高度和
     *
     * @param index 塔顶元素下标
     */
    private long sumHeights(int[] maxHeights, final int index) {
        long sum = 0;
        sum += maxHeights[index]; //塔顶

        //左山峰
        int i = index - 1;
        int limit = maxHeights[index];
        while (i >= 0) {
            if (maxHeights[i] < limit)
                limit = maxHeights[i];
            sum += limit;
            i--;
        }

        //右山峰
        i = index + 1;
        limit = maxHeights[index];
        while (i < maxHeights.length) {
            if (maxHeights[i] < limit)
                limit = maxHeights[i];
            sum += limit;
            i++;
        }

        return sum;
    }

    public long maximumSumOfHeights(List<Integer> maxHeights) {
        long maxSum = 0; //高度和的最大值

        //列表转为数组，效果一样，数组更直观
        int[] maxHeightsArr = new int[maxHeights.size()];
        for (int i = 0; i < maxHeightsArr.length; i++)
            maxHeightsArr[i] = maxHeights.get(i);

        //循环计算每个元素作为塔顶时的高度和，获取 高度和的最大值
        for (int i = 0; i < maxHeightsArr.length; i++) {
            long sum = sumHeights(maxHeightsArr, i);
            if (sum > maxSum)
                maxSum = sum;
        }

        return maxSum;
    }

    /**
     * 美丽塔 II
     * <p>
     * 只有以下条件不同，使题目不能使用 O(n^2) 算法解题
     * 1 <= n == maxHeights <= 10^5
     */
    public long maximumSumOfHeights2(List<Integer> maxHeights) {
        //列表转为数组，效果一样，数组更直观
        int[] maxHeightsArr = new int[maxHeights.size()];
        for (int i = 0; i < maxHeightsArr.length; i++)
            maxHeightsArr[i] = maxHeights.get(i);

        long maxSum = sumHeights(maxHeightsArr, 0);//高度和的最大值，初始化为第一个元素作为塔顶

        /* 这里有2个假定来减少计算次数：
         *     1、连续非递增元素值（相等或更小）作为塔顶不会获得更大的 高度和；
         *     2、连续非递减序列（相等或更大）后面元素作为塔顶 高度和 不会更小；
         */
        //循环计算中间元素作为塔顶时的高度和，获取 高度和的最大值
        for (int i = 1; i < maxHeightsArr.length - 1; i++) {
            // 当前元素是山峰的最后一个最大元素时计算 高度和
            if (maxHeightsArr[i] >= maxHeightsArr[i - 1] && maxHeightsArr[i] > maxHeightsArr[i + 1]) {
                // 连续交替元素不计算，示例： 9,8,9,8,9, ... 任意一个作为峰顶 高度和 都相等
                // maxHeightsArr[i - 1] == maxHeightsArr[i + 1] 必要限定
                if (i - 2 >= 0 && maxHeightsArr[i] == maxHeightsArr[i - 2] && maxHeightsArr[i - 1] == maxHeightsArr[i + 1])
                    continue;

                long sum = sumHeights(maxHeightsArr, i);
                if (sum > maxSum)
                    maxSum = sum;
            }
        }

        //计算最后一个元素作为塔顶的 高度和
        long sum = sumHeights(maxHeightsArr, maxHeightsArr.length - 1);
        if (sum > maxSum)
            maxSum = sum;

        return maxSum;
    }

}
