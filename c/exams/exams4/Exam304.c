/* 304-两个字符串的排列差
 *
 */

#include <stdlib.h>
#include <string.h>
#include <assert.h>

int findPermutationDifference(char *s, char *t)
{
	int sum = 0;

	int len = strlen(s);
	for (int i = 0; i < len; i++)
	{
		char a = *(s + i);
		for (int j = 0; j < len; j++)
		{
			char b = *(t + j);
			if (a == b)
			{
				sum += abs(i - j);
				break;
			}
		}
	}

	return sum;
}

int main(int argc, char const *argv[])
{
	assert(findPermutationDifference("abc", "bac") == 2);

	return 0;
}
