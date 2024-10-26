from unittest import TestCase

from exams.exams1.Exam64 import min_absolute_difference


class TestExam(TestCase):

    def test_min_absolute_difference(self):
        self.assertEqual(0, min_absolute_difference([4, 3, 2, 4], 2))
        self.assertEqual(1, min_absolute_difference([5, 3, 2, 10, 15], 1))
        self.assertEqual(3, min_absolute_difference([1, 2, 3, 4], 3))
