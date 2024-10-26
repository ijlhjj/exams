from unittest import TestCase

from exams.exams3.Exam249 import minimumRounds


class Test(TestCase):

    def test_minimum_rounds(self):
        self.assertEqual(4, minimumRounds([2, 2, 3, 3, 2, 4, 4, 4, 4, 4]))
        self.assertEqual(-1, minimumRounds([2, 3, 3]))
