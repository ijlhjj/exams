from unittest import TestCase

from exams.exams1.Exam31 import minimum_index


class TestExam(TestCase):

    def test_minimum_index(self):
        self.assertEqual(2, minimum_index([1, 2, 2, 2]))
        self.assertEqual(4, minimum_index([2, 1, 3, 1, 1, 1, 7, 1, 2, 1]))
        self.assertEqual(-1, minimum_index([3, 3, 3, 3, 7, 2, 2]))
