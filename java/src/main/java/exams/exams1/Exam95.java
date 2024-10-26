package exams.exams1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 95-课程表 IV
 *
 * @author ijlhjj
 * @version 1.0 2023-09-12
 */
public class Exam95 {

    /**
     * 创建辅助的 二元组 集合
     */
    private static class Pair {
        public Set<Integer> inner = new HashSet<>();
        public Set<Integer> outer = new HashSet<>();
    }

    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        //创建课程数组
        Pair[] courses = new Pair[numCourses];
        for (int i = 0; i < numCourses; i++)
            courses[i] = new Pair();

        //按选修依赖创建课程之间先决依赖
        for (int i = 0; i < prerequisites.length; i++) {
            int[] requisites = prerequisites[i];
            //添加直接先决条件
            courses[requisites[0]].outer.add(requisites[1]);
            courses[requisites[1]].inner.add(requisites[0]);

            /* 添加间接先决条件 */
            Pair course = courses[requisites[0]];

            //所有父的子集都包含当前节点的子集
            for (int k : course.inner)
                courses[k].outer.addAll(course.outer);

            //所有子的父集都包含当前节点的父集，当前节点的子集包含所有子的子集
            for (int k : course.outer) {
                courses[k].inner.addAll(course.inner);
                course.outer.addAll(courses[k].outer);
            }
        }

        //根据上面的先决依赖关系，创建查询结果
        List<Boolean> flags = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            int[] qPair = queries[i];
            flags.add(courses[qPair[0]].outer.contains(qPair[1])); //判断先决依赖集合是否包含
        }

        return flags;
    }

}
