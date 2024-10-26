package exams.exams3;

/**
 * 293-实现一个魔法字典
 *
 * @author ijlhjj
 * @version 1.0 2024-08-12
 */
public class Exam293 {

    static class MagicDictionary {

        private char[][] dictChars;

        public MagicDictionary() {
        }

        public void buildDict(String[] dictionary) {
            //创建字符数组，并把字符串数组转换为二维字符数组，因为 buildDict 仅在 search 之前调用一次
            dictChars = new char[dictionary.length][];
            for (int i = 0; i < dictionary.length; i++) {
                dictChars[i] = dictionary[i].toCharArray();
            }
        }

        public boolean search(String searchWord) {
            char[] chars = searchWord.toCharArray(); //查找字符串转为字符数组

            //循环对比字典值
            for (int i = 0; i < dictChars.length; i++) {
                char[] dict = dictChars[i];

                //长度不一致的不符合题意
                if (chars.length != dict.length)
                    continue;

                int c = 0;
                for (int j = 0; j < chars.length; j++) {
                    if (chars[j] != dict[j])
                        c++;
                    //差异超过1不用继续比对
                    if (c > 1)
                        break;
                }

                //符合题意返回 true
                if (c == 1)
                    return true;
            }

            //全部对比完没有符合题意的元素返回false
            return false;
        }
    }

}
