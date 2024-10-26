from unittest import TestCase

from exams.exams3.Exam220 import minimumPossibleSum


class Test(TestCase):

    def test_minimum_possible_sum(self):
        self.assertEqual(4, minimumPossibleSum(2, 3))
        self.assertEqual(4, minimumPossibleSum(2, 3))
        self.assertEqual(8, minimumPossibleSum(3, 3))
        self.assertEqual(156198582, minimumPossibleSum(39636, 49035))  # 第一次提交答案错误
        self.assertEqual(750000042, minimumPossibleSum(1000000000, 1000000000))  # 第二次提交超时
        self.assertEqual(91, minimumPossibleSum(13, 50))  # 第三次提交答案错误
