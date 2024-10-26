from unittest import TestCase

from exams.exams3.Exam300 import maxScore


class Test(TestCase):

    def test_max_score(self):
        self.assertEqual(9, maxScore([[9, 5, 7, 3], [8, 9, 6, 1], [6, 7, 14, 3], [2, 5, 3, 1]]))
        self.assertEqual(-1, maxScore([[4, 3, 2], [3, 2, 1]]))
