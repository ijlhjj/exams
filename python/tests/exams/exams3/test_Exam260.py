from unittest import TestCase

from exams.exams3.Exam260 import numRescueBoats


class Test(TestCase):

    def test_num_rescue_boats(self):
        self.assertEqual(1, numRescueBoats([1, 2], 3))
        self.assertEqual(3, numRescueBoats([3, 2, 2, 1], 3))
        self.assertEqual(4, numRescueBoats([3, 5, 3, 4], 5))
