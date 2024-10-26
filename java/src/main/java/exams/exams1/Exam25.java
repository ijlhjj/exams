package exams.exams1;

/**
 * 25-构造最长非递减子数组
 *
 * @author ijlhjj
 * @version 1.0 2023-07-16
 */
public class Exam25 {

    public int maxNonDecreasingLength(int[] nums1, int[] nums2) {
        int maxlen = 0;

        // 循环到不可能找到更长子数组时不需再进行
        // 在没有使用两个元素中较大者时可以前进统计长度步长
        for (int i = 0; i < nums1.length - maxlen; ) {
            int num = Math.min(nums1[i], nums2[i]); // 第一个元素使用两者中较小的
            int len = 1; // 统计长度设置为1
            boolean flag = false; // 是否使用两者中较大元素标识

            for (int j = i + 1; j < nums1.length; j++) {
                // 两者都小于前一元素时跳出循环
                if (nums1[j] < num && nums2[j] < num) break;

                // 两者都大于时取较小元素，否则取较大的同时设置标识
                if (nums1[j] >= num && nums2[j] >= num) {
                    num = Math.min(nums1[j], nums2[j]);
                } else {
                    num = Math.max(nums1[j], nums2[j]);
                    flag = true;
                }
                len++; // 长度加1
            }

            // 如果使用较大元素，步进1，否则步进统计长度 len
            if (flag) i++;
            else i += len;

            // 更新最长长度
            if (len > maxlen) maxlen = len;
        }

        return maxlen;
    }

}
