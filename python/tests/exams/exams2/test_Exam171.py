from unittest import TestCase

from exams.exams2.Exam171 import minSum


class TestExam(TestCase):

    def test_min_sum(self):
        self.assertEqual(12, minSum([3, 2, 0, 1, 0], [6, 5, 0]))
        self.assertEqual(-1, minSum([2, 0, 2, 0], [1, 4]))
