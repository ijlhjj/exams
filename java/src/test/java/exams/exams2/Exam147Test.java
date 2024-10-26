package exams.exams2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exam147Test {

    @Test
    void entityParser() {
        Exam147 exam = new Exam147();
        assertEquals("& is an HTML entity but &ambassador; is not.", exam.entityParser("&amp; is an HTML entity but &ambassador; is not."));
        assertEquals("and I quote: \"...\"", exam.entityParser("and I quote: &quot;...&quot;"));
        assertEquals("Stay home! Practice on Leetcode :)", exam.entityParser("Stay home! Practice on Leetcode :)"));
        assertEquals("x > y && x < y is always false", exam.entityParser("x &gt; y &amp;&amp; x &lt; y is always false"));
        assertEquals("leetcode.com/problemset/all", exam.entityParser("leetcode.com&frasl;problemset&frasl;all"));
        assertEquals("&gt;", exam.entityParser("&amp;gt;")); //第1次提交答案错误
    }

}
