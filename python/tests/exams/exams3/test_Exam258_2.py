from unittest import TestCase

from exams.exams3.Exam258_2 import distributeCandies


class Test(TestCase):

    def test_distribute_candies(self):
        self.assertListEqual([1, 2, 3, 1], distributeCandies(7, 4))
        self.assertListEqual([5, 2, 3], distributeCandies(10, 3))
