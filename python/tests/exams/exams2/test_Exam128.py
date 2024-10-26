from unittest import TestCase

from exams.exams2.Exam128 import hIndex


class TestExam(TestCase):

    def test_h_index(self):
        self.assertEqual(3, hIndex([3, 0, 6, 1, 5]))
        self.assertEqual(1, hIndex([1, 3, 1]))
        self.assertEqual(1, hIndex([1, 1]))  # 第1次提交答案错误
