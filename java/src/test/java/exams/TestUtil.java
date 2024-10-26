package exams;

import cn.hutool.core.util.StrUtil;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestUtil {
    public static final String CHARSET_NAME = "UTF-8";
    public static final String SEP = ",";

    /**
     * 从文件中读取整型数组，文件内容必须符合固定格式
     */
    public static int[] readIntArray(String filename) throws IOException {
        File file = getResource(filename);

        String content = FileUtils.readFileToString(file, CHARSET_NAME); //读取文件内容
        String[] numStr = content.split(SEP); //按分隔符切分为字符数组
        return Arrays.stream(numStr).mapToInt(Integer::parseInt).toArray(); //把字符数组转为整型数组
    }

    /**
     * 从文件中读取整型二维数组，文件内容必须符合固定格式
     * 数组必须是矩阵，即 m*n 模式，每行的元素数相同，不支持变长数组
     */
    public static int[][] readMatrix(String filename) throws IOException {
        File file = getResource(filename);
        String content = FileUtils.readFileToString(file, CHARSET_NAME); //读取文件内容

        content = content.trim(); //去首尾空格
        content = content.replaceAll("\\[\\s*\\[", "["); //去开头的外层封装
        content = content.replaceAll("]\\s*]", "]"); //去结尾的外层封装

        int m = StrUtil.count(content, '['); //统计 '[' 字符数量作为第一维度大小
        int n = 0; //内容解析之前第二维度大小不确定

        List<int[]> matrix = new ArrayList<>(); //此处使用列表存储解析结果

        int start = 0, end = 0; //每行数组元素的起止下标
        while (start >= 0) { //起始下标 查找不到（-1）时不再处理
            start = content.indexOf('[', end); //从上次处理的截止位置继续查找
            if (start != -1) { //找到行起始下标
                end = content.indexOf(']', start); //从起始下标往后查找截止下标
                if (end != -1) { //找到截止下标
                    String row = content.substring(start + 1, end); //截取当前行元素的字符串
                    String[] numStr = row.split(SEP); //按分隔符切分为字符数组
                    int[] nums = Arrays.stream(numStr).mapToInt(Integer::parseInt).toArray(); //把字符数组转为整型数组
                    matrix.add(nums);
                    n = nums.length; //赋值第二维度大小
                }
            }
        }

        //数组列表转为二维数组
        int[][] intMatrix = new int[m][n];
        for (int i = 0; i < matrix.size(); i++)
            intMatrix[i] = matrix.get(i);

        return intMatrix;
    }

    /**
     * 从文件中读取字符串列表，每行一个字符串
     */
    public static List<String> readLines(String filename) throws IOException {
        File file = getResource(filename);
        return FileUtils.readLines(file, CHARSET_NAME);//读取文件内容
    }

    /**
     * 根据文件相对路径获取类路径下的资源文件
     */
    private static File getResource(String filename) {
        //转换类相对路径为文件的绝对路径
        String path = TestUtil.class.getResource(filename).getPath();

        //Windows系统要去掉前缀 '/'
        if (path.startsWith("/"))
            path = path.substring(1);

        return new File(path);
    }

}
