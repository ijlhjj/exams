package exams.exams2;

import java.util.*;

/**
 * 116-奖励最顶尖的 K 名学生
 *
 * @author ijlhjj
 * @version 1.0 2023-10-11
 */
public class Exam116 {

    /**
     * 学生辅助类
     */
    class Student implements Comparable<Student> {
        public int id;
        public String[] reports;
        public int score;

        public Student(int id, String report) {
            this.id = id;
            this.reports = report.split(" ");
            this.score = 0; //初始分数为 0
        }

        /**
         * 按照得分 从高到低 ； 如果分数相同，ID 越小排名越前。
         */
        @Override
        public int compareTo(Student o) {
            if (score == o.score) return id - o.id;
            return o.score - score;
        }
    }

    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        //根据入参创建学生数组
        Student[] students = new Student[student_id.length];
        for (int i = 0; i < student_id.length; i++)
            students[i] = new Student(student_id[i], report[i]);

        //正负评价转为集合
        Set<String> positiveSet = toSet(positive_feedback);
        Set<String> negativeSet = toSet(negative_feedback);

        //遍历每个学生的评价，根据题意计算得分
        for (Student s : students)
            for (String r : s.reports) {
                if (positiveSet.contains(r)) s.score += 3;
                else if (negativeSet.contains(r)) s.score--;
            }

        //对学生数组进行排序，学生类按题目要求实现了排序方法
        Arrays.sort(students);

        //返回前 k 名学生的 id
        List<Integer> ids = new ArrayList<>();
        for (int i = 0; i < k; i++)
            ids.add(students[i].id);

        return ids;
    }

    /**
     * 字符串数组转集合
     */
    private Set<String> toSet(String[] feedback) {
        Set<String> feedbackSet = new HashSet<>();
        for (String feed : feedback)
            feedbackSet.add(feed);
        return feedbackSet;
    }

}
