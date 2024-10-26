from unittest import TestCase

from exams.exams4.Exam310 import maxConsecutiveAnswers


class Test(TestCase):

    def test_max_consecutive_answers(self):
        self.assertEqual(4, maxConsecutiveAnswers("TTFF", 2))
        self.assertEqual(3, maxConsecutiveAnswers("TFFT", 1))
        self.assertEqual(5, maxConsecutiveAnswers("TTFTTFTT", 1))
