from unittest import TestCase

from exams.exams2.Exam140 import findKOr


class TestExam(TestCase):

    def test_find_kor(self):
        self.assertEqual(9, findKOr([7, 12, 9, 8, 9, 15], 4))
        self.assertEqual(0, findKOr([2, 12, 1, 11, 4, 5], 6))
        self.assertEqual(15, findKOr([10, 8, 5, 9, 11, 6, 8], 1))
