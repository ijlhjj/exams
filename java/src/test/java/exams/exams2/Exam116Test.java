package exams.exams2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class Exam116Test {

    @Test
    void topStudents() {
        Exam116 exam = new Exam116();
        assertIterableEquals(List.of(1, 2), exam.topStudents(new String[]{"smart", "brilliant", "studious"}, new String[]{"not"}, new String[]{"this student is studious", "the student is smart"}, new int[]{1, 2}, 2));
        assertIterableEquals(List.of(2, 1), exam.topStudents(new String[]{"smart", "brilliant", "studious"}, new String[]{"not"}, new String[]{"this student is not studious", "the student is smart"}, new int[]{1, 2}, 2));
    }

}
