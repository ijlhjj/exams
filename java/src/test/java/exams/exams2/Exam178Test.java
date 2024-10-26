package exams.exams2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Exam178Test {

    Exam178 exam = new Exam178();

    @Test
    void findHighAccessEmployees1() {
        List<List<String>> access_times = new ArrayList<>();

        access_times.add(List.of("a", "0549"));
        access_times.add(List.of("b", "0457"));
        access_times.add(List.of("a", "0532"));
        access_times.add(List.of("a", "0621"));
        access_times.add(List.of("b", "0540"));

        assertArrayEquals(new String[]{"a"}, exam.findHighAccessEmployees(access_times).toArray(new String[0]));
    }

    @Test
    void findHighAccessEmployees2() {
        List<List<String>> access_times = new ArrayList<>();

        access_times.add(List.of("d", "0002"));
        access_times.add(List.of("c", "0808"));
        access_times.add(List.of("c", "0829"));
        access_times.add(List.of("e", "0215"));
        access_times.add(List.of("d", "1508"));

        access_times.add(List.of("d", "1444"));
        access_times.add(List.of("d", "1410"));
        access_times.add(List.of("c", "0809"));

        assertArrayEquals(new String[]{"c", "d"}, exam.findHighAccessEmployees(access_times).toArray(new String[0]));
    }

    @Test
    void findHighAccessEmployees3() {
        List<List<String>> access_times = new ArrayList<>();

        access_times.add(List.of("cd", "1025"));
        access_times.add(List.of("ab", "1025"));
        access_times.add(List.of("cd", "1046"));
        access_times.add(List.of("cd", "1055"));
        access_times.add(List.of("ab", "1124"));
        access_times.add(List.of("ab", "1120"));

        assertArrayEquals(new String[]{"cd", "ab"}, exam.findHighAccessEmployees(access_times).toArray(new String[0]));
    }

    @Test
    void findHighAccessEmployees4() {
        List<List<String>> access_times = new ArrayList<>();
        access_times.add(List.of("kchzzdso", "2329"));
        access_times.add(List.of("kchzzdso", "2326"));
        access_times.add(List.of("kchzzdso", "2329"));

        assertArrayEquals(new String[]{"kchzzdso"}, exam.findHighAccessEmployees(access_times).toArray(new String[0]));
    }

}
