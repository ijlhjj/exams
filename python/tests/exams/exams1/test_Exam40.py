from unittest import TestCase

from exams.exams1.Exam40 import set_zeroes


class TestExam(TestCase):

    def test_set_zeroes1(self):
        matrix = [[1, 1, 1], [1, 0, 1], [1, 1, 1]]
        set_zeroes(matrix)
        self.assertListEqual([[1, 0, 1], [0, 0, 0], [1, 0, 1]], matrix)

    def test_set_zeroes2(self):
        matrix = [[0, 1, 2, 0], [3, 4, 5, 2], [1, 3, 1, 5]]
        set_zeroes(matrix)
        self.assertListEqual([[0, 0, 0, 0], [0, 4, 5, 0], [0, 3, 1, 0]], matrix)
