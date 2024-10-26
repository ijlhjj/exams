package exams.exams4;

import java.util.*;

/**
 * 305-员工的重要性
 *
 * @author ijlhjj
 * @version 1.0 2024-08-26
 */
public class Exam305 {

    // Definition for Employee.
    static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;

        public Employee(int id, int importance, List<Integer> subordinates) {
            this.id = id;
            this.importance = importance;
            this.subordinates = subordinates;
        }
    }

    public int getImportance(List<Employee> employees, int id) {
        //使用Map提高查找效率
        Map<Integer, Employee> employeeMap = new HashMap<>();
        for (var e : employees) {
            employeeMap.put(e.id, e);
        }

        int total = 0;

        //增加当前员工
        Queue<Integer> idQueue = new LinkedList<>();
        idQueue.add(id);

        //使用队列逐层增加下属员工
        while (!idQueue.isEmpty()) {
            Employee emp = employeeMap.get(idQueue.poll());
            total += emp.importance;

            //一名员工最多有一名直接领导，所以这里不需要Set排除已访问
            idQueue.addAll(emp.subordinates);
        }

        return total;
    }

}
