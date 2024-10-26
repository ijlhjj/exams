from unittest import TestCase

from exams.exams3.Exam219 import divisibilityArray
from exams.test_util import read_nums_from_file
from exams.test_util import read_str_from_file


class Test(TestCase):

    def test_divisibility_array1(self):
        self.assertListEqual([1, 1, 0, 0, 0, 1, 1, 0, 0], divisibilityArray("998244353", 3))
        self.assertListEqual([0, 1, 0, 1], divisibilityArray("1010", 10))

    def test_divisibility_array2(self):
        word = read_str_from_file('resources/exams3_test_Exam219_1.txt')
        result = read_nums_from_file('resources/exams3_test_Exam219_1_Result.txt')
        self.assertListEqual(result, divisibilityArray(word, 999999958))
