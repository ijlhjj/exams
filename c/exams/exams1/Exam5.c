/* 5-有效的括号
 *
 */

#include <stdio.h>
#include <string.h>
#include <stdbool.h>

/* 根据左括号返回对应的右括号 */
char get_brace_pair(char c)
{
    switch (c)
    {
    case '(':
        return ')';
    case '{':
        return '}';
    case '[':
        return ']';
    default:
        return '\0';
    }
}

/* 判断有效的括号方法
 *
 * 1 <= s.length <= 10^4
 * s 仅由括号 '()[]{}' 组成
 */
bool is_valid(char *s)
{
    char c;                   // 存储临时对比字符
    int i;                    // 存储匹配缓冲堆栈的长度
    char buff[5000] = {'\0'}; // 匹配缓冲堆栈，极端情况下可能需要缓冲5000个左括号
    char *pb = buff;          // 缓冲堆栈指针

    // 奇数字符长度不可能完全匹配，减少长字符匹配校验的一个优化
    if (strlen(s) % 2 != 0)
        return false;

    i = 0;
    while ((*s) != '\0')
    {
        if ((*s) == '(' || (*s) == '{' || (*s) == '[')
        { // 左括号加入堆栈
            *pb++ = *s;
            i++;
        }
        else
        { // 如果是右括号，堆栈顶应该是与之匹配的左括号
            if (i < 1)
                return false;

            // 弹出堆栈顶元素
            c = *--pb;
            i--;

            // 对比当前字符与对应的右括号
            if ((*s) != get_brace_pair(c))
                return false;
        }

        s++; // 处理指针加1
    }

    return i == 0; // 正确匹配缓冲堆栈为空
}

int main(int argc, char const *argv[])
{
    char *s = "(]";
    printf("%d\n", is_valid(s));

    return 0;
}
