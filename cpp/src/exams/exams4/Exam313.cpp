#include "exams4.h"

string clearDigits(string s)
{
	deque<char> d;

	for (auto c : s)
	{
		if ('0' <= c && c <= '9')
			d.pop_back();
		else
			d.push_back(c);
	}

	string ans;
	for (auto c : d)
		ans.push_back(c);

	return ans;
}
