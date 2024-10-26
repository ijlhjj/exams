""" 235-修改后的最大二进制字符串

"""


def maximumBinaryString(binary: str) -> str:
    """ 双指针解法： 从左侧逐字符处理：
            发现 1 时不处理
            发现 00 时转换为 10
            发现 01 时找最右侧的字符 0 ，如果找到（双指针没有交叠），交换第二个字符 1 和最右侧的 0 ，然后转换 00 为 10
    """

    # 转为字符列表，逐字符处理
    chars = list(binary)

    # 双指针处理，左指针小于右指针时继续循环
    left = 0
    right = len(chars) - 1
    while left < right:
        # 发现字符 '1' ，不做处理。'1' 在可能的最左位置时最大
        if chars[left] == '1':
            left += 1
        else:
            # 发现字符 '0'，递减右指针，找右侧第一个字符 '0'
            while right > left and chars[right] != '0':
                right -= 1

            # 双指针相遇时退出循环
            if right <= left:
                break

            # 找到的最右侧 '0' 不是左指针位置。
            # 如果是 '00' 转为 '10'（只改变第一个字符即可）
            chars[left] = '1'
            left += 1

            # 如果不是 '00' ，则把第二个字符 '1' 和最右侧的 '0' 进行交换
            if chars[left] != '0':
                chars[left] = '0'
                chars[right] = '1'

    # 拼装结果返回
    return ''.join(chars)
