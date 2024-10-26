package exams.exams2;

import java.util.HashMap;
import java.util.Map;

/**
 * 156-可获得的最大点数
 *
 * @author ijlhjj
 * @version 1.0 2023-12-03
 */
public class Exam156 {

    // 使用映射缓存避免递归的重复计算
    Map<Triple, Integer> maxScoreMap = new HashMap<>();

    /**
     * 双指针算法
     */
    public int maxScore(int[] cardPoints, int k) {
        // 使用尾部 k 张卡牌
        int sumScore = 0;
        for (int i = cardPoints.length - k; i < cardPoints.length; i++)
            sumScore += cardPoints[i];

        // 如果使用头部 卡牌 的点数之和超过尾部卡牌，则更新可获得的最大点数
        int maxScore = sumScore;
        for (int i = 0, j = cardPoints.length - k; j < cardPoints.length; i++, j++) {
            sumScore = sumScore + cardPoints[i] - cardPoints[j];
            if (sumScore > maxScore)
                maxScore = sumScore;

        }

        return maxScore;
    }

    /**
     * 递归算法
     */
    public int maxScore1(int[] cardPoints, int k) {
        return maxScore(cardPoints, k, 0, cardPoints.length - 1);
    }

    private int maxScore(int[] cardPoints, int k, int left, int right) {
        // 基准条件
        if (k == 1)
            return Math.max(cardPoints[left], cardPoints[right]);

        // 缓存命中直接返回
        Triple key = new Triple(left, right, k);
        if (maxScoreMap.containsKey(key))
            return maxScoreMap.get(key);

        int maxFirst = cardPoints[left] + maxScore(cardPoints, k - 1, left + 1, right); // 包含头元素最大
        int maxLast = cardPoints[right] + maxScore(cardPoints, k - 1, left, right - 1); // 包含尾元素最大

        // 加入缓存
        int maxScore = Math.max(maxFirst, maxLast);
        maxScoreMap.put(key, maxScore);

        return maxScore;
    }

    record Triple(int left, int right, int k) {
    }

}
