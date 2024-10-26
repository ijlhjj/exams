package exams.exams2;

import java.util.*;

public class Exam158 {

    public long minimumFuelCost(int[][] roads, int seats) {
        //特殊情况处理，只包含一个首都城市
        if (roads.length == 0) return 0;

        Map<Integer, Set<Integer>> graph = new HashMap<>(); //城市节点的图表示

        //遍历道路数组，构建道路连通图
        for (int[] road : roads) {
            //添加第1个城市的邻居
            Set<Integer> edge0 = graph.get(road[0]);
            if (edge0 == null) edge0 = new HashSet<>();
            edge0.add(road[1]);
            graph.put(road[0], edge0);

            //添加第2个城市的邻居
            Set<Integer> edge1 = graph.get(road[1]);
            if (edge1 == null) edge1 = new HashSet<>();
            edge1.add(road[0]);
            graph.put(road[1], edge1);
        }

        long oil = 0; //油耗

        //深度遍历计算油耗
        Stack<Integer> citys = new Stack<>(); //城市节点栈
        citys.add(0);

        Map<Integer, Integer> distance = new HashMap<>(); //标记当前节点是否已遍历
        distance.put(0, 0);

        while (!citys.isEmpty()) {
            int index = citys.peek(); //没转移当前城市人员前不弹出
            int val = distance.get(index); //当前城市人数
            Set<Integer> neighbors = graph.get(index); //相邻城市

            //全部处理后根节点的邻居为空
            if (index == 0 && neighbors.isEmpty()) break;

            //无向图，只有一个邻居的为叶节点。初始根节点可能只有1个相邻城市
            if (index != 0 && neighbors.size() == 1) {
                oil += (long) Math.ceil(val * 1.0 / seats); //把当前城市人员转移到相邻城市的油耗
                citys.pop(); //叶节点弹出

                //处理叶节点的父节点（相邻节点）：人数增加当前城市人数，相邻移除当前节点
                for (int n : neighbors) {
                    distance.merge(n, val, Integer::sum);
                    Set<Integer> parent = graph.get(n);
                    parent.remove(index);
                }
            } else {
                for (int n : neighbors) {
                    //只增加未标记城市
                    if (!distance.containsKey(n)) {
                        citys.push(n);
                        distance.put(n, 1); //每个城市有1个人
                    }
                }
            }
        }

        return oil;
    }

}
