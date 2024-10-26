from unittest import TestCase

from exams.exams1.Exam65 import three_sum_closest


class TestExam(TestCase):

    def test_three_sum_closest(self):
        self.assertEqual(2, three_sum_closest([-1, 2, 1, -4], 1))
        self.assertEqual(0, three_sum_closest([0, 0, 0], 1))
        self.assertEqual(3, three_sum_closest([0, 1, 2], 0))  # 第1次提交解答错误
