from unittest import TestCase

from exams.exams2.Exam174 import minStoneSum
from exams.test_util import read_nums_from_file


class TestExam(TestCase):

    def test_min_stone_sum1(self):
        self.assertEqual(12, minStoneSum([5, 4, 9], 2))
        self.assertEqual(12, minStoneSum([4, 3, 6, 7], 3))

    def test_min_stone_sum2(self):
        nums = read_nums_from_file('resources/exams2_test_Exam174_1.txt')
        self.assertEqual(27613760, minStoneSum(nums, 96193))
