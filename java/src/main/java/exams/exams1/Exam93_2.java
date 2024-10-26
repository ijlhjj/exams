package exams.exams1;

import java.util.ArrayList;
import java.util.List;

/**
 * 93-课程表 II
 *
 * @author ijlhjj
 * @version 1.0 2023-09-10
 */
public class Exam93_2 {

    /**
     * 创建辅助的 二元组 列表
     */
    private static class Pair {
        public List<Integer> inner = new ArrayList<>();
        public List<Integer> outer = new ArrayList<>();
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> nums = new ArrayList<>();

        //创建课程数组
        Pair[] courses = new Pair[numCourses];
        for (int i = 0; i < numCourses; i++)
            courses[i] = new Pair();

        //按选修依赖创建课程之间的链接
        for (int i = 0; i < prerequisites.length; i++) {
            int[] requisites = prerequisites[i];
            courses[requisites[0]].outer.add(requisites[1]);
            courses[requisites[1]].inner.add(requisites[0]);
        }

        //循环处理，直到处理至不符合题目限定为止
        while (true) {
            //查找外联数组为空的课程，即不依赖其他先修课程即可以修习的课程
            Pair p = null;
            Integer index = -1; //这里使用包装类避免下面按索引删除元素
            for (int i = 0; i < courses.length; i++) {
                //内联为空的课程说明已经处理过或不需要处理
                if (courses[i].inner.size() < 1) continue;

                if (courses[i].outer.size() < 1) { //不依赖其他先修课程
                    p = courses[i];
                    index = i;
                    break;
                }
            }

            //没有可处理情况时退出循环
            if (p != null) {
                //把所有对此课程的依赖删除，然后清空依赖
                for (int i : p.inner)
                    courses[i].outer.remove(index);

                p.inner.clear();
                nums.add(index); //课程加入结果数组
            } else break;
        }

        //如果还存在对其他课程的依赖，则不能修完所有课程
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].outer.size() > 0) {
                return new int[0];
            }

            if (!nums.contains(i)) nums.add(i);
        }

        int[] courseArr = new int[nums.size()];
        for (int i = 0; i < courseArr.length; i++) {
            courseArr[i] = nums.get(i);
        }

        return courseArr;
    }

}
