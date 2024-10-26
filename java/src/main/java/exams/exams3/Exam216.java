package exams.exams3;

/**
 * 216-使二叉树所有路径值相等的最小代价
 *
 * @author ijlhjj
 * @version 1.0 2024-02-28
 */
public class Exam216 {

    public int minIncrements(int n, int[] cost) {
        int c = 0; //操作次数

        //循环处理除根节点外的每一层
        while (n > 1) {
            //倒序处理每一层，每次处理2个节点
            for (int i = n / 2; i < n; i += 2) {
                c += Math.abs(cost[i] - cost[i + 1]); //相邻子节点的操作次数，取绝对值
                cost[i / 2] += Math.max(cost[i], cost[i + 1]); //父节点更新为父节点值加子节点较大的值
            }
            n /= 2; //更新处理索引上限
        }

        return c;
    }

}
