from unittest import TestCase

from exams.exams2.Exam115 import sumDistance


class TestExam(TestCase):

    def test_sum_distance(self):
        self.assertEqual(8, sumDistance([-2, 0, 2], "RLL", 3))
        self.assertEqual(5, sumDistance([1, 0], "RL", 2))
