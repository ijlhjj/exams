from unittest import TestCase

from exams.exams1.Exam94 import minimum_operations


class TestExam(TestCase):

    def test_minimum_operations(self):
        self.assertEqual(2, minimum_operations('2245047'))
        self.assertEqual(3, minimum_operations('2908305'))
        self.assertEqual(1, minimum_operations('10'))
        self.assertEqual(0, minimum_operations('0'))  # 第一次提交答案错误
