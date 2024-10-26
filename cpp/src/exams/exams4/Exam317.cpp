#include "exams4.h"

string removeStars(string s)
{
    deque<char> d; // 用栈存储处理结果

    // 循环各个字符，发现 * 号移除一个栈元素
    for (auto c : s)
    {
        if (c == '*')
            d.pop_back();
        else
            d.push_back(c);
    }

    // 结果转为字符串返回
    string ans{d.begin(), d.end()};
    return ans;
}
