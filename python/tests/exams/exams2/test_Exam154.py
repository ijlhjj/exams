from unittest import TestCase

from exams.exams2.Exam154 import firstCompleteIndex


class TestExam(TestCase):

    def test_first_complete_index(self):
        self.assertEqual(2, firstCompleteIndex([1, 3, 4, 2], [[1, 4], [2, 3]]))
        self.assertEqual(3, firstCompleteIndex([2, 8, 7, 4, 1, 3, 5, 6, 9], [[3, 2, 5], [1, 4, 6], [8, 7, 9]]))
