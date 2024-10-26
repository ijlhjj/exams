from unittest import TestCase

from exams.exams1.Exam47 import array_pair_sum


class TestExam(TestCase):

    def test_array_pair_sum(self):
        self.assertEqual(4, array_pair_sum([1, 4, 3, 2]))
        self.assertEqual(9, array_pair_sum([6, 2, 6, 5, 1, 2]))
