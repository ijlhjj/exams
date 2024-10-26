package exams.exams2;

import exams.TestUtil;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam195Test {

    @Test
    void maximumSumOfHeights() {
        Exam195 exam = new Exam195();
        assertEquals(13, exam.maximumSumOfHeights(List.of(5, 3, 4, 1, 1)));
        assertEquals(22, exam.maximumSumOfHeights(List.of(6, 5, 3, 9, 2, 7)));
        assertEquals(18, exam.maximumSumOfHeights(List.of(3, 2, 5, 5, 2, 3)));
    }

    @Test
    void maximumSumOfHeights2() {
        Exam195 exam = new Exam195();
        assertEquals(13, exam.maximumSumOfHeights2(List.of(5, 3, 4, 1, 1)));
        assertEquals(22, exam.maximumSumOfHeights2(List.of(6, 5, 3, 9, 2, 7)));
        assertEquals(18, exam.maximumSumOfHeights2(List.of(3, 2, 5, 5, 2, 3)));
        assertEquals(19, exam.maximumSumOfHeights2(List.of(6, 5, 2, 1, 5, 4, 4, 2))); //第1次提交答案错误
        assertEquals(22, exam.maximumSumOfHeights2(List.of(3, 5, 3, 5, 1, 5, 4, 4, 4))); //第3次提交答案错误
    }

    /**
     * 第2次提交超时
     */
    @Test
    void maximumSumOfHeights3() throws IOException {
        Exam195 exam = new Exam195();
        int[] nums = TestUtil.readIntArray("../exams2_Exam195Test_1.txt");
        List<Integer> maxHeights = Arrays.stream(nums).boxed().toList();
        // 本地可完成，提交服务器会超时
        //assertEquals(800001, exam.maximumSumOfHeights(maxHeights));
        assertEquals(800001, exam.maximumSumOfHeights2(maxHeights));
    }

}
