#include "exams3.h"

vector<int> findPeaks(vector<int> &mountain)
{
    vector<int> indexs;

    for (int i = 1; i < mountain.size() - 1; i++)
    {
        if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1])
            indexs.push_back(i);
    }

    return indexs;
}
