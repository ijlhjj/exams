""" 99-判断能否在给定时间到达单元格

"""


def is_reachable_at_time(sx: int, sy: int, fx: int, fy: int, t: int) -> bool:
    if sx == fx and sy == fy:
        return t != 1

    return abs(fx - sx) <= t and abs(fy - sy) <= t
