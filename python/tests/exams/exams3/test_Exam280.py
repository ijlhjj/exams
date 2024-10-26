from unittest import TestCase

from exams.exams3.Exam280 import maxIncreaseKeepingSkyline


class Test(TestCase):

    def test_max_increase_keeping_skyline(self):
        self.assertEqual(35, maxIncreaseKeepingSkyline([[3, 0, 8, 4], [2, 4, 5, 7], [9, 2, 6, 3], [0, 3, 1, 0]]))
        self.assertEqual(0, maxIncreaseKeepingSkyline([[0, 0, 0], [0, 0, 0], [0, 0, 0]]))
