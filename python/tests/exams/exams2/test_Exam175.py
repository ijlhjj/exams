from unittest import TestCase

from exams.exams2.Exam175 import minimumPerimeter


class TestExam(TestCase):

    def test_minimum_perimeter(self):
        self.assertEqual(8, minimumPerimeter(1))
        self.assertEqual(16, minimumPerimeter(13))
        self.assertEqual(5040, minimumPerimeter(1000000000))
        self.assertEqual(233920, minimumPerimeter(100000000000000))  # 第一次提交超时
        self.assertEqual(503968, minimumPerimeter(1000000000000000))
