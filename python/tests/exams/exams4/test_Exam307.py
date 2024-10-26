from unittest import TestCase

from exams.exams4.Exam307 import sumDigitDifferences


class Test(TestCase):

    def test_sum_digit_differences(self):
        self.assertEqual(4, sumDigitDifferences([13, 23, 12]))
        self.assertEqual(0, sumDigitDifferences([10, 10, 10, 10]))
