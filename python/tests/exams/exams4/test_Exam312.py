from unittest import TestCase

from exams.exams4.Exam312 import countWays


class Test(TestCase):

    def test_count_ways(self):
        self.assertEqual(2, countWays([1, 1]))
        self.assertEqual(3, countWays([6, 0, 3, 3, 6, 7, 2, 7]))
        self.assertEqual(1, countWays([1, 1, 0, 1]))  # 第一次提交答案错误
