package exams.exams3;

import java.util.*;

/**
 * 226-最小高度树
 *
 * @author ijlhjj
 * @version 1.0 2024-03-17
 */
public class Exam226 {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> roots = new ArrayList<>(); //返回结果列表

        //小于3个节点的特殊处理
        if (n < 3) {
            for (int i = 0; i < n; i++)
                roots.add(i);

            return roots;
        }

        //构建树结构
        Map<Integer, Set<Integer>> trees = new HashMap<>();
        for (int i = 0; i < n; i++) {
            trees.put(i, new HashSet<>());
        }

        //添加边链接
        for (var e : edges) {
            trees.get(e[0]).add(e[1]);
            trees.get(e[1]).add(e[0]);
        }

        //判断是否特殊的单边树（这个是投机取巧）
        int leaf = 0;
        int first = -1;
        int second = -1;
        for (int node : trees.keySet()) {
            Set<Integer> e = trees.get(node);
            if (e.size() < 2) {
                leaf++;
                second = first;
                first = node;
            } else if (e.size() > 2) {
                leaf = 3;
                break;
            }
        }

        //如果是2个叶节点的单链树
        if (leaf < 3) {
            //循环删除两边节点
            while (first != second) {
                Set<Integer> e1 = trees.get(first);
                int r1 = first;
                for (int node : e1) {
                    first = node;
                }
                if (first == second)
                    break;

                Set<Integer> e2 = trees.get(second);
                int r2 = second;
                for (int node : e2) {
                    second = node;
                }
                if (first == second)
                    break;

                trees.get(first).remove(r1);
                trees.get(second).remove(r2);
                trees.remove(r1);
                trees.remove(r2);
            }
        }

        //不断去除叶节点，最终找到中间节点
        while (trees.size() > 2) {
            Map<Integer, Set<Integer>> curr = new HashMap<>();
            for (int node : trees.keySet()) {
                Set<Integer> e = trees.get(node);
                if (e.size() < 2 && !curr.containsKey(node)) {
                    for (int n2 : e) {
                        trees.get(n2).remove(node);
                        curr.put(n2, trees.get(n2));
                    }
                } else {
                    curr.put(node, trees.get(node));
                }
            }
            trees = curr;
        }

        //处理结果加入列表
        for (int node : trees.keySet())
            roots.add(node);

        return roots;
    }

    public List<Integer> findMinHeightTrees2(int n, int[][] edges) {
        List<Integer> roots = new ArrayList<>(); //返回结果列表

        //小于3个节点的特殊处理
        if (n < 3) {
            for (int i = 0; i < n; i++)
                roots.add(i);

            return roots;
        }

        //构建树结构
        Map<Integer, List<Integer>> trees = new HashMap<>();
        for (int i = 0; i < n; i++) {
            trees.put(i, new ArrayList<>());
        }

        //添加边链接
        for (var e : edges) {
            trees.get(e[0]).add(e[1]);
            trees.get(e[1]).add(e[0]);
        }

        //循环计算树节点的高度
        int high = Integer.MAX_VALUE;
        for (int node : trees.keySet()) {
            //叶子节点不可能符合要求
            if (trees.get(node).size() > 1) {
                int h = highestPaths(trees, node); //计算当前树高度
                if (h == high) { //等于最小高度树，加入结果列表
                    roots.add(node);
                } else if (h < high) { //发现更小高度，更新结果
                    high = h;
                    roots.clear();
                    roots.add(node);
                }
            }
        }

        return roots;
    }

    /**
     * 计算当前树高度
     *
     * @param trees 树
     * @param root  根节点
     * @return 树的高度值
     */
    private int highestPaths(Map<Integer, List<Integer>> trees, int root) {
        int high = 0; //树的高度

        Set<Integer> visited = new HashSet<>(); //访问节点集合，避免重复访问
        List<Integer> level = new ArrayList<>();//待访问列表
        level.add(root);

        //待访问列表不为空时继续遍历
        while (!level.isEmpty()) {
            List<Integer> nextLevel = new ArrayList<>();
            //遍历当前层节点，加入访问集合
            for (int node : level) {
                visited.add(node);
                //遍历相邻节点，未访问的加入待访问队列
                List<Integer> neighbors = trees.get(node);
                for (int n : neighbors) {
                    if (!visited.contains(n))
                        nextLevel.add(n);
                }
            }

            high++;
            level = nextLevel;
        }

        return high;
    }

}
