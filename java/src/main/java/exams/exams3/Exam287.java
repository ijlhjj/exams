package exams.exams3;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * 287-引爆最多的炸弹
 *
 * @author ijlhjj
 * @version 1.0 2024-07-22
 */
public class Exam287 {

    public int maximumDetonation(int[][] bombs) {
        int maxCount = 0; //引爆最多的炸弹数

        //循环穷举
        for (int i = 0; i < bombs.length; i++) {
            Queue<Integer> takeQueue = new LinkedList<>(); //待访问队列
            takeQueue.add(i);
            Set<Integer> visited = new HashSet<>(); //已访问集合
            visited.add(i);
            int count = 1;//已访问数量

            //队列不为空继续处理
            while (!takeQueue.isEmpty()) {
                int index = takeQueue.poll(); //当前引爆节点
                int[] curr = bombs[index];
                //遍历列表计算当前节点是否可以引爆
                for (int j = 0; j < bombs.length; j++) {
                    //跳过当前节点和已引爆节点
                    if (j != index && !visited.contains(j)) {
                        //计算距离差
                        int[] other = bombs[j];
                        long diffX = Math.abs(curr[0] - other[0]);
                        long diffY = Math.abs(curr[1] - other[1]);
                        long hypotenuse = (long) curr[2] * (long) curr[2];

                        //在引爆范围内，添加到引爆队列和访问集合，数量加 1
                        if (hypotenuse >= diffX * diffX + diffY * diffY) {
                            takeQueue.add(j);
                            visited.add(j);
                            count++;
                        }
                    }
                }
            }

            //可引爆更多炸弹时更新
            if (count > maxCount)
                maxCount = count;
        }

        return maxCount;
    }

}
