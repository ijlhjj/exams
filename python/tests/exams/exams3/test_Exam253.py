from unittest import TestCase

from exams.exams3.Exam253 import findWinners


class Test(TestCase):

    def test_find_winners(self):
        self.assertListEqual([[1, 2, 10], [4, 5, 7, 8]], findWinners(
            [[1, 3], [2, 3], [3, 6], [5, 6], [5, 7], [4, 5], [4, 8], [4, 9], [10, 4], [10, 9]]))
        self.assertListEqual([[1, 2, 5, 6], []], findWinners([[2, 3], [1, 3], [5, 4], [6, 4]]))
