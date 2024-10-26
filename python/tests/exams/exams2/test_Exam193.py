from unittest import TestCase

from exams.exams2.Exam193 import maximumSwap


class TestExam(TestCase):

    def test_maximum_swap(self):
        self.assertEqual(7236, maximumSwap(2736))
        self.assertEqual(9973, maximumSwap(9973))
        self.assertEqual(9913, maximumSwap(1993))  # 第1次提交答案错误
