from unittest import TestCase

from exams.exams2.Exam135 import successfulPairs


class TestExam(TestCase):

    def test_successful_pairs(self):
        self.assertLessEqual([4, 0, 3], successfulPairs([5, 1, 3], [1, 2, 3, 4, 5], 7))
        self.assertLessEqual([2, 0, 2], successfulPairs([3, 1, 2], [8, 5, 8], 16))
