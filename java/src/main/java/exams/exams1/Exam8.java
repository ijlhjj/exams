package exams.exams1;

/**
 * 8-寻找两个正序数组的中位数
 * <p>
 * 时间复杂度为 O(n)，不满足题目要求的 O(log (m+n))
 *
 * @author ijlhjj
 * @version 1.0 2023-07-01
 */
public class Exam8 {

    /**
     * 查找两个正序数组的 中位数
     * 时间复杂度为： O(n/2)
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lenMerge = nums1.length + nums2.length;
        int[] nums = new int[lenMerge]; // 输入保证 1 <= lenMerge <= 2000

        // 一次循环合并两个数组，保证合并后数组仍然有序
        for (int i = 0, l1 = 0, l2 = 0; i <= lenMerge / 2; i++) {
            if (l1 < nums1.length && l2 < nums2.length) {
                // 两个数组都还有元素，取两者之中小的。相等的情况下任一取值不影响求中值计算。
                // 此处使用 三元运算符 代替 if-else 结构
                nums[i] = (nums1[l1] < nums2[l2]) ? nums1[l1++] : nums2[l2++];
            } else if (l1 < nums1.length) { // nums1 还有元素
                nums[i] = nums1[l1++];
            } else { // nums2 还有元素
                nums[i] = nums2[l2++];
            }
        }

        // 中值：奇数大小序列 取正中间元素，偶数大小序列 取最中间的两个数值的平均数
        // return (lenMerge % 2 == 1) ? nums[lenMerge / 2] : ((nums[lenMerge / 2] + nums[lenMerge / 2 - 1]) / 2.0);
        if (lenMerge % 2 == 1) {
            return nums[lenMerge / 2];
        } else {
            // 输入保证 1 <= lenMerge <= 2000，所以进入这个分支 lenMerge >= 2，以下计算不会下标越界
            return (nums[lenMerge / 2] + nums[lenMerge / 2 - 1]) / 2.0;
        }
    }

}
