from unittest import TestCase

from exams.exams2.Exam125 import countDigits


class TestExam(TestCase):

    def test_count_digits(self):
        self.assertEqual(1, countDigits(7))
        self.assertEqual(2, countDigits(121))
        self.assertEqual(4, countDigits(1248))
