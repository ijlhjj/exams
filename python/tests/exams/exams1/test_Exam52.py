from unittest import TestCase

from exams.exams1.Exam52 import generate


class TestExam(TestCase):

    def test_generate1(self):
        triangle = [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
        self.assertListEqual(triangle, generate(5))

    def test_generate2(self):
        triangle = [[1]]
        self.assertListEqual(triangle, generate(1))
