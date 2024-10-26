""" 72-k-avoiding 数组的最小总和

"""


def minimum_sum(n: int, k: int) -> int:
    exclude_nums = set()
    nums = []

    c = 0
    num = 0
    while c < n:
        num += 1
        if num not in exclude_nums:
            nums.append(num)
            exclude_nums.add(k - num)
            c += 1

    return sum(nums)
