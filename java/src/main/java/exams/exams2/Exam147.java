package exams.exams2;

/**
 * 147-HTML 实体解析器
 *
 * @author ijlhjj
 * @version 1.0 2023-11-23
 */
public class Exam147 {

    public String entityParser(String text) {
        String result = text.replace("&quot;", "\"");
        result = result.replace("&apos;", "\'");
        result = result.replace("&gt;", ">");
        result = result.replace("&lt;", "<");
        result = result.replace("&frasl;", "/");
        result = result.replace("&amp;", "&"); //这个需要放在最后，防止替换后干扰其他替换步骤

        return result;
    }

}
