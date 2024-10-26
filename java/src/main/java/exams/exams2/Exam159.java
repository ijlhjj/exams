package exams.exams2;

import java.util.*;

/**
 * 159-重新规划路线
 *
 * @author ijlhjj
 * @version 1.0 2023-12-07
 */
public class Exam159 {

    public int minReorder(int n, int[][] connections) {
        Map<Integer, List<Integer>> roadMap = new HashMap<>(); //路线
        Map<Integer, List<Integer>> neighbourMap = new HashMap<>(); //邻居，跟路线相反的指向

        //遍历道路数组，构建道路连通图
        for (int[] c : connections) {
            //添加城市的连通道路，这个是需要变更方向的列表
            List<Integer> roads = roadMap.get(c[0]);
            if (roads == null) roads = new ArrayList<>();
            roads.add(c[1]);
            roadMap.put(c[0], roads);

            //添加邻居列表，这个是道路连通的逆向，在遍历时不需要变更方向
            //比如 c = [1, 0] ，这里会在城市 0 的邻居列表添加 1 ，表示 1 不需要变更方向可以直接到达城市 0
            List<Integer> neighbours = neighbourMap.get(c[1]);
            if (neighbours == null) neighbours = new ArrayList<>();
            neighbours.add(c[0]);
            neighbourMap.put(c[1], neighbours);
        }

        int change = 0; //变更方向路线数

        Set<Integer> hasVisit = new HashSet<>(); //标记已访问集合
        Queue<Integer> cityQueue = new LinkedList(); //使用队列辅助遍历
        cityQueue.add(0); //初始添加城市 0

        //队列为空，表示所有城市都已遍历
        while (!cityQueue.isEmpty()) {
            int city = cityQueue.remove();
            hasVisit.add(city);

            //邻居列表直接添加到队列，不需要变更方向
            List<Integer> neighbours = neighbourMap.get(city);
            if (neighbours != null)
                for (int c : neighbours)
                    if (!hasVisit.contains(c))
                        cityQueue.add(c);

            //道路列表添加到队列，需要变更方向
            List<Integer> roads = roadMap.get(city);
            if (roads != null)
                for (int c : roads)
                    if (!hasVisit.contains(c)) {
                        cityQueue.add(c);
                        change++;
                    }
        }

        return change;
    }

}
