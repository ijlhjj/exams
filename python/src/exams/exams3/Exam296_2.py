""" 296-特殊数组 II

"""

from bisect import bisect_left
from bisect import bisect_right
from typing import List


def isArraySpecial(nums: List[int], queries: List[List[int]]) -> List[bool]:
    # 定义集合存储相邻元素奇偶性相同的下标，因为连续相同的元素会添加重复下标。
    # 这里对奇数对和偶数对需要使用不同集合，因为连续的两个奇数和连续两个偶数在一个集合中会造成错误。
    evenSameIndexs = set()
    oddSameIndexs = set()

    # 遍历列表元素（截止倒数第2个），添加奇偶性相同的下标到集合中
    l = len(nums)
    i = 0
    while i < l - 1:
        rem = nums[i] % 2
        if rem == nums[i + 1] % 2:
            if rem == 0:
                evenSameIndexs.add(i)
                evenSameIndexs.add(i + 1)
            else:
                oddSameIndexs.add(i)
                oddSameIndexs.add(i + 1)
        i += 1

    # 转为列表并排序
    evenSameList = list(evenSameIndexs)
    evenSameList.sort()

    oddSameList = list(oddSameIndexs)
    oddSameList.sort()

    answer = []  # 定义结果列表
    # 循环处理输入的分片
    for pair in queries:
        # 使用二分查找计算分片在下标列表的左右边界
        left = bisect_left(evenSameList, pair[0])
        right = bisect_right(evenSameList, pair[1])
        diff = right - left
        # 使用边界差值进行判断，相邻元素奇偶性相同的下标都在列表中。
        # 所以如果差值超过2则一定包含1组相邻的 奇偶性相同 元素。
        # 小于2一定不包含 奇偶性相同 元素
        # 等于2则需要判断是包含2个相邻元素下标还是包含一组元素的结尾和另一组元素的开头，判断2个下标是否相邻即可
        if diff > 2:
            answer.append(False)
        elif diff == 2 and evenSameList[right - 1] == evenSameList[left] + 1:
            answer.append(False)
        else:
            left = bisect_left(oddSameList, pair[0])
            right = bisect_right(oddSameList, pair[1])
            diff = right - left
            if diff > 2:
                answer.append(False)
            elif diff == 2 and oddSameList[right - 1] == oddSameList[left] + 1:
                answer.append(False)
            else:
                answer.append(True)

    return answer
