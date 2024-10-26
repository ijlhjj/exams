from unittest import TestCase

from exams.exams1.Exam66 import letter_combinations


class TestExam(TestCase):

    def test_letter_combinations(self):
        self.assertListEqual(["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"], letter_combinations('23'))
        self.assertListEqual([], letter_combinations(''))
        self.assertListEqual(["a", "b", "c"], letter_combinations('2'))
