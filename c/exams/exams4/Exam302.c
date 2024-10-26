/* 302-学生出勤记录 I
 *
 */

#include <stdbool.h>
#include <assert.h>

bool checkRecord(char *s)
{
    int ac = 0; // 定义 'A'：Absent，缺勤次数
    int lc = 0; // 定义 'L'：Late，迟到次数

    // 遍历直到结尾
    while ((*s) != '\0')
    {
        if (*s == 'A')
        {
            ac++;   // 增加缺勤次数
            lc = 0; // 缺勤是否归零这个题意中没有描述
        }
        else if (*s == 'L')
            lc++; // 增加迟到次数
        else
            lc = 0; // 到场时迟到不连续，次数归零

        // 缺勤 2 次或 连续迟到 3 次返回 false
        if (ac >= 2 || lc >= 3)
            return false;

        s++; // 指针推进
    }

    return true;
}

int main(int argc, char const *argv[])
{
    char *s = "PPALLP";
    assert(checkRecord(s) == true);

    return 0;
}
