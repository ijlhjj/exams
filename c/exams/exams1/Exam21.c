/* 21-盛最多水的容器
 *
 */

#include <stdio.h>

// 定义最小值宏
#define min(a, b) (((a) < (b)) ? (a) : (b))

/* 计算容器可以储存的最大水量
 *     最优算法（联机算法：仅需要常量空间并以线性时间运行的联机算法几乎是完美的算法）。时间复杂度 O(N)
 */
int maxArea(int *height, int heightSize)
{
    int max_volume = 0; // 最大容量值
    int volume;
    int val1, val2, min_val;

    int low = 0;
    int high = heightSize - 1;

    // 低位索引等于高位索引时数组遍历完
    while (low < high)
    {
        // 取2个索引位的较小元素
        val1 = *(height + low);
        val2 = *(height + high);
        min_val = min(val1, val2);

        // 计算较小元素的容量，此容量即为此元素的最大容量。
        // 每个元素的最大容量是与距离它最远的不小于它的元素之间的容量。
        volume = min_val * (high - low);

        // 更新最大容量
        if (volume > max_volume)
            max_volume = volume;

        // 较小的元素不需要再计算，相等时移动任一索引都可以。
        if (val1 < val2)
            low++;
        else
            high--;
    }

    return max_volume;
}

/* 计算容器可以储存的最大水量
 *     时间复杂度：O(n^2)
 */
int maxArea2(int *height, int heightSize)
{
    int max_volume = 0; // 最大容量值
    int volume;
    int min_val;

    // 双层循环计算所有可得到的容量，需要优化
    for (int i = 0; i < heightSize - 1; i++)
    {
        for (int j = i + 1; j < heightSize; j++)
        {
            min_val = min(*(height + i), *(height + j));
            volume = min_val * (j - i);

            if (volume > max_volume)
                max_volume = volume;
        }
    }

    return max_volume;
}

int main(int argc, char const *argv[])
{
    int nums[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    int nums_size = sizeof(nums) / sizeof(nums[0]);

    int max_volume = maxArea(nums, nums_size);
    printf("%d\n", max_volume);

    return 0;
}
