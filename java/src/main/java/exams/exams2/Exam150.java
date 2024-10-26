package exams.exams2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 147-网格中的最小路径代价
 *
 * @author ijlhjj
 * @version 1.0 2023-11-22
 */
public class Exam150 {

    class Node {
        public int i; //行坐标
        public int val;
        public List<Edge> edges = new ArrayList<>();

        public Node(int i, int val) {
            this.i = i;
            this.val = val;
        }
    }

    class Edge {
        public int val;
        public Node to;

        public Edge(int val, Node to) {
            this.val = val;
            this.to = to;
        }
    }

    //使用映射避免递归的重复计算
    private final Map<Node, Integer> nodeMinWeight = new HashMap<>();

    public int minPathCost(int[][] grid, int[][] moveCost) {
        int m = grid.length;
        int n = grid[0].length;

        Map<Integer, Node> nodeMap = new HashMap<>(); //使用映射辅助节点查找
        //根据入参创建节点数组
        Node[][] nodes = new Node[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nodes[i][j] = new Node(i, grid[i][j]); //创建对应节点
                nodeMap.put(grid[i][j], nodes[i][j]); //同步加入映射
            }
        }

        for (int i = 0; i < moveCost.length; i++) {
            for (int j = 0; j < moveCost[0].length; j++) {
                Node from = nodeMap.get(i); //根据题意，此处获取 值为 i 的单元格（节点）

                //最后一行不创建 to 节点
                Node to = null;
                if (from.i < m - 1) {
                    to = nodes[from.i + 1][j]; // 值为 i 的单元格 的 下一行第 j 列单元格
                }

                int val = moveCost[i][j];

                //创建 edge 并加入 from 的边列表
                Edge edge = new Edge(val, to);
                from.edges.add(edge);
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            //循环计算第一行每一节点的 最小路径代价
            int weightSum = weightSum(nodes[0][i], m - 1); //此处使用 m - 1
            if (weightSum < min) min = weightSum;
        }

        return min;
    }

    /**
     * 递归计算 到达 最后一行 任意单元格的最小路径代价。初始 m 限定为最后一行的索引
     */
    private int weightSum(Node node, int m) {
        if (node.i == m) return node.val; //最后一行返回节点值

        //已计算过的直接返回缓存结果
        if (nodeMinWeight.containsKey(node)) {
            return nodeMinWeight.get(node);
        }

        //不是最后一行 递归计算 值之和 加上 所有移动的 代价之和
        int min = Integer.MAX_VALUE;
        for (Edge edge : node.edges) {
            int weightSum = edge.val + weightSum(edge.to, m);
            if (weightSum < min) min = weightSum; //只保存最小值
        }

        int minWeight = node.val + min; //返回 当前节点值 加上 所有移动的 代价之和
        nodeMinWeight.put(node, minWeight); //加入缓存

        return minWeight;
    }

}
