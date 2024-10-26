package exams.exams3;

import java.util.*;

/**
 * 231-有向无环图中一个节点的所有祖先
 *
 * @author ijlhjj
 * @version 1.0 2024-04-04
 */
public class Exam231 {

    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        //创建有向图的相邻节点存储
        List<List<Integer>> graphs = new ArrayList<>();
        for (int i = 0; i < n; i++)
            graphs.add(new ArrayList<>());

        //以逆向存储单向边，方便递归查找祖先节点
        for (int[] e : edges)
            graphs.get(e[1]).add(e[0]);

        //以集合列表方式存储每个节点的祖先节点集合
        List<Set<Integer>> ancestors = new ArrayList<>();
        for (int i = 0; i < n; i++) { //循环遍历每个节点
            Set<Integer> visited = new HashSet<>(); //已访问节点
            Queue<Integer> viesQueue = new LinkedList<>(); //待访问节点
            viesQueue.offer(i);

            //待访问队列不为空，则继续遍历
            while (!viesQueue.isEmpty()) {
                int k = viesQueue.poll();
                visited.add(k); //访问当前节点

                List<Integer> es = graphs.get(k); //获取所有相邻节点
                for (int e : es) {
                    if (!visited.contains(e)) { //相邻节点未访问
                        if (ancestors.size() > e) { //相邻节点已完成递归，则直接加入结果集合
                            visited.add(e); //加入相邻节点，相邻节点的祖先集合中不包括自己
                            visited.addAll(ancestors.get(e)); //加入相邻节点的祖先集合
                        } else { //相邻节点未递归
                            viesQueue.offer(e); //加入待访问队列
                        }
                    }
                }
            }

            //结果加入祖先集合，祖先集合不包括自身
            visited.remove(i);
            ancestors.add(visited);
        }

        //结果集处理，集合转为列表，排序
        List<List<Integer>> nodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> ps = ancestors.get(i);
            List<Integer> ns = new ArrayList<>(ps);
            Collections.sort(ns);
            nodes.add(ns);
        }

        return nodes;
    }

}
