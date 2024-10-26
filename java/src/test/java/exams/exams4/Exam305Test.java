package exams.exams4;

import exams.exams4.Exam305.Employee;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam305Test {

    /**
     * 第一次提交答案错误
     */
    @Test
    void getImportance1() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, 5, List.of(2, 3)));
        employees.add(new Employee(2, 3, List.of(4)));
        employees.add(new Employee(3, 4, List.of()));
        employees.add(new Employee(4, 1, List.of()));

        Exam305 exam = new Exam305();
        assertEquals(13, exam.getImportance(employees, 1));
    }

}
