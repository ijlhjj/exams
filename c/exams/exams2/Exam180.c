/* 180-最大化数组末位元素的最少操作次数
 *
 */

#include <assert.h>

// 定义最小值宏
#define min(a, b) (((a) < (b)) ? (a) : (b))
// 定义最大值宏
#define max(a, b) (((a) > (b)) ? (a) : (b))

/* 查找数组最大值函数 */
int maxOfArray(int *nums, int numsSize)
{
    int max = nums[0];
    for (int i = 1; i < numsSize; i++)
    {
        if (nums[i] > max)
            max = nums[i];
    }
    return max;
}

int minOperations(int *nums1, int nums1Size, int *nums2, int nums2Size)
{
    int last1 = nums1[nums1Size - 1];
    int last2 = nums2[nums2Size - 1];

    // 如果最后一个元素相等，判断最后一个元素是否所在数组最大值
    if (last1 == last2)
    {
        if (maxOfArray(nums1, nums1Size) != last1)
            return -1;

        if (maxOfArray(nums2, nums2Size) != last2)
            return -1;
    }

    int maxLast = max(last1, last2); // 最后元素较大者
    int minLast = min(last1, last2); // 最后元素较小者

    int c1 = 0; // 最后元素不交换的次数
    int c2 = 1; // 最后元素交换的次数

    // 遍历数组元素统计交换次数
    for (int i = 0; i < nums1Size - 1; i++)
    {
        int n1 = nums1[i];
        int n2 = nums2[i];

        // 两个元素都大于最后元素较小者，无法满足题意
        if (n1 > minLast && n2 > minLast)
            return -1;

        // 两个元素有大于最后元素较大者，无法满足题意
        if (n1 > maxLast || n2 > maxLast)
            return -1;

        // 两个元素相等，不需要交换
        if (n1 == n2)
            continue;

        if (n1 > last1 || n2 > last2)
            // 最后元素不交换，则元素大于最后元素时交换记数加 1
            c1++;
        else if (n1 > last2 || n2 > last1)
            // 最后元素交换，则元素大于交换后的最后元素时交换记数加 1
            c2++;
    }

    // 返回两个记数中较小者
    return min(c1, c2);
}

int main(int argc, char const *argv[])
{
    int nums1[] = {1, 2, 7};
    int nums2[] = {4, 5, 3};
    assert(minOperations(nums1, 3, nums2, 3) == 1);

    return 0;
}
