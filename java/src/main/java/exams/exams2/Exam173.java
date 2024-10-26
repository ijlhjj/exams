package exams.exams2;

import java.util.*;

/**
 * 173-在树上执行操作以后得到的最大分数
 *
 * @author ijlhjj
 * @version 1.0 2023-12-22
 */
public class Exam173 {

    //记录已访问节点集
    Set<Node> nodeSet = new HashSet<>();

    class Node {
        public int val;
        public List<Node> edges = new ArrayList<>();

        public Node(int val) {
            this.val = val;
        }
    }

    public long maximumScoreAfterOperations(int[][] edges, int[] values) {
        //根据入参创建节点列表
        List<Node> nodeList = new ArrayList<>();
        for (int val : values) {
            Node node = new Node(val);
            nodeList.add(node);
        }

        //根据入参添加节点间的边
        for (int[] edge : edges) {
            Node node1 = nodeList.get(edge[0]);
            Node node2 = nodeList.get(edge[1]);
            node1.edges.add(node2); //无向树两个节点都添加边
            node2.edges.add(node1);
        }

        long minSum = minEdge(nodeList.get(0)); //计算最小 健康树

        long sum = Arrays.stream(values).asLongStream().sum(); //计算节点总权重

        //总权重减去最小健康树既是可以获得的 最大分数
        return sum - minSum;
    }

    /**
     * 计算最小 健康树 权重
     * 如果从根节点出发，到任意叶子节点经过的路径上的节点值之和都不等于 0 ，那么我们称这棵树是 健康的 。
     */
    private long minEdge(Node root) {
        //无向树只有一条边的是叶子节点，边指向其父节点。
        //从根节点开始遍历，访问到叶子节点时其父节点必然已经访问
        if (root.edges.size() == 1 && nodeSet.contains(root.edges.get(0))) {
            return root.val;
        }

        nodeSet.add(root); //加入访问节点集

        //计算所有子树的最小 健康树 和
        long sum = 0;
        for (Node node : root.edges) {
            if (!nodeSet.contains(node)) {
                long minSum = minEdge(node);
                sum += minSum;
                nodeSet.add(node);
            }
        }

        //如果健康子树的和大于当前节点值，所有子树归0，保留当前节点值，依然是一棵健康树
        if (sum > root.val)
            return root.val;

        return sum; //否则返回健康子树和
    }

}
