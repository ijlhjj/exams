/* 82-在排序数组中查找数字 I
 *
 */

#include <assert.h>

int search(int *nums, int numsSize, int target)
{
    int c = 0;

    for (int i = 0; i < numsSize; i++)
    {
        if (*(nums + i) == target)
            c++;
        else if (c > 0)
            break;
    }

    return c;
}

int main(int argc, char const *argv[])
{
    int nums[] = {5, 7, 7, 8, 8, 10};
    int c = search(nums, 6, 8);
    assert(c == 2);

    return 0;
}
