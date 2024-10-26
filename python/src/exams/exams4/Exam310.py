""" 310-考试的最大困扰度

"""


def maxConsecutiveAnswers(answerKey: str, k: int) -> int:
    n = len(answerKey)  # 字符串长度

    def maxLen(ch: str) -> int:
        """
            计算最多包含 k 个 ch 字符的最长子串长度
                使用双指针，包含 ch 字符少于 k ，则推进尾指针；等于 k 个，则持续推进首指针，直到少于 k 个
        """

        # 首指针 i ，尾指针 j ，ch 字符个数 c ，最长子串长度 ml
        i = j = c = ml = 0

        # 遍历尾指针至字符串结束
        while j < n:
            if answerKey[j] == ch:
                # 当前字符等于指定字符
                if c < k:
                    # 统计次数少于 k ，增加统计次数，推进尾指针
                    c += 1
                    j += 1
                else:
                    # 统计次数大于等于 k ，推进首指针，判断是否减少统计次数
                    if answerKey[i] == ch:
                        c -= 1
                    i += 1
            else:
                # 当前字符不同，推进尾指针
                j += 1

            # 如果长度更长，则更新
            if j - i > ml:
                ml = j - i

        return ml

    maxLen1 = maxLen('T')  # 计算最多包含 k 个 'T' 的最长长度
    if maxLen1 == n:
        return n

    maxLen2 = maxLen('F')  # 计算最多包含 k 个 'F' 的最长长度

    # 返回两个长度较大者
    return max(maxLen1, maxLen2)
