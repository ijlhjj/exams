package exams.exams3;

import java.util.*;

/**
 * 217-受限条件下可到达节点的数目
 *
 * @author ijlhjj
 * @version 1.0 2024-03-02
 */
public class Exam217 {

    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        //受限 节点 转为 集合
        Set<Integer> restrictedSet = new HashSet<>();
        for (int c : restricted)
            restrictedSet.add(c);

        //以相邻节点存储树结构，双侧无向边
        Map<Integer, List<Integer>> nodes = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];

            //添加节点 a 的边
            List<Integer> aEdge = nodes.computeIfAbsent(a, k -> new ArrayList<>());
            aEdge.add(b);

            //添加节点 b 的边
            List<Integer> bEdge = nodes.computeIfAbsent(b, k -> new ArrayList<>());
            bEdge.add(a);
        }

        //广度优先遍历
        Set<Integer> visitSet = new HashSet<>();  //已访问节点集合
        Queue<Integer> queue = new LinkedList<>(); //待访问队列
        queue.add(0); //初始添加节点 0
        int reached = 0; //可达节点初始为 0
        //队列不为空继续遍历，不可达节点不添加到队列
        while (!queue.isEmpty()) {
            //处理第一个可达节点
            Integer a = queue.poll();
            visitSet.add(a);
            reached++;

            //处理相邻节点
            List<Integer> childs = nodes.get(a);
            for (Integer b : childs) {
                //节点不在受限集合且未访问时添加到待访问队列
                if ((!restrictedSet.contains(b)) && (!visitSet.contains(b))) {
                    queue.offer(b);
                }
            }
        }

        return reached;
    }

}
