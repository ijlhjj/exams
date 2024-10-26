/* 75-替换空格
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <assert.h>

char *replaceSpace(char *s)
{
    char *r = calloc(30000, sizeof(char)); /* 申请返回数组空间 */

    while (*s != '\0')
    {
        if (*s != ' ')
            strncat(r, s, 1);
        else
            strcat(r, "%20");

        s++;
    }
    strcat(r, "\0");

    return r;
}

int main(int argc, char const *argv[])
{
    char *s = "We are happy.";
    char *actual = replaceSpace(s);

    char *expected = "We%20are%20happy.";
    int c = strcmp(expected, actual);

    assert(c == 0);
    printf("%s %d", actual, c);

    return 0;
}
